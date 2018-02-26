-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: localhost    Database: coding_school
-- ------------------------------------------------------
-- Server version	5.7.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `students` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(20) NOT NULL,
  `age` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1,'Ivan',28),(2,'Johny',24),(3,'Johnson',25),(4,'Johnas',26),(5,'Joseph',27);
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teachers`
--

DROP TABLE IF EXISTS `teachers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teachers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  `age` int(10) unsigned DEFAULT NULL,
  `subject` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teachers`
--

LOCK TABLES `teachers` WRITE;
/*!40000 ALTER TABLE `teachers` DISABLE KEYS */;
INSERT INTO `teachers` VALUES (1,'Adam','Bauer',34,'Math'),(2,'Alphonse','Birch',35,'Java'),(3,'Arthur','Bauman',36,'Spanish'),(4,'Andy','Anderson',37,'Biology'),(5,'Anthony','Arbald',37,'Literature'),(6,'Efrain','Chavez Cortes',61,'Computer Science');
/*!40000 ALTER TABLE `teachers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teachers_students`
--

DROP TABLE IF EXISTS `teachers_students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teachers_students` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) DEFAULT NULL,
  `teacher_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teachers_students`
--

LOCK TABLES `teachers_students` WRITE;
/*!40000 ALTER TABLE `teachers_students` DISABLE KEYS */;
INSERT INTO `teachers_students` VALUES (1,1,2),(2,2,3),(3,3,1),(4,4,2),(5,5,3),(6,1,4),(7,1,5),(8,2,1),(9,2,2),(10,3,3),(11,4,4),(12,4,5),(13,5,1);
/*!40000 ALTER TABLE `teachers_students` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-02-26 12:08:20
