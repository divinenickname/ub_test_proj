create sequence person_seq start 1 increment 1;
create table person(
    id              int8 not null,
    first_name       varchar(255),
    last_name        varchar(255),
    middle_name      varchar(255),
    age             smallint,
    primary key (id)
)

