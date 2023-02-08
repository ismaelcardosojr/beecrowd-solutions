/*
A video store contractor hired her services to catalog her movies. They need you to select the code and the name of the movies whose 
description of the genre is 'Action'.
*/

SELECT m.id, m.name
FROM movies m INNER JOIN genres g ON m.id_genres = g.id
WHERE g.description = 'Action';