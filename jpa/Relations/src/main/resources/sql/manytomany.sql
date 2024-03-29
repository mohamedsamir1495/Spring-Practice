use mydb

create table programmer
(
    id     int PRIMARY KEY AUTO_INCREMENT,
    name   varchar(20),
    salary int
);

create table project
(
    id   int PRIMARY KEY AUTO_INCREMENT,
    name varchar(20)
);

create table programmers_projects
(
    programmer_id int,
    project_id    int,
    FOREIGN KEY (programmer_id) REFERENCES programmer (id),
    FOREIGN KEY (project_id) REFERENCES project (id)
);

select *
from programmer;

select *
from project;

select *
from programmers_projects
