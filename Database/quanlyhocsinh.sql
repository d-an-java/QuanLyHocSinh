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

 Date: 25/04/2019 23:40:44
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
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for giaovu
-- ----------------------------
DROP TABLE IF EXISTS `giaovu`;
CREATE TABLE `giaovu`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `diemchuandatmon` float(10, 2) NOT NULL,
  `tuoitoida` int(10) NOT NULL,
  `tuoitoithieu` int(10) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of giaovu
-- ----------------------------
INSERT INTO `giaovu` VALUES (1, 5.00, 15, 20);

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
) ENGINE = InnoDB AUTO_INCREMENT = 193 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hocsinh
-- ----------------------------
INSERT INTO `hocsinh` VALUES (1, '1910201', '10a2', 'Nguyen phu vinh', '16/01/2003', 'Nam', ' Quan 7', ' phuvinh@gmail.com');
INSERT INTO `hocsinh` VALUES (2, '1910101', '10a1', 'Ngô Nhật Huy', '30/08/1995', 'Nam', 'Quận 12', 'Huy@gmail.com');
INSERT INTO `hocsinh` VALUES (3, '1910102', '10a1', 'Lê Thúy', '23/04/2003', 'Nữ', 'Quan 3', ' king@gmail.com');
INSERT INTO `hocsinh` VALUES (4, '1910104', '10a1', 'Chau hai Hung', '15/06/2003', 'Nam', ' Quan 6', ' haihung@gmail.com');
INSERT INTO `hocsinh` VALUES (5, '1910105', '10a1', 'Nguyễn Hoa Huệ', '13/03/2003', 'Nữ', 'Tân Qui', 'hoahue@gmail.com');
INSERT INTO `hocsinh` VALUES (6, '1910106', '10a1', 'Nguyễn Tín', '11/05/2003', 'Nam', 'Vĩnh Kỳ, Hà Nam', 'tinnguyen@gmail.com');
INSERT INTO `hocsinh` VALUES (7, '1910107', '10a1', 'Nguyễn Phú', '23/04/2003', 'Nam', 'Quận 2', 'phunguyen@gmail.com');
INSERT INTO `hocsinh` VALUES (8, '1910108', '10a1', 'Lý Hoàng', '04/04/2003', 'Nam', 'Tiền Giang', 'hoang03@gmail.com');
INSERT INTO `hocsinh` VALUES (9, '1910109', '10a1', 'Trương Hồng', '23/03/2003', 'Nữ', 'Quận Thử Đức', 'hong03@gmail.com');
INSERT INTO `hocsinh` VALUES (10, '1910110', '10a1', 'Nguyễn Ngọc Nguyên', '24/05/2003', 'Nữ', 'Bến Tre', 'nguyenngon@gmail.com');
INSERT INTO `hocsinh` VALUES (11, '1910111', '10a1', 'Trương Hòa Binh', '03/04/2003', 'Nam', 'Quận 10', 'hoa11@gmail.com');
INSERT INTO `hocsinh` VALUES (12, '1910112', '10a1', 'Trương Mỹ Hoa', '16/09/2003', 'Nữ', 'Quận 9', 'hoamy@gmail.com');
INSERT INTO `hocsinh` VALUES (13, '1910113', '10a1', 'Nguyễn Tấn Dũng', '16/01/2003', 'Nam', 'Quận 1', 'dungcamau@gmail.com');
INSERT INTO `hocsinh` VALUES (14, '1910114', '10a1', 'Nguyễn Xuân Sắc', '14/01/2003', 'Nam', 'Hà Nội', 'xuannguyen@gmail.com');
INSERT INTO `hocsinh` VALUES (15, '1910115', '10a1', 'Trần Xuân Bắc', '24/01/2003', 'Nam', 'Nghệ An', 'xuantran@gmail.com');
INSERT INTO `hocsinh` VALUES (16, '1910116', '10a1', 'Nguyễn Hà Anh', '22/03/2003', 'Nữ', 'Phú Thọ', 'haanh@gmail.com');
INSERT INTO `hocsinh` VALUES (17, '1910117', '10a1', 'Nguyễn Phú Trường', '17/07/2003', 'Nam', 'Hà Đông', 'truongnguyen@gmail.com');
INSERT INTO `hocsinh` VALUES (18, '1910118', '10a1', 'Nguyễn Vĩnh', '14/07/2003', 'Nam', 'Nghệ An', 'vinhnguyen@gmail.com');
INSERT INTO `hocsinh` VALUES (19, '1910119', '10a1', 'Nguyễn Phú Trọng', '19/01/2003', 'Nam', 'Hà Bắc', 'phunguyen@gmail.com');
INSERT INTO `hocsinh` VALUES (20, '1910120', '10a1', 'Nguyễn Lê Anh ', '25/05/2003', 'Nữ', 'Quận 3', 'leanh@gmail.com');
INSERT INTO `hocsinh` VALUES (21, '1910121', '10a1', 'Nguyễn Khá Bảnh ', '28/07/2003', 'Nam', 'Hà Nội', 'khakha@gmail.com');
INSERT INTO `hocsinh` VALUES (22, '1910201', '10a2', 'Lê Hà Luyến', '15/06/2003', 'Nam', 'Hà Nội', 'luyenle@gmail.com');
INSERT INTO `hocsinh` VALUES (23, '1910202', '10a2', 'Hà Văn Luyện', '05/09/2003', 'Nam', 'Kỳ Anh', 'vanluyen@gmail.com');
INSERT INTO `hocsinh` VALUES (24, '1910203', '10a2', 'Lê Hà Tý', '09/09/2003', 'Nam', 'Cà Mau', 'tyha@gmail.com');
INSERT INTO `hocsinh` VALUES (25, '1910204', '10a2', 'Lê Trâm Huyền', '06/09/2003', 'Nữ', 'Quận 9', 'tram22@gmail.com');
INSERT INTO `hocsinh` VALUES (26, '1910205', '10a2', 'Lê Hoa Thu', '04/05/2003', 'Nữ ', 'Quận 3', 'thule@gmail.com');
INSERT INTO `hocsinh` VALUES (27, '1910206', '10a2', 'Lê Hoàn Hảo', '01/02/2003', 'Nam ', 'Quận 11', 'hoanhao@gmail.com');
INSERT INTO `hocsinh` VALUES (28, '1910207', '10a2', 'Lê Tý Anh', '04/06/2003', 'Nam ', 'Quận 5', 'anhty@gmail.com');
INSERT INTO `hocsinh` VALUES (29, '1910208', '10a2', 'Trương Hồ Tú Hảo', '14/02/2003', 'Nữ ', 'Quận 12', 'haotu14@gmail.com');
INSERT INTO `hocsinh` VALUES (30, '1910209', '10a2', 'Lê Hòa Bình', '04/12/2003', 'Nam ', 'Quận 2', 'hoabinh@gmail.com');
INSERT INTO `hocsinh` VALUES (31, '1910210', '10a2', 'Liên Hùng', '04/09/2003', 'Nam ', 'Quận 3', 'hunglen@gmail.com');
INSERT INTO `hocsinh` VALUES (32, '1910211', '10a2', 'Nguyễn Bính Hồ', '24/02/2003', 'Nam ', 'Quận 6', 'hobinh@gmail.com');
INSERT INTO `hocsinh` VALUES (33, '1910212', '10a2', 'Lê Dương Hoa', '04/03/2003', 'Nữ ', 'Quận 5', 'hoaduong@gmail.com');
INSERT INTO `hocsinh` VALUES (34, '1910213', '10a2', 'Dương Hoàn Lý', '14/12/2003', 'Nam ', 'Quận 12', 'lyhoan@gmail.com');
INSERT INTO `hocsinh` VALUES (35, '1910214', '10a2', 'Nguyễn Anh Viên', '24/02/2003', 'Nam ', 'Quận 9', 'vienanh@gmail.com');
INSERT INTO `hocsinh` VALUES (36, '1910215', '10a2', 'Lê Bảo Anh', '04/01/2003', 'Nữ ', 'Quận 8', 'baoanh@gmail.com');
INSERT INTO `hocsinh` VALUES (37, '1910216', '10a2', 'Hồ Quý Ly', '04/12/2003', 'Nam ', 'Quận 9', 'hoquy@gmail.com');
INSERT INTO `hocsinh` VALUES (38, '1910217', '10a2', 'Hồ Hảo Hến', '04/12/2003', 'Nam ', 'Quận 8', 'henho@gmail.com');
INSERT INTO `hocsinh` VALUES (39, '1910218', '10a2', 'Lê Tuyền Anh', '04/09/2003', 'Nữ ', 'Quận 4', 'anhle@gmail.com');
INSERT INTO `hocsinh` VALUES (40, '1910219', '10a2', 'Trương Anh Kiệt', '04/12/2003', 'Nam ', 'Quận 12', 'kietque@gmail.com');
INSERT INTO `hocsinh` VALUES (41, '1910220', '10a2', 'Lê Hùng Anh', '01/02/2003', 'Nam ', 'Quận 8', 'hunganh@gmail.com');
INSERT INTO `hocsinh` VALUES (42, '1910221', '10a2', 'Hồ Quang Huy', '04/12/2003', 'Nam ', 'Quận 11', 'quangle@gmail.com');
INSERT INTO `hocsinh` VALUES (43, '1910301', '10a3', 'Lê Tú ', '04/02/2003', 'Nữ ', 'Quận 5', 'tutu@gmail.com');
INSERT INTO `hocsinh` VALUES (44, '1910302', '10a3', 'Lê Hoàn Dân', '14/02/2003', 'Nam ', 'Quận 2', 'hoandan@gmail.com');
INSERT INTO `hocsinh` VALUES (45, '1910303', '10a3', 'Lê Hoàn Tín', '04/03/2003', 'Nam ', 'Quận 2', 'hoanle@gmail.com');
INSERT INTO `hocsinh` VALUES (46, '1910304', '10a3', 'Dương Bá Cảnh', '04/12/2003', 'Nam ', 'Quận 1', 'baba@gmail.com');
INSERT INTO `hocsinh` VALUES (47, '1910305', '10a3', 'Lê Dương Bảo Bảo', '18/02/2003', 'Nam ', 'Quận 5', 'baobao@gmail.com');
INSERT INTO `hocsinh` VALUES (48, '1910306', '10a3', 'Lê Anh Bá', '04/06/2003', 'Nam ', 'Quận 1', 'baanh@gmail.com');
INSERT INTO `hocsinh` VALUES (49, '1910307', '10a3', 'Nguyễn Tú Hảo', '04/09/2003', 'Nữ ', 'Quận 11', 'haotu@gmail.com');
INSERT INTO `hocsinh` VALUES (50, '1910308', '10a3', 'Ninh Dương Bảo', '18/02/2003', 'Nam ', 'Quận 1', 'baoninh@gmail.com');
INSERT INTO `hocsinh` VALUES (51, '1910309', '10a3', 'Nguyễn Hoàn Tú', '04/12/2003', 'Nữ ', 'Quận 4', 'hoantu@gmail.com');
INSERT INTO `hocsinh` VALUES (52, '1910310', '10a3', 'Lê Ngọc Ánh', '04/12/2003', 'Nữ ', 'Quận 1', 'ngocanh@gmail.com');
INSERT INTO `hocsinh` VALUES (53, '1910311', '10a3', 'Nguyễn Hoàn Tú Anh', '09/02/2003', 'Nữ ', 'Quận 8', 'hoantu@gmail.com');
INSERT INTO `hocsinh` VALUES (54, '1910312', '10a3', 'Nguyễn Lê Phi', '04/07/2003', 'Nam ', 'Quận Tân Phú', 'phiphi@gmail.com');
INSERT INTO `hocsinh` VALUES (55, '1910313', '10a3', 'Lê Diệc Phi', '02/02/2003', 'Nữ ', 'Quận 3', 'diecle@gmail.com');
INSERT INTO `hocsinh` VALUES (56, '1910314', '10a3', 'Trương Anh Phiên', '03/02/2003', 'Nam ', 'Quận 11', 'phienanh@gmail.com');
INSERT INTO `hocsinh` VALUES (57, '1910315', '10a3', 'Trần Anh Hoa', '04/12/2003', 'Nữ ', 'Quận 6', 'caumuoi@gmail.com');
INSERT INTO `hocsinh` VALUES (58, '1910316', '10a3', 'Lê Trí Anh', '04/07/2003', 'Nam ', 'Quận 11', 'anhtri@gmail.com');
INSERT INTO `hocsinh` VALUES (59, '1910317', '10a3', 'Trần Minh Hoàng', '03/02/2003', 'Nam ', 'Quận 12', 'minhhoang@gmail.com');
INSERT INTO `hocsinh` VALUES (60, '1910318', '10a3', 'Châu Anh Hảo', '04/01/2003', 'Nam ', 'Quận 2', 'haoanh@gmail.com');
INSERT INTO `hocsinh` VALUES (61, '1910319', '10a3', 'Châu Chí Hùng', '03/02/2003', 'Nam ', 'Quận 12', 'hunghung@gmail.com');
INSERT INTO `hocsinh` VALUES (62, '1910320', '10a3', 'Lê Hoàn Hảo', '04/11/2003', 'Nam ', 'Quận 9', 'haohaohoan@gmail.com');
INSERT INTO `hocsinh` VALUES (63, '1910401', '10a4', 'Lê Hà Anh', '04/12/2003', 'Nữ ', 'Quận 5', 'haanh@gmail.com');
INSERT INTO `hocsinh` VALUES (64, '1910402', '10a4', 'Lê Bá Hảo', '04/01/2003', 'Nam', 'Quận 1', 'haoba@gmail.com');
INSERT INTO `hocsinh` VALUES (65, '1910403', '10a4', 'Trần Tú Hảo', '14/02/2003', 'Nam ', 'Quận 11', 'haotrantu@gmail.com');
INSERT INTO `hocsinh` VALUES (66, '1910404', '10a4', 'Lê Dương Tú Hảo', '04/04/2003', 'Nữ ', 'Quận 12', 'haotutu@gmail.com');
INSERT INTO `hocsinh` VALUES (67, '1910405', '10a4', 'Dương Tú Hảo', '14/02/2003', 'Nam ', 'Quận 4', 'haoduongtu@gmail.com');
INSERT INTO `hocsinh` VALUES (68, '1910406', '10a4', 'Đường Bá Tú', '19/02/2003', 'Nam ', 'Quận 8', 'batu@gmail.com');
INSERT INTO `hocsinh` VALUES (69, '1910407', '10a4', 'Trương Mỹ Hoa', '19/02/2003', 'Nữ ', 'Quận Bình Thạnh', 'hoamy@gmail.com');
INSERT INTO `hocsinh` VALUES (70, '1910408', '10a4', 'Trương Vệ Kiện', '04/12/2003', 'Nam ', 'Quận Tân Bình', 'kienkien@gmail.com');
INSERT INTO `hocsinh` VALUES (71, '1910409', '10a4', 'Hoàng Thùy Linh', '11/02/2003', 'Nữ ', 'Quận 9', 'linhthuy@gmail.com');
INSERT INTO `hocsinh` VALUES (72, '1910410', '10a4', 'Lê Bảo', '04/12/2003', 'Nam ', 'Quận 11', 'baole@gmail.com');
INSERT INTO `hocsinh` VALUES (73, '1910411', '10a4', 'Anh Tú', '09/02/2003', 'Nam ', 'Quận 1', 'anhtu@gmail.com');
INSERT INTO `hocsinh` VALUES (74, '1910412', '10a4', 'Hoàng Bảo Anh', '04/06/2003', 'Nữ ', 'Quận 2', 'baoanh@gmail.com');
INSERT INTO `hocsinh` VALUES (75, '1910413', '10a4', 'Hồ Trung Kiên', '19/02/2003', 'Nam ', 'Quận Gò Vấp', 'anhhungca@gmail.com');
INSERT INTO `hocsinh` VALUES (76, '1910414', '10a4', 'Lê Dương Hòa', '03/02/2003', 'Nam ', 'Quận Bình Thạnh', 'kykaka@gmail.com');
INSERT INTO `hocsinh` VALUES (77, '1910415', '10a4', 'Hồ Dũng Anh', '04/11/2003', 'Nam ', 'Quận Bình Chánh', 'kythuatgia@gmail.com');
INSERT INTO `hocsinh` VALUES (78, '1910416', '10a4', 'Lê Tuấn Dũng', '13/02/2003', 'Nam ', 'Quận Tân Phú', 'nguoigiakim@gmail.com');
INSERT INTO `hocsinh` VALUES (79, '1910417', '10a4', 'Nguyễn Bá Tiên', '24/02/2003', 'Nam ', 'Quận 3', 'tienbadao@gmail.com');
INSERT INTO `hocsinh` VALUES (80, '1910418', '10a4', 'Đinh Bá Hùng', '04/12/2003', 'Nam ', 'Quận 8', 'hungbathienha@gmail.com');
INSERT INTO `hocsinh` VALUES (81, '1910419', '10a4', 'Trương Hoa Tú', '14/02/2003', 'Nữ ', 'Quận 9', 'hoatu@gmail.com');
INSERT INTO `hocsinh` VALUES (82, '1910420', '10a4', 'Nguyễn Vy', '14/09/2003', 'Nữ ', 'Quận 5', 'vyvy@gmail.com');
INSERT INTO `hocsinh` VALUES (83, '1811101', '11a1', 'Đường Thái Tông', '04/12/2002', 'Nam ', 'Quận 5', 'vuanhaduong@gmail.com');
INSERT INTO `hocsinh` VALUES (84, '1811102', '11a1', 'Đường Bá Hổ', '24/02/2002', 'Nam ', 'Quận 1', 'thitai@gmail.com');
INSERT INTO `hocsinh` VALUES (85, '1811103', '11a1', 'Đường Thế Dân', '04/12/2002', 'Nam ', 'Quận 3', 'vuanhaduong@gmail.com');
INSERT INTO `hocsinh` VALUES (86, '1811104', '11a1', 'Trần Nhân Tông', '19/02/2002', 'Nam ', 'Quận 12', 'vuavietnam@gmail.com');
INSERT INTO `hocsinh` VALUES (87, '1811105', '11a1', 'Trần Thế Tông', '18/02/2002', 'Nam ', 'Quận 8', 'vuanhatran@gmail.com');
INSERT INTO `hocsinh` VALUES (88, '1811106', '11a1', 'Hồ Quý Lý', '04/12/2002', 'Nam ', 'Quận 5', 'phando@gmail.com');
INSERT INTO `hocsinh` VALUES (89, '1811107', '11a1', 'Dương Văn Lâm', '18/09/2002', 'Nam ', 'Quận 9', 'lamrung@gmail.com');
INSERT INTO `hocsinh` VALUES (90, '1811108', '11a1', 'Lý Bá Cảnh', '12/02/2002', 'Nam ', 'Quận 2', 'canhba@gmail.com');
INSERT INTO `hocsinh` VALUES (91, '1811109', '11a1', 'Dương Mỹ Hạnh', '15/02/2002', 'Nữ ', 'Quận 4', 'hanhmy@gmail.com');
INSERT INTO `hocsinh` VALUES (92, '1811110', '11a1', 'Lê Huỳnh Anh', '04/12/2002', 'Nữ ', 'Quận 3', 'huynhanhsin@gmail.com');
INSERT INTO `hocsinh` VALUES (93, '1811111', '11a1', 'Lê Ngọc Anh', '09/02/2002', 'Nữ ', 'Quận Tân Phú', 'anhngoc@gmail.com');
INSERT INTO `hocsinh` VALUES (94, '1811112', '11a1', 'Nguyễn Vĩnh Viên', '14/02/2002', 'Nam ', 'Quận Bình Thạnh', 'vienvien@gmail.com');
INSERT INTO `hocsinh` VALUES (95, '1811113', '11a1', 'Ngô Gia Tự', '11/02/2002', 'Nam ', 'Quận 5', 'giatustreet@gmail.com');
INSERT INTO `hocsinh` VALUES (96, '1811114', '11a1', 'Ngô Gia Bảo', '04/04/2002', 'Nam ', 'Quận 10', 'baobao@gmail.com');
INSERT INTO `hocsinh` VALUES (97, '1811115', '11a1', 'Lê Vĩnh Kỳ', '04/05/2002', 'Nam ', 'Quận 1', 'kyky@gmail.com');
INSERT INTO `hocsinh` VALUES (98, '1811116', '11a1', 'Lê Tú Duyên', '24/02/2002', 'Nữ ', 'Quận Bình Thạnh', 'duyenduyengmail.com');
INSERT INTO `hocsinh` VALUES (99, '1811117', '11a1', 'Lê Tôn Tú Hảo', '04/12/2002', 'Nữ ', 'Quận 9', 'congchuanhanguyen@gmail.com');
INSERT INTO `hocsinh` VALUES (100, '1811118', '11a1', 'Tôn Tằng Quý Hảo', '04/09/2002', 'Nữ ', 'Quận 3', 'quyhoa@gmail.com');
INSERT INTO `hocsinh` VALUES (101, '1811119', '11a1', 'Lưu Diệc Phi', '02/02/2002', 'Nữ ', 'Quận 9', 'hoahongdo@gmail.com');
INSERT INTO `hocsinh` VALUES (102, '1811120', '11a1', 'Lưu Thi Thi', '04/05/2002', 'Nữ ', 'Quận 11', 'thuthu@gmail.com');
INSERT INTO `hocsinh` VALUES (103, '1811201', '11a2', 'Lê Bá Cảnh', '01/02/2002', 'Nam ', 'Quận 5', 'bacanh@gmail.com');
INSERT INTO `hocsinh` VALUES (104, '1811202', '11a2', 'Trần Tú Hảo', '02/03/2002', 'Nữ ', 'Quận 2', 'haotu@gmail.com');
INSERT INTO `hocsinh` VALUES (105, '1811203', '11a2', 'Dương Tú Hảo', '03/02/2002', 'Nữ ', 'Quận 4', 'haotu@gmail.com');
INSERT INTO `hocsinh` VALUES (106, '1811204', '11a2', 'Lê Hiểu Anh', '03/05/2002', 'Nữ ', 'Quận 7', 'hieuanh@gmail.com');
INSERT INTO `hocsinh` VALUES (107, '1811205', '11a2', 'Trần Bảo Lâm', '04/03/2002', 'Nam ', 'Quận 2', 'baolam@gmail.com');
INSERT INTO `hocsinh` VALUES (108, '1811206', '11a2', 'Trần Dương Anh Huy', '05/07/2002', 'Nam ', 'Quận 4', 'haotu@gmail.com');
INSERT INTO `hocsinh` VALUES (109, '1811207', '11a2', 'Hồ Quang Ca', '06/02/2002', 'Nam ', 'Quận 7', 'quangcaca@gmail.com');
INSERT INTO `hocsinh` VALUES (110, '1811208', '11a2', 'Hồ Quang Huy', '07/09/2002', 'Nam ', 'Quận 9', 'huyhuya@gmail.com');
INSERT INTO `hocsinh` VALUES (111, '1811209', '11a2', 'Hồ Quang Diệu', '08/02/2002', 'Nam ', 'Quận 4', 'quangdieu@gmail.com');
INSERT INTO `hocsinh` VALUES (112, '1811210', '11a2', 'Hồ Lên Anh Thảo', '09/04/2002', 'Nữ ', 'Quận 6', 'anhthao@gmail.com');
INSERT INTO `hocsinh` VALUES (113, '1811211', '11a2', 'Trần Dương Tú', '01/04/2002', 'Nam ', 'Quận 2', 'tuduong@gmail.com');
INSERT INTO `hocsinh` VALUES (114, '1811212', '11a2', 'Nguyễn Tiên Thảo', '02/05/2002', 'Nữ ', 'Quận 7', 'tientien@gmail.com');
INSERT INTO `hocsinh` VALUES (115, '1811213', '11a2', 'Nguyễn Cẩm Tiên', '04/06/2002', 'Nữ ', 'Quận 2', 'tiencam@gmail.com');
INSERT INTO `hocsinh` VALUES (116, '1811214', '11a2', 'Nguyễn Duy Tiến', '05/04/2002', 'Nam ', 'Quận 7', 'itech@gmail.com');
INSERT INTO `hocsinh` VALUES (117, '1811215', '11a2', 'Trần Hoàng Hồng', '06/03/2002', 'Nữ ', 'Quận 3', 'honghong@gmail.com');
INSERT INTO `hocsinh` VALUES (118, '1811216', '11a2', 'Trần Tú Duyên', '02/01/2002', 'Nữ ', 'Quận 2', 'duyentu@gmail.com');
INSERT INTO `hocsinh` VALUES (119, '1811217', '11a2', 'Lâm Anh Duy', '09/07/2002', 'Nam ', 'Quận 9', 'duyduygmail.com');
INSERT INTO `hocsinh` VALUES (120, '1811218', '11a2', 'Trần Dương Tuyền', '11/04/2002', 'Nữ ', 'Quận 11', 'tuyen22@gmail.com');
INSERT INTO `hocsinh` VALUES (173, '1712221', '12a2', 'Trịnh Kim Anh', '22/02/2001', 'Nữ ', 'Quận 5', 'anhkim121@gmail.com');
INSERT INTO `hocsinh` VALUES (174, '1712222', '12a2', 'Trịnh Cẩm Đào', '15/03/2001', 'Nữ ', 'Quận 2', 'daotrinh@gmail.com');
INSERT INTO `hocsinh` VALUES (175, '1712223', '12a2', 'Dương Cẩm Tiên', '12/11/2001', 'Nữ ', 'Quận 4', 'camtien192@gmail.com');
INSERT INTO `hocsinh` VALUES (176, '1712224', '12a2', 'Lê Hoàng Tiên', '03/05/2001', 'Nữ ', 'Quận 7', 'tienle182@gmail.com');
INSERT INTO `hocsinh` VALUES (177, '1712225', '12a2', 'Trần Bá Lâm', '22/03/2001', 'Nam ', 'Quận 12', 'balam979@gmail.com');
INSERT INTO `hocsinh` VALUES (178, '1712226', '12a2', 'Dương Anh Huy', '05/07/2001', 'Nam ', 'Quận 4', 'hao183tu@gmail.com');
INSERT INTO `hocsinh` VALUES (179, '1712227', '12a2', 'Nguyễn Kiều Huy', '14/11/2001', 'Nam ', 'Quận 7', 'huy9263@gmail.com');
INSERT INTO `hocsinh` VALUES (180, '1712228', '12a2', 'Lê Sĩ Hùng', '22/11/2001', 'Nam ', 'Quận 9', 'húngi868@gmail.com');
INSERT INTO `hocsinh` VALUES (181, '1712229', '12a2', 'Hoàng Kim Yến', '08/02/2001', 'Nữ ', 'Quận 4', 'yenyenmuimui@gmail.com');
INSERT INTO `hocsinh` VALUES (182, '1712230', '12a2', 'Lê Anh Tín', '11/04/2001', 'Nam ', 'Quận 6', 'tianh989@gmail.com');
INSERT INTO `hocsinh` VALUES (183, '1712231', '12a2', 'Lương Cung Cảnh', '01/04/2001', 'Nam ', 'Quận 12', 'tienkiemkyhiep111@gmail.com');
INSERT INTO `hocsinh` VALUES (184, '1712232', '12a2', 'Nguyễn Hoàng Thùy', '12/05/2001', 'Nữ ', 'Quận 7', 'linhthuy27@gmail.com');
INSERT INTO `hocsinh` VALUES (185, '1712233', '12a2', 'Trần Công Tiển', '04/06/2001', 'Nam ', 'Quận 2', 'cungtien273@gmail.com');
INSERT INTO `hocsinh` VALUES (186, '1712234', '12a2', 'Lý Hoàng Kim', '05/11/2001', 'Nữ ', 'Quận 7', 'kile@gmail.com');
INSERT INTO `hocsinh` VALUES (187, '1712235', '12a2', 'Lý Kinh Hòa', '26/11/2001', 'Nữ ', 'Quận 3', 'hoalekinh2920@gmail.com');
INSERT INTO `hocsinh` VALUES (188, '1712236', '12a2', 'Nguyễn Dương Thảo', '27/01/2001', 'Nữ ', 'Quận 12', 'thao271@gmail.com');
INSERT INTO `hocsinh` VALUES (189, '1712237', '12a2', 'Trần Vĩnh Kiên', '31/09/2001', 'Nam ', 'Quận 1', 'vinhkien182@gmail.com');
INSERT INTO `hocsinh` VALUES (190, '1712238', '12a2', 'Lê Văn Dương', '23/01/2001', 'Nam ', 'Quận 1', 'duongle193@gmail.com');
INSERT INTO `hocsinh` VALUES (191, '1712239', '12a2', 'Trần Hòa Dân', '12/11/2001', 'Nam ', 'Quận 2', 'danhoa173@gmail.com');
INSERT INTO `hocsinh` VALUES (192, '1712240', '12a2', 'Lê Văn Lưu', '19/12/2001', 'Nam ', 'Quận 2', 'luuluyen183@gmail.com');

-- ----------------------------
-- Table structure for khoi
-- ----------------------------
DROP TABLE IF EXISTS `khoi`;
CREATE TABLE `khoi`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `tenkhoi` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sisotoida` int(10) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of khoi
-- ----------------------------
INSERT INTO `khoi` VALUES (1, 'lớp 10', 41);
INSERT INTO `khoi` VALUES (2, 'lớp 11', 46);
INSERT INTO `khoi` VALUES (3, 'lớp 12', 40);

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
INSERT INTO `lop` VALUES (1, '10a1', '10 A1', 1, 3);
INSERT INTO `lop` VALUES (2, '10a2', '10 A2', 1, 1);
INSERT INTO `lop` VALUES (3, '10a3', '10 A3', 1, 1);
INSERT INTO `lop` VALUES (4, '10a4', '10 A4', 1, 0);
INSERT INTO `lop` VALUES (5, '11a1', '11 A1', 2, 0);
INSERT INTO `lop` VALUES (6, '11a2', '11 A2', 2, 0);
INSERT INTO `lop` VALUES (7, '11a3', '11 A3', 2, 0);
INSERT INTO `lop` VALUES (8, '12a1', '12 A1', 3, 0);
INSERT INTO `lop` VALUES (9, '12a2', '12 A2', 3, 0);

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
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

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
