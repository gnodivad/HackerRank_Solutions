SELECT MIN(w.id), MIN(wp.age), MIN(w.coins_needed), MIN(w.power)
FROM Wands AS w
LEFT JOIN Wands_Property AS wp ON w.code = wp.code
WHERE
    wp.is_evil = 0 AND
    w.coins_needed=
    (
        SELECT MIN(Wands.coins_needed) 
        FROM Wands 
        INNER JOIN Wands_Property ON Wands.code = Wands_Property.code 
        WHERE Wands_Property.age = wp.age AND Wands.power = w.power
    ) 
GROUP BY wp.age, w.Power
ORDER BY w.power DESC, wp.age DESC;