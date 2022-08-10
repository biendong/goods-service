CREATE TABLE IF NOT EXISTS `good` (
    id INT PRIMARY key AUTO_INCREMENT,
    product_code VARCHAR(250) NULL,
    product_name VARCHAR(250) NULL,
    product_description VARCHAR(250) NULL,
    unit_id INT NULL
);