WITH daily_check AS (
    SELECT user_id, action_date, action
    FROM activity
    GROUP BY user_id, action_date, action
    HAVING COUNT(*) = 1
),

streaks AS (
    SELECT *,
           DATE_SUB(action_date, 
                    INTERVAL ROW_NUMBER() OVER (
                        PARTITION BY user_id, action 
                        ORDER BY action_date
                    ) DAY) AS grp
    FROM daily_check
),

grouped AS (
    SELECT
        user_id,
        action,
        MIN(action_date) AS start_date,
        MAX(action_date) AS end_date,
        COUNT(*) AS streak_length
    FROM streaks
    GROUP BY user_id, action, grp
    HAVING COUNT(*) >= 5
),

max_streak AS (
    SELECT *,
           ROW_NUMBER() OVER (
               PARTITION BY user_id
               ORDER BY streak_length DESC
           ) AS rn
    FROM grouped
)

SELECT
    user_id,
    action,
    streak_length,
    start_date,
    end_date
FROM max_streak
WHERE rn = 1
ORDER BY streak_length DESC, user_id ASC;