create table my_entity
(
    id          uuid   not null,
    version     bigint not null,
    tags        text[] not null,
    constraint pk_my_entity primary key (id)
);
