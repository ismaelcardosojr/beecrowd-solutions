/*
The video store is making its semi-annual report and needs your help. All you have to do is select the name of the clients and the date 
of rental, from the rentals made in September 2016.
*/

SELECT c.name, r.rentals_date
FROM customers c INNER JOIN rentals r ON r.id_customers = c.id
WHERE 
    r.rentals_date >= '2016-09-1' AND
    r.rentals_date <= '2016-09-30';