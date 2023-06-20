-- # https://www.hackerrank.com/challenges/more-than-75-marks/problem
-- # Score : 15

SELECT NAME
 FROM STUDENTS
 WHERE MARKS > 75
ORDER BY SUBSTR(NAME,LENGTH(NAME)-2,3),ID ASC;