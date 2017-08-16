/*
SQLyog - Free MySQL GUI v5.19
Host - 5.0.15-nt : Database - db_pilotproject
*********************************************************************
Server version : 5.0.15-nt
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `db_pilotproject`;

USE `db_pilotproject`;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `m_admin` */

DROP TABLE IF EXISTS `m_admin`;

CREATE TABLE `m_admin` (
  `Admin_Id` char(30) NOT NULL,
  `Admin_Pass` char(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_admin` */

insert into `m_admin` (`Admin_Id`,`Admin_Pass`) values ('admin','admin');

/*Table structure for table `m_dept` */

DROP TABLE IF EXISTS `m_dept`;

CREATE TABLE `m_dept` (
  `Dept_No` int(5) NOT NULL,
  `Dept_Name` char(50) default NULL,
  PRIMARY KEY  (`Dept_No`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_dept` */

insert into `m_dept` (`Dept_No`,`Dept_Name`) values (10,'sales');
insert into `m_dept` (`Dept_No`,`Dept_Name`) values (12,'manufacture');

/*Table structure for table `m_employee` */

DROP TABLE IF EXISTS `m_employee`;

CREATE TABLE `m_employee` (
  `Emp_No` int(5) NOT NULL,
  `Emp_Name` char(30) default NULL,
  `Dept_No` int(5) default NULL,
  `Salary` decimal(8,2) default NULL,
  PRIMARY KEY  (`Emp_No`),
  KEY `FK_m_employee` (`Dept_No`),
  CONSTRAINT `m_employee_ibfk_1` FOREIGN KEY (`Dept_No`) REFERENCES `m_dept` (`Dept_No`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_employee` */

insert into `m_employee` (`Emp_No`,`Emp_Name`,`Dept_No`,`Salary`) values (1001,'Balaji',12,'6000.00');
insert into `m_employee` (`Emp_No`,`Emp_Name`,`Dept_No`,`Salary`) values (2323,'Raja',10,'4777.00');
insert into `m_employee` (`Emp_No`,`Emp_Name`,`Dept_No`,`Salary`) values (4444,'b',10,'20000.00');
insert into `m_employee` (`Emp_No`,`Emp_Name`,`Dept_No`,`Salary`) values (111111,'vinay',10,'20000.00');

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
