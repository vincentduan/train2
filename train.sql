/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : train

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-07-09 16:59:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for energysection
-- ----------------------------
DROP TABLE IF EXISTS `energysection`;
CREATE TABLE `energysection` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `start` varchar(255) DEFAULT NULL,
  `end` varchar(255) DEFAULT NULL,
  `energe` varchar(255) DEFAULT NULL,
  `info` varchar(255) DEFAULT NULL,
  `runtime` varchar(255) DEFAULT NULL,
  `maxAcceleration` double DEFAULT NULL,
  `minusAcceleration` double DEFAULT NULL,
  `maxAcceleration_rate` double DEFAULT NULL,
  `minusAcceleration_rate` double DEFAULT NULL,
  `EBI` int(11) DEFAULT NULL,
  `field1` varchar(255) DEFAULT NULL,
  `field2` varchar(255) DEFAULT NULL,
  `field3` varchar(255) DEFAULT NULL,
  `field4` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of energysection
-- ----------------------------

-- ----------------------------
-- Table structure for train
-- ----------------------------
DROP TABLE IF EXISTS `train`;
CREATE TABLE `train` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `start_Station` varchar(255) DEFAULT NULL,
  `end_Station` varchar(255) DEFAULT NULL,
  `start_Time` varchar(255) DEFAULT NULL,
  `actual_Length` varchar(255) DEFAULT NULL,
  `end_Time` varchar(255) DEFAULT NULL,
  `runing_Time` varchar(255) DEFAULT NULL,
  `load_Factor` varchar(255) DEFAULT NULL,
  `file_Name` varchar(255) DEFAULT NULL,
  `max_Acceleration` double DEFAULT NULL,
  `minus_Acceleration` double DEFAULT NULL,
  `maxAcceleration_Rate` double DEFAULT NULL,
  `minusAcceleration_Rate` double DEFAULT NULL,
  `station_Precision` double DEFAULT NULL,
  `EBI_Num` int(11) DEFAULT NULL,
  `info` varchar(255) DEFAULT NULL,
  `field1` varchar(255) DEFAULT NULL,
  `field2` varchar(255) DEFAULT NULL,
  `field3` varchar(255) DEFAULT NULL,
  `field4` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of train
-- ----------------------------

-- ----------------------------
-- Table structure for train_data
-- ----------------------------
DROP TABLE IF EXISTS `train_data`;
CREATE TABLE `train_data` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `file_Name` varchar(255) DEFAULT NULL,
  `start_Station` varchar(255) DEFAULT NULL,
  `end_Station` varchar(255) DEFAULT NULL,
  `speed` double DEFAULT NULL,
  `slope` double DEFAULT NULL,
  `traction` double DEFAULT NULL,
  `power` double DEFAULT NULL,
  `info` varchar(255) DEFAULT NULL,
  `runtime` varchar(255) DEFAULT NULL,
  `EBI` double DEFAULT NULL,
  `field1` varchar(255) DEFAULT NULL,
  `field2` varchar(255) DEFAULT NULL,
  `field3` varchar(255) DEFAULT NULL,
  `field4` varchar(255) CHARACTER SET utf8 COLLATE utf8_latvian_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of train_data
-- ----------------------------
