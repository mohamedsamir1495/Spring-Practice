use mydb;

create table payment
(
    id     int PRIMARY KEY AUTO_INCREMENT,
    amount decimal(8, 3)
);

create table card
(
    id         int,
    cardnumber varchar(20),
    FOREIGN KEY (id) REFERENCES payment (id)
);

create table bankcheck
(
    id          int,
    checknumber varchar(20),
    FOREIGN KEY (id) REFERENCES payment (id)
);
