# Write your MySQL query statement below
with tot as (
    select 
        requester_id,
        accepter_id
    from RequestAccepted

    union all

    Select 
        accepter_id,
        requester_id
    from RequestAccepted

),
friend as (
    select
        requester_id as id,
        count(*) as num
    from tot
    group by requester_id
    order by num desc
)

select 
    id,
    num
from(
    select 
        id,
        num,
        rank() over(order by num desc) as rnk
    from friend
)t
where rnk = 1;