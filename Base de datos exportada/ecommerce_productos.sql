CREATE DATABASE  IF NOT EXISTS `ecommerce` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `ecommerce`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: ecommerce
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `idProducto` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `descripcion` varchar(500) DEFAULT NULL,
  `precio` decimal(10,2) NOT NULL,
  `idCategoria` int DEFAULT NULL,
  PRIMARY KEY (`idProducto`),
  KEY `idCategoria` (`idCategoria`),
  CONSTRAINT `productos_ibfk_1` FOREIGN KEY (`idCategoria`) REFERENCES `categorias` (`idCategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'TENIS NIKE GIANNIS INMORTALITY 3 HOMBRE','Inmortaliza cada una de tus jugadas con el nuevo par de tenis \nGiannis Inmortality 3 para hombre de la marca Nike. \nDiseñados con ranuras que se abren por la mitad, también cuenta con una espuma en la entresuela que mejora la \nexperiencia de tu pisada. Puedes notar que en la parte media del pie cuenta con una correa sintética que \nmantiene firme el pie, la parte superior también cuenta con la construcción de malla transpirable.',2948.00,1),(2,'Tenis de básquetbol Curry Flow 10 “Curryfornia” unisex','Cambia de dirección rápidamente. La amortiguación UA Flow sin goma hace estos\n tenis más ligeros e increíblemente adherentes. La parte superior con diseño UA Warp funciona a modo de minicinturones que envuelven el pie \n para ofrecer control y velocidad.',3800.00,2),(3,'MALETA NIKE GYM CLUB','Prepárate para llevar todo lo necesario dentro de la nueva maleta Gym Club de la marca Nike. \nConstruida con un diseño simple, pero muy elegante. Su compartimento principal de doble cierre tiene espacio para tu calzado, \nropa u otras imprescindibles. En la parte delantera también cuenta con un bolsillo con cierre y \nel Swoosh icónico de la marca.',899.00,1),(4,'TENIS NIKE COURT BOROUGH LOW RECRAFT JOVEN','Es momento de añadir un toque urbano a tu outfit con el nuevo par de \ntenis Court Borough Low Recraft para joven de la marca Nike. Diseñado con una combinación de materiales reciclados en la parte \nsuperior y la suela exterior. También cuenta con una puntera perforada y un mediopié rediseñado para \nofrecer más impulso.',1549.00,1),(5,'MOCHILA NIKE BRASILIA 9.5','Toma todo lo necesario y ponlo dentro de la nueva mochila Brasilia 9.5 de la marca Nike. \nEsta mochila cuenta con muchos bolsillos, de este modo podrás mantener organizadas cada una de tus pertenencias. \nCuenta con unos bolsillos de malla en los laterales, ahí puedes colocar tus botellas de agua, además cuenta con bolsillos con cierre en \nla parte interior para mantener seguros objetos pequeños.',1199.00,1),(6,'TENIS NIKE PEGASUS 40 MUJER','Alcanza tus objetivos con la comodidad, sensación familiar y elasticidad que proporcionan los \nnuevos tenis Pegasus 40 para mujer de la marca Nike. Esta versión cuenta con la misma capacidad y soporte neutral que tanto te encanta, \npero se le añade comodidad en áreas sensibles, como el arco y los dedos.',2999.00,1),(7,'PLAYERA UNDER ARMOUR PROJECT ROCK MUJER','Entrena al máximo para siempre alcanzar con la nueva playera Project Rock para mujer \nde la marca Under Armour. La gama de productos Project Rock cuentan con la aprobación del mismísimo Dwayne The Rock Johnson.',799.00,2),(8,'CALCETAS UNDER ARMOUR ESSENTIAL NO SHOW','Podrás llevar toda la comodidad en tus entrenamientos agregando las calcetas Essentials \nNo Show de la marca Under Armour. Su tejido permite una gran absorción de sudor al mismo tiempo que genera un proceso de secado rápido.',379.00,2),(9,'GORRA UNDER ARMOUR BLITZING','Complementa tu outfit deportivo de forma óptima con la gorra Under Armour Blitzing. \nEsta gorra de entrenamiento está diseñada para rutinas de alto rendimiento al aire libre.',549.00,2),(10,'MALETA UNDER ARMOUR UNDENIABLE 5.0','Lleva tus pertenencias a todos lados con la maleta Under Armour Undeniable 5.0. Cuenta con la \ntecnología UA Storm haciéndola resistente al agua, también incluye distintos tipos de bolsillos para que mantengas \ntus artículos separados.',1099.00,2);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `AntesDeInsertarProducto` BEFORE INSERT ON `productos` FOR EACH ROW BEGIN
    IF NEW.precio < 0 THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'No se permite insertar productos con precio negativo.';
    END IF;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-24 18:26:52
