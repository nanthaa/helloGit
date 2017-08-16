/*
SQLyog - Free MySQL GUI v5.19
Host - 5.0.15-nt : Database - sessionpwd_db
*********************************************************************
Server version : 5.0.15-nt
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `sessionpwd_db`;

USE `sessionpwd_db`;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `m_admin` */

DROP TABLE IF EXISTS `m_admin`;

CREATE TABLE `m_admin` (
  `admin_id` int(10) NOT NULL auto_increment,
  `userid` varchar(50) default NULL,
  `password` varchar(50) default NULL,
  `a_name` varchar(50) default NULL,
  `a_city` varchar(50) default NULL,
  `a_cell` int(20) default NULL,
  `a_email` varchar(50) default NULL,
  PRIMARY KEY  (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_admin` */

insert into `m_admin` (`admin_id`,`userid`,`password`,`a_name`,`a_city`,`a_cell`,`a_email`) values (1,'admin','admin','Nitin','Bangalore',2147483647,'nitin@gmail.com');

/*Table structure for table `m_contact` */

DROP TABLE IF EXISTS `m_contact`;

CREATE TABLE `m_contact` (
  `id` int(10) NOT NULL auto_increment,
  `c_name` varchar(50) default NULL,
  `c_id` varchar(50) default NULL,
  `u_userid` varchar(50) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_contact` */

insert into `m_contact` (`id`,`c_name`,`c_id`,`u_userid`) values (4,'sachin','nitin','12');
insert into `m_contact` (`id`,`c_name`,`c_id`,`u_userid`) values (5,'sachin','sachin','12');
insert into `m_contact` (`id`,`c_name`,`c_id`,`u_userid`) values (6,'sachin','vinay','12');
insert into `m_contact` (`id`,`c_name`,`c_id`,`u_userid`) values (7,'Vinay','nitin','13');
insert into `m_contact` (`id`,`c_name`,`c_id`,`u_userid`) values (8,'Vinay','sachin','13');
insert into `m_contact` (`id`,`c_name`,`c_id`,`u_userid`) values (9,'Vinay','vinay','13');
insert into `m_contact` (`id`,`c_name`,`c_id`,`u_userid`) values (10,'Nitin Gudle','nitin','11');
insert into `m_contact` (`id`,`c_name`,`c_id`,`u_userid`) values (11,'sachin','sachin','11');
insert into `m_contact` (`id`,`c_name`,`c_id`,`u_userid`) values (12,'Vinay','vinay','11');

/*Table structure for table `m_trans` */

DROP TABLE IF EXISTS `m_trans`;

CREATE TABLE `m_trans` (
  `t_id` int(10) NOT NULL auto_increment,
  `frm` varchar(50) default NULL,
  `t` varchar(50) default NULL,
  `sub` tinytext,
  `msg` tinytext,
  `dy` varchar(20) default NULL,
  `dte` varchar(20) default NULL,
  `tim` varchar(20) default NULL,
  PRIMARY KEY  (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_trans` */

insert into `m_trans` (`t_id`,`frm`,`t`,`sub`,`msg`,`dy`,`dte`,`tim`) values (3,'nitin','sachin','testing','This is a testing message from nitin to sachin......','TUESDAY','21-02-2012','18:22:55');
insert into `m_trans` (`t_id`,`frm`,`t`,`sub`,`msg`,`dy`,`dte`,`tim`) values (4,'nitin','vinay','testing','This is a testing message from nitin to vinay........','TUESDAY','21-02-2012','18:23:23');
insert into `m_trans` (`t_id`,`frm`,`t`,`sub`,`msg`,`dy`,`dte`,`tim`) values (5,'sachin','nitin','testing','This is a test message from sachin to nitin ....','TUESDAY','21-02-2012','18:41:58');
insert into `m_trans` (`t_id`,`frm`,`t`,`sub`,`msg`,`dy`,`dte`,`tim`) values (6,'sachin','vinay','testing','This is a test message from sachin to vinay.........','TUESDAY','21-02-2012','18:42:21');

/*Table structure for table `m_user` */

DROP TABLE IF EXISTS `m_user`;

CREATE TABLE `m_user` (
  `u_id` int(10) NOT NULL auto_increment,
  `u_userid` varchar(50) default NULL,
  `u_pass` varchar(50) default NULL,
  `u_name` varchar(50) default NULL,
  `img_value` varchar(50) default NULL,
  `u_city` varchar(50) default NULL,
  `u_state` varchar(50) default NULL,
  `u_cell` decimal(50,0) default NULL,
  `u_email` varchar(50) default NULL,
  `sessionPass` int(10) default NULL,
  PRIMARY KEY  (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_user` */

insert into `m_user` (`u_id`,`u_userid`,`u_pass`,`u_name`,`img_value`,`u_city`,`u_state`,`u_cell`,`u_email`,`sessionPass`) values (11,'nitin','nitin','Nitin Gudle','1234','Bangalore','karnataka','2147483647','nitin@celestialv.com',82);
insert into `m_user` (`u_id`,`u_userid`,`u_pass`,`u_name`,`img_value`,`u_city`,`u_state`,`u_cell`,`u_email`,`sessionPass`) values (12,'sachin','sachin','sachin','3421','Bengaluru','karnataka','2147483647','nitin@gmail.com',16);
insert into `m_user` (`u_id`,`u_userid`,`u_pass`,`u_name`,`img_value`,`u_city`,`u_state`,`u_cell`,`u_email`,`sessionPass`) values (13,'vinay','vinay','Vinay','1234','Bangalore','karnataka','2147483647','vinay@celestial.com',40);
insert into `m_user` (`u_id`,`u_userid`,`u_pass`,`u_name`,`img_value`,`u_city`,`u_state`,`u_cell`,`u_email`,`sessionPass`) values (14,'user1','user1','user1','1234','Bangalore','karnataka','2147483647','nitin@celestialv.com',NULL);
insert into `m_user` (`u_id`,`u_userid`,`u_pass`,`u_name`,`img_value`,`u_city`,`u_state`,`u_cell`,`u_email`,`sessionPass`) values (15,'user2','user2','user2','1234','Bangalore','karnataka','2147483647','nitin@gmail.com',34);

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
