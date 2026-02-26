WITH RECURSIVE hierarchy AS (
    -- Step 1: Build tree with level
    SELECT 
        employee_id,
        employee_name,
        manager_id,
        salary,
        1 AS level
    FROM Employees
    WHERE manager_id IS NULL
    
    UNION ALL
    
    SELECT 
        e.employee_id,
        e.employee_name,
        e.manager_id,
        e.salary,
        h.level + 1
    FROM Employees e
    JOIN hierarchy h
        ON e.manager_id = h.employee_id
),

subtree AS (
    -- Step 2: Get all descendant relationships
    SELECT 
        e.employee_id AS manager_id,
        e.employee_id AS employee_id
    FROM Employees e
    
    UNION ALL
    
    SELECT 
        s.manager_id,
        e.employee_id
    FROM subtree s
    JOIN Employees e
        ON e.manager_id = s.employee_id
)

SELECT
    h.employee_id,
    h.employee_name,
    h.level,
    COUNT(s.employee_id) - 1 AS team_size,
    SUM(e.salary) AS budget
FROM hierarchy h
JOIN subtree s
    ON h.employee_id = s.manager_id
JOIN Employees e
    ON s.employee_id = e.employee_id
GROUP BY h.employee_id, h.employee_name, h.level
ORDER BY 
    h.level ASC,
    budget DESC,
    h.employee_name ASC;