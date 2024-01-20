use mydb;

create table bankaccount (accno int,lastname varchar(25),firstname varchar(25),bal int);

insert into bank_account values(1,'obama','barack',5000);

insert into bank_account values(2,'donald','trump',4000);

select * from bank_account;

drop table bank_account;
