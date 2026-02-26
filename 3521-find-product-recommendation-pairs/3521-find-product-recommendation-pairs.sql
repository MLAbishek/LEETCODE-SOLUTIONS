WITH pairs AS (
    SELECT
        p1.user_id,
        p1.product_id AS product1_id,
        p2.product_id AS product2_id
    FROM ProductPurchases p1
    JOIN ProductPurchases p2
        ON p1.user_id = p2.user_id
       AND p1.product_id < p2.product_id
)

SELECT
    pr.product1_id,
    pr.product2_id,
    pi1.category AS product1_category,
    pi2.category AS product2_category,
    COUNT(DISTINCT pr.user_id) AS customer_count
FROM pairs pr
JOIN ProductInfo pi1
    ON pr.product1_id = pi1.product_id
JOIN ProductInfo pi2
    ON pr.product2_id = pi2.product_id
GROUP BY
    pr.product1_id,
    pr.product2_id,
    pi1.category,
    pi2.category
HAVING COUNT(DISTINCT pr.user_id) >= 3
ORDER BY
    customer_count DESC,
    pr.product1_id ASC,
    pr.product2_id ASC;