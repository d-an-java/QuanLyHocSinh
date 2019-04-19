/*
 Navicat Premium Data Transfer

 Source Server         : HocSinh
 Source Server Type    : MySQL
 Source Server Version : 100138
 Source Host           : localhost:3306
 Source Schema         : quanlyhocsinh

 Target Server Type    : MySQL
 Target Server Version : 100138
 File Encoding         : 65001

 Date: 19/04/2019 15:28:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for diem
-- ----------------------------
DROP TABLE IF EXISTS `diem`;
CREATE TABLE `diem`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `mahocsinh` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `malop` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `mamonhoc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `mahocky` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `diemtbmon` float(10, 2) NULL DEFAULT NULL,
  `diemheso1` float(10, 2) NULL DEFAULT NULL,
  `diemheso2` float(10, 2) NULL DEFAULT NULL,
  `diemheso3` float(10, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `mahocsinh`(`mahocsinh`) USING BTREE,
  INDEX `mamonhoc`(`mamonhoc`) USING BTREE,
  INDEX `mahocky`(`mahocky`) USING BTREE,
  INDEX `malop`(`malop`) USING BTREE,
  CONSTRAINT `diem_ibfk_1` FOREIGN KEY (`mahocsinh`) REFERENCES `hocsinh` (`mahocsinh`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `diem_ibfk_2` FOREIGN KEY (`mamonhoc`) REFERENCES `mon` (`mamon`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `diem_ibfk_3` FOREIGN KEY (`mahocky`) REFERENCES `hocky` (`mahocky`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `diem_ibfk_4` FOREIGN KEY (`malop`) REFERENCES `lop` (`malop`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of diem
-- ----------------------------
INSERT INTO `diem` VALUES (7, '1910101', '10a1', 'toan', '2018_2019_HK1', 9.50, 9.00, 10.00, 10.00);
INSERT INTO `diem` VALUES (8, '1910102', '10a1', 'toan', '2018_2019_HK1', 7.33, 7.00, 8.00, 9.50);
INSERT INTO `diem` VALUES (10, '1910101', '10a1', 'ly', '2018_2019_HK1', 7.00, 8.00, 5.00, 8.00);
INSERT INTO `diem` VALUES (11, '1910102', '10a1', 'ly', '2018_2019_HK1', 7.50, 7.00, 8.50, 9.00);
INSERT INTO `diem` VALUES (12, '1910201', '10a2', 'toan', '2018_2019_HK1', 7.50, 7.00, 8.50, 6.00);
INSERT INTO `diem` VALUES (13, '1910201', '10a2', 'ly', '2018_2019_HK1', 7.67, 7.00, 9.00, 6.50);
INSERT INTO `diem` VALUES (14, '1910101', '10a1', 'van', '2018_2019_HK1', 8.67, 9.50, 7.00, 6.50);
INSERT INTO `diem` VALUES (15, '1910201', '10a2', 'sinh', '2018_2019_HK1', 8.67, 9.00, 8.00, 0.00);

-- ----------------------------
-- Table structure for hocky
-- ----------------------------
DROP TABLE IF EXISTS `hocky`;
CREATE TABLE `hocky`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `mahocky` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `tenhocky` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `mahocky`(`mahocky`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hocky
-- ----------------------------
INSERT INTO `hocky` VALUES (1, '2018_2019_HK1', 'Học kỳ 1 2018 - 2019');
INSERT INTO `hocky` VALUES (2, '2018_2019_HK2', 'Học kỳ 2 2018 - 2019');

-- ----------------------------
-- Table structure for hocsinh
-- ----------------------------
DROP TABLE IF EXISTS `hocsinh`;
CREATE TABLE `hocsinh`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `mahocsinh` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `lop` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ten` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ngaysinh` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `gioitinh` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `diachi` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `lop`(`lop`) USING BTREE,
  INDEX `mahocsinh`(`mahocsinh`) USING BTREE,
  CONSTRAINT `hocsinh_ibfk_1` FOREIGN KEY (`lop`) REFERENCES `lop` (`malop`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hocsinh
-- ----------------------------
INSERT INTO `hocsinh` VALUES (2, '1910101', '10a1', 'Ngô Nhật Huy', '30/08/1995', 'Nam', 'Quận 12', 'Huy@gmail.com');
INSERT INTO `hocsinh` VALUES (4, '1910102', '10a1', ' Hoang', '23/04/2019', 'N?', 'Quan 3', ' king@gmail.com');
INSERT INTO `hocsinh` VALUES (6, '1910103', '10a1', 'Chau hai Hung', '15/06/1992', 'Nam', ' Quan 6', ' haihung@gmail.com');
INSERT INTO `hocsinh` VALUES (7, '1910201', '10a2', 'Nguyen phu vinh', '16/01/2003', 'N?', ' Quan 7', ' phuvinh@gmail.com');

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
  `malop` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `tenlop` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `khoi` int(11) UNSIGNED NOT NULL,
  `siso` int(11) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `khoi`(`khoi`) USING BTREE,
  INDEX `malop`(`malop`) USING BTREE,
  CONSTRAINT `lop_ibfk_1` FOREIGN KEY (`khoi`) REFERENCES `khoi` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of lop
-- ----------------------------
INSERT INTO `lop` VALUES (1, '10a1', '10 A1', 1, 35);
INSERT INTO `lop` VALUES (2, '10a2', '10 A2', 1, 36);
INSERT INTO `lop` VALUES (3, '10a3', '10 A3', 1, 36);
INSERT INTO `lop` VALUES (4, '10a4', '10 A4', 1, 36);
INSERT INTO `lop` VALUES (5, '11a1', '11 A1', 2, 36);
INSERT INTO `lop` VALUES (6, '11a2', '11 A2', 2, 40);
INSERT INTO `lop` VALUES (7, '11a3', '11 A3', 2, 39);
INSERT INTO `lop` VALUES (8, '12a1', '12 A1', 3, 40);
INSERT INTO `lop` VALUES (9, '12a2', '12 A2', 3, 38);

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
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of mon
-- ----------------------------
INSERT INTO `mon` VALUES (1, 'Toán Học', '10', 'toan');
INSERT INTO `mon` VALUES (2, 'Văn Học', '10', 'van');
INSERT INTO `mon` VALUES (3, 'Vật Lý', '10', 'ly');
INSERT INTO `mon` VALUES (4, 'Hóa Học', '10', 'hoa');
INSERT INTO `mon` VALUES (5, 'Sinh Học', '10', 'sinh');
INSERT INTO `mon` VALUES (6, 'Lịch Sử', '10', 'su');
INSERT INTO `mon` VALUES (7, 'Địa Lý', '10', 'dia');
INSERT INTO `mon` VALUES (8, 'Đạo Đức', '10', 'daoduc');
INSERT INTO `mon` VALUES (9, 'Thể Dục', '10', 'theduc');

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
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of taikhoan
-- ----------------------------
INSERT INTO `taikhoan` VALUES (2, 'Nhayhuy', 'e10adc3949ba59abbe56e057f20f883e', 1);
INSERT INTO `taikhoan` VALUES (3, '1742029', 'e10adc3949ba59abbe56e057f20f883e', 2);
INSERT INTO `taikhoan` VALUES (4, 'phuvinh', '827ccb0eea8a706c4c34a16891f84e7b', 1);

SET FOREIGN_KEY_CHECKS = 1;
