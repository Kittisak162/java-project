# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table car (
  id                            bigint auto_increment not null,
  type                          varchar(255),
  path                          varchar(255),
  brandth                       varchar(255),
  branden                       varchar(255),
  name                          varchar(255),
  typecar                       varchar(255),
  color                         varchar(255),
  year                          integer not null,
  price                         double not null,
  desc                          varchar(255),
  vote                          integer not null,
  constraint pk_car primary key (id)
);

create table company (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_company primary key (id)
);

create table computer (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  introduced                    timestamp,
  discontinued                  timestamp,
  company_id                    bigint,
  constraint pk_computer primary key (id)
);

alter table computer add constraint fk_computer_company_id foreign key (company_id) references company (id) on delete restrict on update restrict;
create index ix_computer_company_id on computer (company_id);


# --- !Downs

alter table computer drop constraint if exists fk_computer_company_id;
drop index if exists ix_computer_company_id;

drop table if exists car;

drop table if exists company;

drop table if exists computer;

