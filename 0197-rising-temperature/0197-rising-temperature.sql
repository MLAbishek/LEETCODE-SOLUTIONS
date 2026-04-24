# Write your MySQL query statement below
select d1.id as Id from Weather as d1 , 
Weather as d2 
where d1.temperature>d2.temperature and 
DATEDIFF(d1.recordDate,d2.recordDate)=1;
