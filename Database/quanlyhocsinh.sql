/*
 Navicat MySQL Data Transfer

 Source Server         : HocSinh
 Source Server Type    : MySQL
 Source Server Version : 100138
 Source Host           : localhost:3306
 Source Schema         : quanlyhocsinh

 Target Server Type    : MySQL
 Target Server Version : 100138
 File Encoding         : 65001

 Date: 27/03/2019 13:59:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for diem
-- ----------------------------
DROP TABLE IF EXISTS `diem`;
CREATE TABLE `diem`  (
  `mahocsinh` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `mamonhoc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `hesodiemid` int(11) UNSIGNED NOT NULL,
  `hockyid` int(11) UNSIGNED NOT NULL,
  `diem` float(10, 2) NOT NULL,
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `mahocsinh`(`mahocsinh`) USING BTREE,
  INDEX `mamonhoc`(`mamonhoc`) USING BTREE,
  INDEX `hesodiemid`(`hesodiemid`) USING BTREE,
  INDEX `hockyid`(`hockyid`) USING BTREE,
  CONSTRAINT `diem_ibfk_1` FOREIGN KEY (`mahocsinh`) REFERENCES `hocsinh` (`mahocsinh`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `diem_ibfk_2` FOREIGN KEY (`mamonhoc`) REFERENCES `mon` (`mamon`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `diem_ibfk_3` FOREIGN KEY (`hesodiemid`) REFERENCES `hesodiem` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `diem_ibfk_4` FOREIGN KEY (`hockyid`) REFERENCES `hocky` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of diem
-- ----------------------------
INSERT INTO `diem` VALUES ('1910101', 'toan10', 2, 2, 9.50, 3);

-- ----------------------------
-- Table structure for hesodiem
-- ----------------------------
DROP TABLE IF EXISTS `hesodiem`;
CREATE TABLE `hesodiem`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  ` hesodiem` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hesodiem
-- ----------------------------
INSERT INTO `hesodiem` VALUES (1, '15Phut');
INSERT INTO `hesodiem` VALUES (2, '60Phut');
INSERT INTO `hesodiem` VALUES (3, 'Thi cuối kỳ');

-- ----------------------------
-- Table structure for hocky
-- ----------------------------
DROP TABLE IF EXISTS `hocky`;
CREATE TABLE `hocky`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `tenhocky` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hocky
-- ----------------------------
INSERT INTO `hocky` VALUES (1, '2018_2019 HK1');
INSERT INTO `hocky` VALUES (2, '2018_2019 HK2');

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
  `lop` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `mahocsinh` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `lop`(`lop`) USING BTREE,
  INDEX `mahocsinh`(`mahocsinh`) USING BTREE,
  CONSTRAINT `hocsinh_ibfk_1` FOREIGN KEY (`lop`) REFERENCES `lop` (`malop`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hocsinh
-- ----------------------------
INSERT INTO `hocsinh` VALUES (2, 'Ngô Nhật Huy', '30/08/1995', 'Nam', 'Quận 12', 'Huy@gmail.com', '10a1', '1910101');

-- ----------------------------
-- Table structure for khoi
-- ----------------------------
DROP TABLE IF EXISTS `khoi`;
CREATE TABLE `khoi`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `tenkhoi` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of khoi
-- ----------------------------
INSERT INTO `khoi` VALUES (1, 'lớp 10');
INSERT INTO `khoi` VALUES (2, 'lớp 11');
INSERT INTO `khoi` VALUES (3, 'lớp 12');

-- ----------------------------
-- Table structure for lop
-- ----------------------------
DROP TABLE IF EXISTS `lop`;
CREATE TABLE `lop`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `tenlop` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `khoi` int(11) UNSIGNED NOT NULL,
  `siso` int(11) UNSIGNED NOT NULL,
  `malop` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `khoi`(`khoi`) USING BTREE,
  INDEX `malop`(`malop`) USING BTREE,
  CONSTRAINT `lop_ibfk_1` FOREIGN KEY (`khoi`) REFERENCES `khoi` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of lop
-- ----------------------------
INSERT INTO `lop` VALUES (1, '10A1', 1, 35, '10a1');
INSERT INTO `lop` VALUES (2, '10A2', 1, 36, '10a2');

-- ----------------------------
-- Table structure for mon
-- ----------------------------
DROP TABLE IF EXISTS `mon`;
CREATE TABLE `mon`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `tenmon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `hesomon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `mamon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `mamon`(`mamon`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of mon
-- ----------------------------
INSERT INTO `mon` VALUES (1, 'Toán', '10', 'toan10');

-- ----------------------------
-- Table structure for phanquyen
-- ----------------------------
DROP TABLE IF EXISTS `phanquyen`;
CREATE TABLE `phanquyen`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `tenchucvu` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

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
  `chucvu` int(11) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `chucvu`(`chucvu`) USING BTREE,
  CONSTRAINT `taikhoan_ibfk_1` FOREIGN KEY (`chucvu`) REFERENCES `phanquyen` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of taikhoan
-- ----------------------------
INSERT INTO `taikhoan` VALUES (2, 'Nhayhuy', 'e10adc3949ba59abbe56e057f20f883e', 1);
INSERT INTO `taikhoan` VALUES (3, '1742029', 'e10adc3949ba59abbe56e057f20f883e', 2);

SET FOREIGN_KEY_CHECKS = 1;
