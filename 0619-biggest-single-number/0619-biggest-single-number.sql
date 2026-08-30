# Write your MySQL query statement below
select max(num) as num
from
(
    select n.num
    from mynumbers as n
    group by n.num
    having count(n.num)=1
) as temp;