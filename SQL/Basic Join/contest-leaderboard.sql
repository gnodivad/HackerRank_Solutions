SELECT
    MAX(Hackers.hacker_id),
    MAX(Hackers.name),
    SUM(Submissions.score) AS score
FROM Hackers
JOIN Submissions ON Hackers.hacker_id = Submissions.hacker_id
WHERE Submissions.submission_id = (
    SELECT s.submission_id
    FROM Submissions s
    WHERE s.hacker_id = Submissions.hacker_id AND s.challenge_id = Submissions.challenge_id
    ORDER BY score DESC
    limit 1
) AND score != 0
GROUP BY Hackers.hacker_id
ORDER BY score DESC, Hackers.hacker_id;