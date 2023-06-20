-- # https://www.hackerrank.com/challenges/earnings-of-employees/problem
-- # Score : 20

select (salary*months) as earnings,count(*) from employee
group by earnings
order by earnings desc
LIMIT 1;