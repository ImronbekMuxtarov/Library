drop table if exists authors;
create table authors(
    id int generated always as identity primary key,
    name varchar,
    address varchar
);