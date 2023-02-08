/*
Richard is a famous scientist because of his multiverse theory, where he describes every hypothetical set of parallel universes by means of a database. Thanks to 
that you now have a job...

As your first task, you must select every Richard from dimensions C875 and C774, together with its existence probability (the famous factor N) 
with three decimal places of precision.

Remember that the N factor is calculated by multiplying the omega value by 1,618. The data must be sorted by the least omega value.
*/

SELECT lr.name, ROUND((lr.omega * 1.618), 3) as "The N Factor"
FROM life_registry lr INNER JOIN dimensions d ON d.id = lr.dimensions_id
WHERE 
    d.name IN ('C774', 'C875') AND
    lr.name LIKE 'Richard%'
ORDER BY lr.omega;