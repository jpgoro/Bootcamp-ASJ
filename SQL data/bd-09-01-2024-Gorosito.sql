--Ordenes(numero, fecha, total) cuyo precio total sea mayor al precio promedio de los productos

SELECT o.number_order AS 'Numero Orden', o.date AS 'Fecha', o.total AS 'Total'
FROM orders o
WHERE o.total > (
    SELECT AVG(pr.sale_price)
    FROM products pr
);



select * from orders


SELECT p.title, p.description, p.sale_price,
	CASE  p.id_type
		WHEN 1 THEN 'MUSICA'
		WHEN 2 THEN 'PELICULA'
		WHEN 3 THEN 'SERIE'
	END AS tipo
from products p