-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: moviesbrowsingsystem
-- ------------------------------------------------------
-- Server version	8.0.25

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `id` int NOT NULL AUTO_INCREMENT,
  `admin_username` varchar(45) DEFAULT NULL,
  `admin_passward` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=111 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (110,'admin','admin2021');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie_details`
--

DROP TABLE IF EXISTS `movie_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie_details` (
  `idmovie` int NOT NULL AUTO_INCREMENT,
  `movie_name` varchar(60) DEFAULT NULL,
  `movie_type` varchar(60) DEFAULT NULL,
  `movie_year` varchar(60) DEFAULT NULL,
  `movie_rate` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`idmovie`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie_details`
--

LOCK TABLES `movie_details` WRITE;
/*!40000 ALTER TABLE `movie_details` DISABLE KEYS */;
INSERT INTO `movie_details` VALUES (1,'Extraction','Thriller','2020','5');
/*!40000 ALTER TABLE `movie_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tvseries`
--

DROP TABLE IF EXISTS `tvseries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tvseries` (
  `name` varchar(50) NOT NULL,
  `imdb` varchar(45) DEFAULT NULL,
  `category` varchar(45) DEFAULT NULL,
  `sesons` varchar(45) DEFAULT NULL,
  `director` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tvseries`
--

LOCK TABLES `tvseries` WRITE;
/*!40000 ALTER TABLE `tvseries` DISABLE KEYS */;
INSERT INTO `tvseries` VALUES ('Breaking Bad','8','Thriller','5','Johnson'),('Money Hiest','9','Action','4','the abcd.....');
/*!40000 ALTER TABLE `tvseries` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `uploader`
--

DROP TABLE IF EXISTS `uploader`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `uploader` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `Email_address` varchar(50) DEFAULT NULL,
  `contact` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `uploader`
--

LOCK TABLES `uploader` WRITE;
/*!40000 ALTER TABLE `uploader` DISABLE KEYS */;
INSERT INTO `uploader` VALUES (30,'Kavisha','Silva','kavisha2000','k000','kavishasilva@gmail.com','0719112314');
/*!40000 ALTER TABLE `uploader` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `uploadingtb`
--

DROP TABLE IF EXISTS `uploadingtb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `uploadingtb` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `releaseDate` date DEFAULT NULL,
  `rate` float DEFAULT NULL,
  `category` varchar(45) DEFAULT NULL,
  `language` varchar(45) DEFAULT NULL,
  `director` varchar(100) DEFAULT NULL,
  `description` varchar(300) DEFAULT NULL,
  `uploaderName` varchar(100) DEFAULT NULL,
  `uploadedDate` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=74 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `uploadingtb`
--

LOCK TABLES `uploadingtb` WRITE;
/*!40000 ALTER TABLE `uploadingtb` DISABLE KEYS */;
INSERT INTO `uploadingtb` VALUES (1,'Scooby','2020-01-25',5.8,'movie','english','tone curvone','Scooby and the gang face their most challenging mystery ever: a plot to unleash the ghost dog Cerberus upon the world. As they race to stop this dogpocalypse, the gang discovers that Scooby has an epic destiny greater than anyone imagined.','kavisha silva','2021-05-19'),(71,'Tenet','2020-08-27',7.4,'Movie','English','Christopher Nolan','Armed with only one word, Tenet, and fighting for the survival of the entire world, a Protagonist journeys through a twilight world of international espionage on a mission that will unfold in something beyond real time.','kavisha','2021-05-27'),(72,'Mercenary','2020-01-07',6.8,'Movie','English','V.Johnson','When a mission in South America goes wrong a mercenary is left for dead, but he is nursed back to health and reborn with a new outlook on life. But his peaceful days are short-lived when mercenaries he used to work with cross his path again and he is forced to revisit and face his own demons.','kavisha','2021-05-27'),(73,'Underwater','2020-07-27',7.1,'Movie','English','Julian Roman','Underwater, starring Kristen Stewart, has a great production value and enough jump out of your seat moments to keep the blood pumping.','kavisha','2021-05-27');
/*!40000 ALTER TABLE `uploadingtb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `idUser` int NOT NULL,
  `F_Name` varchar(50) DEFAULT NULL,
  `L_Name` varchar(50) DEFAULT NULL,
  `Phone_Num` int DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Username` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idUser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'kamal','silva',711223111,'maskcnnj','kamal1','1234'),(101,'kamal','silva',711223111,'maskcnnj','kamal1','1234'),(201,'Amal','perera',711223111,'maskcnnj','amal1','1235'),(301,'Nimal','jayaweera',711223111,'maskcnnj','nimal','1236');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-28 12:25:38
