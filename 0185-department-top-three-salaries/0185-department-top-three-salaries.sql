# Write your MySQL query statement below
with tot as (
    select 
        d.name as Department,
        e.name as Employee,
        e.salary as Salary
    from Employee as e
        join
    Department as d 
    on
    e.departmentId = d.id
)

select
    Department,
    Employee,
    Salary
from
(
    select 
        Department,
        Employee,
        Salary,
        dense_rank() over(partition by Department order by salary desc) as rnk
    from tot

) t
where rnk<=3;
