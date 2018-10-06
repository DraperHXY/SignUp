/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : it_xiuzhen_signup

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 06/10/2018 16:25:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for it_mates_table
-- ----------------------------
DROP TABLE IF EXISTS `it_mates_table`;
CREATE TABLE `it_mates_table` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_at` bigint(20) NOT NULL,
  `update_at` bigint(20) DEFAULT NULL,
  `online_id` int(10) NOT NULL,
  `study_type` varchar(20) DEFAULT NULL,
  `start_study_time` bigint(20) DEFAULT NULL,
  `daily_link` varchar(255) DEFAULT NULL,
  `wish` varchar(255) DEFAULT NULL,
  `coach_senior` varchar(20) DEFAULT NULL,
  `know_from` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of it_mates_table
-- ----------------------------
BEGIN;
INSERT INTO `it_mates_table` VALUES (7, 1538806011913, NULL, 4975, 'JAVA工程师', 1538409600000, 'http://www.jnshu.com/school/86/daily', '如果我不能在IT特训营拼尽全力，为自己以后的修行路上打好基础，就让我变胖2k斤！', '桂伟腾', '知乎');
COMMIT;

-- ----------------------------
-- Table structure for simple_mates_table
-- ----------------------------
DROP TABLE IF EXISTS `simple_mates_table`;
CREATE TABLE `simple_mates_table` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_at` bigint(20) DEFAULT NULL,
  `update_at` bigint(20) DEFAULT NULL,
  `online_id` int(10) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `qq` varchar(20) DEFAULT NULL,
  `graduate_school` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of simple_mates_table
-- ----------------------------
BEGIN;
INSERT INTO `simple_mates_table` VALUES (2, 1538806011913, NULL, 4975, '贾伟奇', '860733414', '北京YD大学');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
