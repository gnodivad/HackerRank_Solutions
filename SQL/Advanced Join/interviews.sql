SELECT 
    c.contest_id, 
    c.hacker_id, 
    c.name, 
    SUM(s.total_submissions), 
    SUM(s.total_accepted_submissions), 
    SUM(v.total_views), 
    SUM(v.total_unique_views)
FROM Contests c
JOIN Colleges co ON c.contest_id = co.contest_id
JOIN Challenges ch ON co.college_id = ch.college_id
LEFT JOIN (
    SELECT 
    challenge_id, 
    SUM(total_views) AS total_views, 
    SUM(total_unique_views) AS total_unique_views
    FROM View_Stats
    GROUP BY challenge_id
) v ON ch.challenge_id = v.challenge_id
LEFT JOIN (
    SELECT
    challenge_id,
    SUM(total_submissions) AS total_submissions,
    SUM(total_accepted_submissions) AS total_accepted_submissions
    FROM Submission_Stats
    GROUP BY challenge_id
) s ON ch.challenge_id = s.challenge_id
GROUP BY c.contest_id, c.hacker_id, c.name
HAVING 
    SUM(total_submissions) != 0 OR 
    SUM(total_accepted_submissions) != 0 OR
    SUM(total_views) != 0 OR
    SUM(total_unique_views) != 0
ORDER BY c.contest_id;