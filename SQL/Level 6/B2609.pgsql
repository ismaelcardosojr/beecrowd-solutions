/*
As usual the sales industry is doing an analysis of how many products we have in stock, and you can help them.

Then your job will display the name and amount of products of each category.
*/

SELECT c.name, SUM(amount)
FROM categories c INNER JOIN products p ON c.id = p.id_categories
GROUP BY c.name;