-- create schema Jaegers
CREATE SCHEMA jaegers AUTHORIZATION postgres;

-- create table jaegers
CREATE TABLE jaegers.jaegers
(
    id          int         NOT NULL,
    "modelName" varchar(30) NOT NULL,
    mark        varchar(20),
    height      real,
    weight      real,
    status      varchar(20),
    origin      varchar(20),
    launch      date,
    "kaijuKill" int,

    CONSTRAINT jaegers_pkey PRIMARY KEY (id) USING INDEX TABLESPACE jaegers
)
    WITH (
        OIDS = FALSE
    )
    TABLESPACE jaegers;

ALTER TABLE jaegers.jaegers
    OWNER to postgres;
/* the end of creating */

-- insert values for table jaeger

insert into jaegers.jaegers
values (
        1,
        'Tacit Ronin',
        'Mark-1',
        74.37,
        7.45,
        'Destroyed',
        'Japan',
        to_date('December 6, 2015', 'Month DD, YYYY'),
        3
       );
insert into jaegers.jaegers
values (
        2,
        'Striker Eureka',
        'Mark-5',
        76.2,
        1.85,
        'Destroyed',
        'Australia',
        to_date('November 2, 2019', 'Month DD, YYYY'),
        11
       );

insert into jaegers.jaegers
values (
        3,
        'Horizon Brave',
        'Mark-1',
        72.54,
        7.89,
        'Destroyed',
        'China',
        to_date('December 22, 2015', 'Month DD, YYYY'),
        2
       );

insert into jaegers.jaegers
values (
        4,
        'Gipsy Danger',
        'Mark-3',
        79.25,
        1.98,
        'Destroyed',
        'South Korea',
        to_date('June 16, 2017', 'Month DD, YYYY'),
        9
       );

insert into jaegers.jaegers
values (
        5,
        'Nova Hyperion',
        'Mark-4',
        74.45,
        2.34,
        'Alive',
        'USA',
        to_date('July 10, 2017', 'Month DD, YYYY'),
        13
       );



