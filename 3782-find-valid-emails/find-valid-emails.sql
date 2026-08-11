# Write your MySQL query statement below
select u.user_id , u.email
from users u
where email regexp '^[A-Za-z0-9_]+@[A-Za-z]+\\.com$'
order by user_id;