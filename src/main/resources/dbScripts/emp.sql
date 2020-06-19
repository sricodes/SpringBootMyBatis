create database fc;
use fc ;

create table employees
(
   id integer not null,
   name varchar(255) not null,
   gender varchar(255) ,
   salary DOUBLE(40,2) not null,
   email_address varchar(255) not null,
   primary key(id)
);

ALTER TABLE `fc`.`employees`
CHANGE COLUMN `id` `id` INT(11) NOT NULL AUTO_INCREMENT ;


/* sample insert

 INSERT INTO `fc`.`employees`

     (
     `name`,
     `gender`,
     `salary`,
     `email_address`)
     VALUES
     (
     'ravi',
     'Male',
     100.70,
     'ravi@example.com');
     */