drop table if exists topics;
drop table if exists users;
drop table if exists employee_table;

create table topics (
    topic_id SERIAL,
    category varchar(100) not null,
    title varchar(100) not null,
    primary key (topic_id)
);

 create table users (
    username varchar(50) not null,
    country varchar(30),
    enabled smallint,
    full_name varchar(100),
    password varchar(800) not null,
    role varchar(50),
    primary key (username)
);

-- create table employee_table (
--        employee_id SERIAL,
--        email varchar(255),
--        employee_name varchar(255),
--        salary double precision,
--        primary key (employee_id)
--    );