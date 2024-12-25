drop table if exists test;
use test;

create table city (
    id int auto_increment primary key,
    name    varchar(100) null,
    state   varchar(100) null,
    country varchar(200) null
);

INSERT INTO city (id, name, state, country) VALUES (1, 'tom', 'CA', 'beijing');
INSERT INTO city (id, name, state, country) VALUES (2, 'jerry', 'CA', 'shanghai');
INSERT INTO city (id, name, state, country) VALUES (3, 'spike', 'CA', 'qingdao');
INSERT INTO city (id, name, state, country) VALUES (4, 'tyke', 'CA', 'shenzhen');

