# Write your MySQL query statement below
select e.employee_id
from employees e
left join salaries n 
on e.employee_id = n.employee_id
where n.employee_id is null
union 
select e.employee_id
from salaries e
left join employees n 
on e.employee_id = n.employee_id
where n.employee_id is null
order by employee_id asc;
 
