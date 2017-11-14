-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: incarcerationanalyzer
-- ------------------------------------------------------
-- Server version	5.7.19-log

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
-- Table structure for table `agepop`
--

DROP TABLE IF EXISTS `agepop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `agepop` (
  `ageid` int(11) NOT NULL AUTO_INCREMENT,
  `facilityid` int(11) NOT NULL,
  `under18` int(11) DEFAULT NULL,
  `age18to21` int(11) DEFAULT NULL,
  `age22to25` int(11) DEFAULT NULL,
  `age26to30` int(11) DEFAULT NULL,
  `age31to35` int(11) DEFAULT NULL,
  `age36to40` int(11) DEFAULT NULL,
  `age41to45` int(11) DEFAULT NULL,
  `age46to50` int(11) DEFAULT NULL,
  `age51to55` int(11) DEFAULT NULL,
  `age56to60` int(11) DEFAULT NULL,
  `age61to65` int(11) DEFAULT NULL,
  `over65` int(11) DEFAULT NULL,
  PRIMARY KEY (`ageid`),
  KEY `facilityid` (`facilityid`),
  CONSTRAINT `facility_agepop_ibfk_1` FOREIGN KEY (`facilityid`) REFERENCES `facility` (`facilityid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agepop`
--

LOCK TABLES `agepop` WRITE;
/*!40000 ALTER TABLE `agepop` DISABLE KEYS */;
INSERT INTO `agepop` VALUES (1,1,0,9,27,31,56,59,101,87,45,38,26,11),(2,2,0,33,165,396,528,591,643,366,257,165,92,66),(3,3,0,17,84,214,232,349,364,150,131,81,44,34),(4,4,0,28,103,264,271,375,389,186,150,122,64,48),(5,5,3,34,111,276,291,409,414,190,166,137,68,51),(6,6,0,18,90,243,244,354,373,155,139,104,54,39),(7,7,0,31,119,243,265,391,405,182,154,111,54,45),(8,8,10,99,294,538,792,865,923,512,428,314,123,102),(9,9,18,156,688,1648,2225,2594,2736,1569,1047,689,348,282),(10,10,20,23,70,134,159,168,194,85,82,47,18,0);
/*!40000 ALTER TABLE `agepop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ethnicitypop`
--

DROP TABLE IF EXISTS `ethnicitypop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ethnicitypop` (
  `ethnicityid` int(11) NOT NULL AUTO_INCREMENT,
  `facilityid` int(11) NOT NULL,
  `asian` int(11) DEFAULT NULL,
  `black` int(11) DEFAULT NULL,
  `hispanic` int(11) DEFAULT NULL,
  `white` int(11) DEFAULT NULL,
  PRIMARY KEY (`ethnicityid`),
  KEY `facilityid` (`facilityid`),
  CONSTRAINT `facility_ethnicity_ibfk_1` FOREIGN KEY (`facilityid`) REFERENCES `facility` (`facilityid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ethnicitypop`
--

LOCK TABLES `ethnicitypop` WRITE;
/*!40000 ALTER TABLE `ethnicitypop` DISABLE KEYS */;
INSERT INTO `ethnicitypop` VALUES (1,1,7,155,122,208),(2,2,25,896,854,1527),(3,3,17,488,435,760),(4,4,22,590,475,913),(5,5,19,638,535,958),(6,6,21,537,449,806),(7,7,11,524,541,924),(8,8,43,1387,1276,2294),(9,9,153,4131,3539,6177),(10,10,12,255,278,455);
/*!40000 ALTER TABLE `ethnicitypop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facility`
--

DROP TABLE IF EXISTS `facility`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `facility` (
  `facilityid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `population` int(7) DEFAULT NULL,
  PRIMARY KEY (`facilityid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facility`
--

LOCK TABLES `facility` WRITE;
/*!40000 ALTER TABLE `facility` DISABLE KEYS */;
INSERT INTO `facility` VALUES (1,'ADX Florence Facility',490),(2,'San Quentin State Prison',3302),(3,'Sing Sing',1700),(4,'United States Penitentiary Atl',2000),(5,'Attica Correctional Facility',2150),(6,'Folsom State Prison',1813),(7,'Leavenworth Federal Penitentia',2000),(8,'Louisiana State Penitentiary',5000),(9,'Rikers Island',14000),(10,'United States Penitentiary Mar',1000);
/*!40000 ALTER TABLE `facility` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-13 23:27:44
