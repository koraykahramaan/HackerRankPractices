-- # https://www.hackerrank.com/challenges/weather-observation-station-18/problem
-- # Score : 25

SELECT ROUND(
				ABS(MIN(LAT_N) - MAX(LAT_N)) +
				ABS(MIN(LONG_W) - MAX(LONG_W)),4)
FROM STATION as manhattan_distance;
