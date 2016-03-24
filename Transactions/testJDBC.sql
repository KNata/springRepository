create database if not exists testJDBC;
use testJDBC;

drop table if exists Students;
drop table if exists Teachers;


CREATE  TABLE `testjdbc`.`Students` (
`id` INT NOT NULL AUTO_INCREMENT ,
`name` VARCHAR(100) NOT NULL ,
`pib` VARCHAR(100) NOT NULL ,
`course` INT NULL ,
PRIMARY KEY (`id`) );


CREATE  TABLE `testjdbc`.`Teachers` (
`id` INT NOT NULL AUTO_INCREMENT ,
`name` VARCHAR(100) NOT NULL ,
`cellphone` VARCHAR(100) NOT NULL ,
PRIMARY KEY (`id`) );