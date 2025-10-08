drop table if exists students;

CREATE TABLE students (
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
	nom VARCHAR(100) NOT NULL,
	cognom VARCHAR(100) DEFAULT NULL,
	age INT DEFAULT 0,
	cicle VARCHAR(100) NOT NULL,
	anyo INT DEFAULT 0
);

-- DROP TABLE IF EXISTS customers;

-- CREATE TABLE customers (
--     id BIGINT AUTO_INCREMENT PRIMARY KEY,
--     name VARCHAR(100) NOT NULL,
--     age INT DEFAULT 0
-- );
