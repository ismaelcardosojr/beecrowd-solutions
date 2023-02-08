/*
The sales industry needs a report to know what products are left in stock.

To help the sales industry, display the product name and category name for products whose amount is greater than 100 and the category ID is 
1,2,3,6 or 9. Show the results in ascendent order by category ID.
*/

SELECT pd.name, ct.name
FROM products pd INNER JOIN categories ct ON pd.id_categories = ct.id
WHERE
    pd.amount > 100 AND
    pd.id_categories IN (1, 2, 3, 6, 9);