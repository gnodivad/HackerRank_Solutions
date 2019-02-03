SELECT MAX(h.hacker_id), MAX(h.name), COUNT(h.hacker_id) AS total_challenges
FROM Hackers h
JOIN Challenges c ON h.hacker_id = c.hacker_id
GROUP BY h.hacker_id
HAVING
    total_challenges = (
        SELECT COUNT(ch.hacker_id)
        FROM Challenges ch
        GROUP BY ch.hacker_id
        ORDER BY COUNT(ch.hacker_id) DESC
        LIMIT 1
    ) OR
    h.hacker_id in (
        SELECT MAX(result.hacker_id)
        FROM (
            SELECT ch.hacker_id, COUNT(ch.hacker_id) AS t_c
            FROM Challenges ch
            GROUP BY ch.hacker_id
        ) result
        GROUP BY result.t_c
        HAVING COUNT(result.t_c) = 1
    )
ORDER BY total_challenges DESC, h.hacker_id;