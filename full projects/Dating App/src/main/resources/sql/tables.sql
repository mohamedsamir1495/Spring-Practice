create database datingdb;

use datingdb;

create table user_account
(
    id           int AUTO_INCREMENT PRIMARY KEY,
    user_name    varchar(20),
    password     varchar(20),
    age          int,
    email        varchar(40),
    gender       varchar(10),
    phone_number varchar(10),
    city         varchar(20),
    country      varchar(20)
);

create table interest
(
    id          int AUTO_INCREMENT PRIMARY KEY,
    likes       varchar(100),
    dislikes    varchar(100),
    hobbies     varchar(100),
    profile_url varchar(60),
    about       varchar(200),
    user_id     int,
    FOREIGN KEY (user_id)
        REFERENCES user_account (id)
);
