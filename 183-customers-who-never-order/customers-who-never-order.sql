# Write your MySQL query statement below
select name as Customers
from customers c
left join orders b
on c.id = b.customerid
where b.id is null;