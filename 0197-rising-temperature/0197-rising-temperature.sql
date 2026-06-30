# Write your MySQL query statement below
select d1.id from
Weather as d1
where d1.temperature>(
    select d2.temperature from
    Weather as d2
    where datediff(d1.recordDate,d2.recordDate)=1
);