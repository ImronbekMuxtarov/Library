drop table if exists categories;
create table categories(
    id int generated always as identity primary key,
    name varchar unique
);