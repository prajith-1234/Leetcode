# Write your MySQL query statement below
select w.id 
from weather w
left join weather r
on datediff(w.recorddate , r.recorddate)  = 1
where w.temperature > r.temperature;