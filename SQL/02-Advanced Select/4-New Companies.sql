-- # https://www.hackerrank.com/challenges/the-company/problem
-- # Score : 30

SELECT c.company_code,c.founder,COUNT(distinct lm.lead_manager_code),COUNT(distinct sm.senior_manager_code),COUNT(distinct m.manager_code),COUNT(distinct e.employee_code)
FROM Company c,Lead_manager lm,Senior_Manager sm,Manager m,Employee e
where c.company_code = lm.company_code
    and lm.lead_manager_code = sm.lead_manager_code
    and sm.lead_manager_code = m.lead_manager_code
    and m.manager_code = e.manager_code
group by c.company_code,c.founder
order by c.company_code;