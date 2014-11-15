-- MySQL dump 10.13  Distrib 5.6.21, for osx10.8 (x86_64)
--
-- Host: localhost    Database: yipincars
-- ------------------------------------------------------
-- Server version	5.6.21

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
-- Table structure for table `buy_car_baseinfo`
--

DROP TABLE IF EXISTS `buy_car_baseinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `buy_car_baseinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `baseinfo_make` varchar(45) NOT NULL,
  `baseinfo_current_price` float NOT NULL,
  `baseinfo_new_car_price` float DEFAULT NULL,
  `baseinfo_older` int(11) DEFAULT NULL,
  `baseinfo_gearbox` varchar(1) DEFAULT NULL,
  `baseinfo_model` varchar(45) DEFAULT NULL,
  `baseinfo_registe_time` varchar(45) DEFAULT NULL,
  `baseinfo_mileage` float DEFAULT NULL,
  `baseinfo_platen_umber` varchar(45) DEFAULT NULL,
  `baseinfo_exhaust` varchar(45) DEFAULT NULL,
  `baseinfo_annual_inspection` varchar(45) DEFAULT NULL,
  `baseinfo_forced_insurance` varchar(45) DEFAULT NULL,
  `baseinfo_business_insurance` varchar(45) DEFAULT NULL,
  `baseinfo_transfor_number` varchar(45) DEFAULT NULL,
  `baseinfo_transfor_last_time` varchar(45) DEFAULT NULL,
  `baseinfo_detecte_time` varchar(45) DEFAULT NULL,
  `seller_name` varchar(45) DEFAULT NULL,
  `seller_job` varchar(45) DEFAULT NULL,
  `seller_home_address` varchar(45) DEFAULT NULL,
  `seller_description` varchar(45) DEFAULT NULL,
  `seller_test_descrition` varchar(45) DEFAULT NULL,
  `master_name` varchar(45) DEFAULT NULL,
  `master_number` varchar(45) DEFAULT NULL,
  `master_description` varchar(45) DEFAULT NULL,
  `detection_frame_info` varchar(45) DEFAULT NULL,
  `detection_outside_head_bumper` varchar(45) DEFAULT NULL,
  `detection_outside_tail_bumper` varchar(45) DEFAULT NULL,
  `detection_outside_left_mirror` varchar(45) DEFAULT NULL,
  `detection_outside_right_mirror` varchar(45) DEFAULT NULL,
  `detection_outside_left_headlight` varchar(45) DEFAULT NULL,
  `detection_outside_right_headlight` varchar(45) DEFAULT NULL,
  `detection_outside_left_taillight` varchar(45) DEFAULT NULL,
  `detection_outside_right_taillight` varchar(45) DEFAULT NULL,
  `detection_outside_wheel_cover` varchar(45) DEFAULT NULL,
  `detection_outside_ antenna` varchar(45) DEFAULT NULL,
  `detection_outside_head_ screen` varchar(45) DEFAULT NULL,
  `detection_outside_tail_ screen` varchar(45) DEFAULT NULL,
  `detection_outside_grille` varchar(45) DEFAULT NULL,
  `detection_outside_head_glass` varchar(45) DEFAULT NULL,
  `detection_outside_tail_glass` varchar(45) DEFAULT NULL,
  `detection_outside_head_left_glass` varchar(45) DEFAULT NULL,
  `detection_outside_head_right_glass` varchar(45) DEFAULT NULL,
  `detection_outside_tail_right_glass` varchar(45) DEFAULT NULL,
  `detection_outside_tail_left_glass` varchar(45) DEFAULT NULL,
  `detection_inside_dashboard` varchar(45) DEFAULT NULL,
  `detection_inside_steering_wheel` varchar(45) DEFAULT NULL,
  `detection_inside_inner_mirror` varchar(45) DEFAULT NULL,
  `detection_inside_sunvisor` varchar(45) DEFAULT NULL,
  `detection_inside_ glovebox` varchar(45) DEFAULT NULL,
  `detection_inside_ roof` varchar(45) DEFAULT NULL,
  `detection_inside_mainland_glue` varchar(45) DEFAULT NULL,
  `detection_inside_drive_seat` varchar(45) DEFAULT NULL,
  `detection_inside_assistant_seat` varchar(45) DEFAULT NULL,
  `detection_inside_rear_seats` varchar(45) DEFAULT NULL,
  `detection_inside_seat_adjustment_handle` varchar(45) DEFAULT NULL,
  `detection_inside_left_front_trim_panel` varchar(45) DEFAULT NULL,
  `detection_inside_right_front_trim_panel` varchar(45) DEFAULT NULL,
  `detection_inside_left_tail_trim_panel` varchar(45) DEFAULT NULL,
  `detection_inside_right_tail_trim_panel` varchar(45) DEFAULT NULL,
  `detection_inside_gear_lever_cap` varchar(45) DEFAULT NULL,
  `detection_inside_gear_lever_handle` varchar(45) DEFAULT NULL,
  `detection_inside_centre_armrest` varchar(45) DEFAULT NULL,
  `detection_inside_cigar_lighter` varchar(45) DEFAULT NULL,
  `detection_inside_a_column_trim` varchar(45) DEFAULT NULL,
  `detection_inside_b_column_trim` varchar(45) DEFAULT NULL,
  `detection_inside_c_column_trim` varchar(45) DEFAULT NULL,
  `detection_inside_left_front_armrests` varchar(45) DEFAULT NULL,
  `detection_inside_right_front_armrests` varchar(45) DEFAULT NULL,
  `detection_inside_left_tail_armrests` varchar(45) DEFAULT NULL,
  `detection_inside_right_tail_armrests` varchar(45) DEFAULT NULL,
  `detection_configure_driving_mode` varchar(45) DEFAULT NULL,
  `detection_configure_air_numbers` varchar(45) DEFAULT NULL,
  `detection_configure_wheel_material` varchar(45) DEFAULT NULL,
  `detection_configure_remote_key` varchar(45) DEFAULT NULL,
  `detection_configure_instrument_lights` varchar(45) DEFAULT NULL,
  `detection_configure_windshield_wiper` varchar(45) DEFAULT NULL,
  `detection_configure_sound` varchar(45) DEFAULT NULL,
  `detection_configure_speaker` varchar(45) DEFAULT NULL,
  `detection_configure_power_steering` varchar(45) DEFAULT NULL,
  `detection_configure_ABS` varchar(45) DEFAULT NULL,
  `detection_configure_ESP` varchar(45) DEFAULT NULL,
  `detection_configure_power_window` varchar(45) DEFAULT NULL,
  `detection_configure_skylight` varchar(45) DEFAULT NULL,
  `detection_configure_main_driving_power_seats` varchar(45) DEFAULT NULL,
  `detection_configure_chair_driving_power_seats` varchar(45) DEFAULT NULL,
  `detection_configure_automatic_air_conditioning` varchar(45) DEFAULT NULL,
  `detection_configure_exterior_mirrors_electrically_folding` varchar(45) DEFAULT NULL,
  `detection_configure_cruise_control` varchar(45) DEFAULT NULL,
  `detection_configure_multifunction_steering_wheel` varchar(45) DEFAULT NULL,
  `detection_configure_spare_tire` varchar(45) DEFAULT NULL,
  `detection_configure_leather_seat` varchar(45) DEFAULT NULL,
  `detection_configure_CD` varchar(45) DEFAULT NULL,
  `detection_configure_DVD` varchar(45) DEFAULT NULL,
  `detection_configure_GPS` varchar(45) DEFAULT NULL,
  `detection_configure_parking_sensors` varchar(45) DEFAULT NULL,
  `detection_configure_rear_view_camera` varchar(45) DEFAULT NULL,
  `detection_configure_seat_heating` varchar(45) DEFAULT NULL,
  `detection_machine_clutch` varchar(45) DEFAULT NULL,
  `detection_machine_engine` varchar(45) DEFAULT NULL,
  `detection_machine_gasket_leak` varchar(45) DEFAULT NULL,
  `detection_machine_exhaust_color_blue` varchar(45) DEFAULT NULL,
  `detection_machine_exhaust_color_black` varchar(45) DEFAULT NULL,
  `detection_machine_gearbox_sound` varchar(45) DEFAULT NULL,
  `detection_machine_through_file` varchar(45) DEFAULT NULL,
  `detection_machine_cltuch_slipping` varchar(45) DEFAULT NULL,
  `detection_roadtest_driving_sound` varchar(45) DEFAULT NULL,
  `detection_roadtest_brake_system` varchar(45) DEFAULT NULL,
  `detection_roadtest_suspension_system` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idbuy_table_UNIQUE` (`id`),
  UNIQUE KEY `make_UNIQUE` (`baseinfo_make`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `buy_car_baseinfo`
--

LOCK TABLES `buy_car_baseinfo` WRITE;
/*!40000 ALTER TABLE `buy_car_baseinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `buy_car_baseinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sell_car_baseinfo`
--

DROP TABLE IF EXISTS `sell_car_baseinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sell_car_baseinfo` (
  `Id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'the id of table',
  `seller_make` varchar(45) NOT NULL,
  `seller_line` varchar(45) NOT NULL,
  `seller_model` varchar(45) NOT NULL,
  `seller_color` varchar(45) DEFAULT NULL,
  `seller_telephone` varchar(45) DEFAULT NULL,
  `seller_timestamp` varchar(45) DEFAULT NULL,
  `seller_remarks` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `make_UNIQUE` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='the table on sell';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sell_car_baseinfo`
--

LOCK TABLES `sell_car_baseinfo` WRITE;
/*!40000 ALTER TABLE `sell_car_baseinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `sell_car_baseinfo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-11-06  9:09:49
