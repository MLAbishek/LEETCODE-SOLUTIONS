SELECT name
FROM Customer
WHERE id IN (
    SELECT id
    FROM Customer
    WHERE referee_id IS NULL
       OR referee_id <> 2
);