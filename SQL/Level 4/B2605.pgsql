/*
The financial sector needs a report on the providers of the products we sell. The reports include all categories, but for some reason, 
providers of products whose category is the executive, are not in the report.

Your job is to return the names of the products and providers whose category ID is 6.
*/

SELECT products.name, providers.name
FROM products, providers
WHERE 
    id_categories = 6 AND 
    products.id_providers = providers.id;