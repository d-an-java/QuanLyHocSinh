/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : quanlyhocsinh

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 20/03/2019 15:51:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for diem
-- ----------------------------
DROP TABLE IF EXISTS `diem`;
CREATE TABLE `diem`  (
  `hocsinhid` int(11) UNSIGNED NOT NULL,
  `monhocid` int(11) UNSIGNED NOT NULL,
  `hesodiemid` int(11) UNSIGNED NOT NULL,
  `hockyid` int(11) UNSIGNED NOT NULL,
  `diem` decimal(10, 0) NOT NULL,
  PRIMARY KEY (`hocsinhid`, `monhocid`, `hesodiemid`, `hockyid`) USING BTREE,
  INDEX `hocsinhid`(`hocsinhid`) USING BTREE,
  INDEX `monhocid`(`monhocid`) USING BTREE,
  INDEX `hesodiemid`(`hesodiemid`) USING BTREE,
  INDEX `hockyid`(`hockyid`) USING BTREE,
  CONSTRAINT `diem_ibfk_1` FOREIGN KEY (`hocsinhid`) REFERENCES `hocsinh` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `diem_ibfk_2` FOREIGN KEY (`monhocid`) REFERENCES `mon` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `diem_ibfk_3` FOREIGN KEY (`hesodiemid`) REFERENCES `hesodiem` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `diem_ibfk_4` FOREIGN KEY (`hockyid`) REFERENCES `hocky` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for hesodiem
-- ----------------------------
DROP TABLE IF EXISTS `hesodiem`;
CREATE TABLE `hesodiem`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  ` hesodiem` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for hocky
-- ----------------------------
DROP TABLE IF EXISTS `hocky`;
CREATE TABLE `hocky`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `tenhocky` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for hocsinh
-- ----------------------------
DROP TABLE IF EXISTS `hocsinh`;
CREATE TABLE `hocsinh`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `ten` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ngaysinh` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `gioitinh` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `diachi` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `lop` int(11) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `lop`(`lop`) USING BTREE,
  CONSTRAINT `hocsinh_ibfk_1` FOREIGN KEY (`lop`) REFERENCES `lop` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for khoi
-- ----------------------------
DROP TABLE IF EXISTS `khoi`;
CREATE TABLE `khoi`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `tenkhoi` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for lop
-- ----------------------------
DROP TABLE IF EXISTS `lop`;
CREATE TABLE `lop`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `tenlop` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `khoi` int(11) UNSIGNED NOT NULL,
  `siso` int(11) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `khoi`(`khoi`) USING BTREE,
  CONSTRAINT `lop_ibfk_1` FOREIGN KEY (`khoi`) REFERENCES `khoi` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for mon
-- ----------------------------
DROP TABLE IF EXISTS `mon`;
CREATE TABLE `mon`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `tenmon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `hesomon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for phanquyen
-- ----------------------------
DROP TABLE IF EXISTS `phanquyen`;
CREATE TABLE `phanquyen`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `chuvu` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of phanquyen
-- ----------------------------
INSERT INTO `phanquyen` VALUES (1, 'Giáo Viên');
INSERT INTO `phanquyen` VALUES (2, 'Giáo Vụ');

-- ----------------------------
-- Table structure for taikhoan
-- ----------------------------
DROP TABLE IF EXISTS `taikhoan`;
CREATE TABLE `taikhoan`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `tentaikhoan` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `matkhau` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `chuvu` int(11) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `chucvu`(`chuvu`) USING BTREE,
  CONSTRAINT `taikhoan_ibfk_1` FOREIGN KEY (`chuvu`) REFERENCES `phanquyen` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of taikhoan
-- ----------------------------
INSERT INTO `taikhoan` VALUES (2, 'Nhayhuy', '12364', 1);
INSERT INTO `taikhoan` VALUES (3, '1742029', '123456', 2);

SET FOREIGN_KEY_CHECKS = 1;
