-- MySQL dump 10.13  Distrib 5.6.28, for Win64 (x86_64)
--
-- Host: localhost    Database: match_db
-- ------------------------------------------------------
-- Server version	5.6.28-log

--
-- Table structure for table `users_tb`
--

DROP TABLE IF EXISTS `users_tb`;

CREATE TABLE `users_tb` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `last_name` varchar(100) DEFAULT NULL,
  `nick_name` varchar(50) NOT NULL,
  `email_address` varchar(100) NOT NULL,
  `password` varchar(50) NOT NULL,
  `registration_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `users_tb`
--

LOCK TABLES `users_tb` WRITE;

INSERT INTO `users_tb` VALUES (1,'Alexander','Bogomolnyy','allexb','allexb@list.ru','root','2015-12-17 16:48:00'),
(2,'Jone','Dou','joneD','post@find.me','pass','2015-12-17 17:12:33'),
(3,'Sasha','Grey','shuro4ka','post@hub.com','comein','2015-12-17 17:13:45'),
(4,'Jane','Smith','Mrs.Smith','mrs.smith@killyou.com','catchme','2015-12-17 17:58:28'),
(5,'John','Smith','Mr.Smith','mr.smith@killyou.com','iamhere','2015-12-17 17:59:14');

UNLOCK TABLES;

-- Dump completed on 2015-12-17 19:29:09
