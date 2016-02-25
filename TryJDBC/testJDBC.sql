create database if not exists testJDBC;
use testJDBC;

drop table if exists Student;
drop table if exists Teacher;

create table Student
(
  id int not null auto_increment,
  pib varchar (100) not null,
  course int not null,
  constraint Student primary key (id)
);

create table Teacher
(
  teacherId int not null auto_increment,
  firstname varchar (100) not null,
  lastname varchar (100) not null,
  birthday date,
  cell_phone  varchar(20),
  constraint Teacher primary key (teacherId)
);
