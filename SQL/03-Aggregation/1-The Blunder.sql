-- # https://www.hackerrank.com/challenges/the-blunder/problem
-- # Score : 15

select ceil(avg(salary) - avg(replace(salary,'0',''))) as avg_salary
from employees;