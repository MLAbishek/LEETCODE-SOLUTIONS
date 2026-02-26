SELECT 
    t.id,
    CASE
        WHEN t.p_id IS NULL THEN 'Root'
        WHEN t.id NOT IN (SELECT DISTINCT p_id 
                          FROM Tree 
                          WHERE p_id IS NOT NULL)
             THEN 'Leaf'
        ELSE 'Inner'
    END AS type
FROM Tree t;