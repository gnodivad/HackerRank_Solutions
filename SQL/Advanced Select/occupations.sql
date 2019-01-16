SET @r1 = 0, @r2 = 0, @r3 = 0, @r4 = 0;
SELECT MIN(Doctor), MIN(Professor), MIN(Singer), MIN(Actor)
FROM (
    SELECT CASE OCCUPATION
        WHEN "Doctor" THEN @r1 := @r1 + 1
        WHEN "Professor" THEN @r2 := @r2 + 1
        WHEN "Singer" THEN @r3 := @r3 + 1
        WHEN "Actor" THEN @r4 := @r4 + 1
        END AS RowNumber,
        CASE WHEN OCCUPATION="Doctor" THEN NAME END AS Doctor,
        CASE WHEN OCCUPATION="Professor" THEN NAME END AS Professor,
        CASE WHEN OCCUPATION="Singer" THEN NAME END AS Singer,
        CASE WHEN OCCUPATION="Actor" THEN NAME END AS Actor
    FROM OCCUPATIONS
    ORDER BY NAME
) AS TEMP
GROUP BY RowNumber;