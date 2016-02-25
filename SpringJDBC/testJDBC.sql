create database if not exists testJDBC;
use testJDBC;

drop table if exists Student;
drop table if exists Teacher;


CREATE  TABLE `testjdbc`.`students` (
`id` INT NOT NULL AUTO_INCREMENT ,
`pib` VARCHAR(100) NOT NULL ,
`course` INT NULL ,
PRIMARY KEY (`id`) );