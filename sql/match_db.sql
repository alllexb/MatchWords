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
-- Table structure for table `word_pairs_tb`
--

DROP TABLE IF EXISTS `word_pairs_tb`;

CREATE TABLE IF NOT EXISTS `word_pairs_tb` (
  `id` INT NOT NULL,
  `first_word` VARCHAR(50) NOT NULL,
  `second_word` VARCHAR(50) NOT NULL,
  `category` VARCHAR(50) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for tables `users_tb`, `word_pairs_tb`
--

INSERT INTO users_tb VALUES (1,'Alexander','Bogomolnyy','allexb','allexb@list.ru','root','2015-12-17 16:48:00'),
(2,'Jone','Dou','joneD','post@find.me','pass','2015-12-17 17:12:33'),
(3,'Sasha','Grey','shuro4ka','post@hub.com','comein','2015-12-17 17:13:45'),
(4,'Jane','Smith','Mrs.Smith','mrs.smith@killyou.com','catchme','2015-12-17 17:58:28'),
(5,'John','Smith','Mr.Smith','mr.smith@killyou.com','iamhere','2015-12-17 17:59:14');

INSERT INTO word_pairs_tb VALUES (1, 'table', 'стол', 'room'),
(2, 'chair', 'стул', 'room'),
(3, 'bed', 'кровать', 'room'),
(4, 'lamp', 'лампа', 'room'),
(5, 'shelf', 'полка', 'room'),
(6, 'cupboard', 'шкаф', 'room'),
(7, 'carpet', 'ковер', 'room'),
(8, 'wallpaper', 'обои', 'room'),
(9, 'curtain', 'штора', 'room'),
(10, 'window', 'окно', 'room'),
(11, 'door', 'дверь', 'room'),
(12, 'mirror', 'зеркало', 'room'),
(13, 'blanket', 'одеяло', 'room'),
(14, 'pillow', 'подушка', 'room'),
(15, 'bedsheet', 'простыня', 'room');

INSERT INTO word_pairs_tb VALUES (16, 'violin', 'скрипка', 'music'),
(17, 'guitar', 'гитара', 'music'),
(18, 'flute', 'флейта', 'music');


-- Dump completed on 2015-12-17 19:29:09
