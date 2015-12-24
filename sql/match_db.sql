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
  `category_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`category_id`) REFERENCES `word_pairs_category_tb`(`id`))
ENGINE = InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for tables `users_tb`
--

INSERT INTO users_tb VALUES (1,'Alexander','Bogomolnyy','allexb','allexb@list.ru','root','2015-12-17 16:48:00'),
(2,'Jone','Dou','joneD','post@find.me','pass','2015-12-17 17:12:33'),
(3,'Sasha','Grey','shuro4ka','post@hub.com','comein','2015-12-17 17:13:45'),
(4,'Jane','Smith','Mrs.Smith','mrs.smith@killyou.com','catchme','2015-12-17 17:58:28'),
(5,'John','Smith','Mr.Smith','mr.smith@killyou.com','iamhere','2015-12-17 17:59:14');

--
-- Table structure for table `word_pairs_category_tb`
--

CREATE TABLE word_pairs_category_tb (
`id` INT NOT NULL,
`title` VARCHAR(60) NOT NULL,
`description` VARCHAR(1024),
PRIMARY KEY (`id`))
ENGINE = InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for tables `word_pairs_category_tb`
--

INSERT INTO `word_pairs_category_tb` VALUES (1, 'room', 'All about things in the room.'),
(2, 'music', 'Music instruments and all about music things.');

--
-- Dumping data for tables `word_pairs_tb`
--

INSERT INTO word_pairs_tb VALUES (1, 'table', 'стол', 1),
(2, 'chair', 'стул', 1),
(3, 'bed', 'кровать', 1),
(4, 'lamp', 'лампа', 1),
(5, 'shelf', 'полка', 1),
(6, 'cupboard', 'шкаф', 1),
(7, 'carpet', 'ковер', 1),
(8, 'wallpaper', 'обои', 1),
(9, 'curtain', 'штора', 1),
(10, 'window', 'окно', 1),
(11, 'door', 'дверь', 1),
(12, 'mirror', 'зеркало', 1),
(13, 'blanket', 'одеяло', 1),
(14, 'pillow', 'подушка', 1),
(15, 'bedsheet', 'простыня', 1);

INSERT INTO word_pairs_tb VALUES (16, 'violin', 'скрипка', 2),
(17, 'guitar', 'гитара', 2),
(18, 'flute', 'флейта', 2);

-- Dump completed on 2015-12-24 19:10:39