/*
The Mars Technology University has Open Positions for researchers. However, the computer responsible for processing the candidates' data is 
broken. You must present the candidate list, containing the name and final score (with two decimal places of precision) of each candidate. 
Remember to show the list ordered by score (highest first).

The score is given by the weighted average described as:

avg = ((math * 2) + (specific * 3) + (project_plan * 5)) / 10
*/

SELECT c.name, (((s.math * 2) + (s.specific * 3) + (s.project_plan * 5)) / 10)::NUMERIC(10,2) as avg
FROM candidate c INNER JOIN score s ON s.candidate_id = c.id