select * from product;

DELIMITER //

CREATE PROCEDURE GetAllProducts()
BEGIN
	SELECT *  FROM product;
END //


DELIMITER //

CREATE PROCEDURE GetAllProductsByPrice(IN price_in decimal)
BEGIN
	SELECT *  FROM product where price>price_in;
END //

DELIMITER //

CREATE PROCEDURE GetAllProductsCountByPrice(IN price_in decimal)
BEGIN
	SELECT count(*)  FROM product where price>price_in;
END //

drop procedure GetAllProducts;
drop procedure GetAllProductsByPrice;
drop procedure GetAllProductsCountByPrice;
