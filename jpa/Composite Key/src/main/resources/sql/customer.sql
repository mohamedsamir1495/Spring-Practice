use mydb;

CREATE TABLE customer_composite_key (
    id int NOT NULL ,
    email varchar(255) NOT NULL,
    name varchar(255) NOT NULL,
    PRIMARY KEY (id,email)
);

select * from customer_composite_key;


drop table customer_composite_key;
