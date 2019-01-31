SELECT id, name
FROM (
    SELECT 
        MAX(HACKERS.hacker_id) AS id,
        MAX(HACKERS.name) AS name,
        COUNT(HACKERS.hacker_id) AS total
    FROM SUBMISSIONS
    JOIN HACKERS ON SUBMISSIONS.hacker_id = HACKERS.hacker_id
    JOIN CHALLENGES ON SUBMISSIONS.challenge_id = CHALLENGES.challenge_id
    JOIN DIFFICULTY 
        ON SUBMISSIONS.score = DIFFICULTY.score 
        AND CHALLENGES.difficulty_level = DIFFICULTY.difficulty_level
    GROUP BY HACKERS.hacker_id
) AS result
WHERE total > 1
ORDER BY total DESC, id;