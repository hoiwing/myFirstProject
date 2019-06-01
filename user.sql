/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : day17

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 01/06/2019 17:12:41
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `gender` varchar(5) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `address` varchar(32) DEFAULT NULL,
  `qq` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `username` varchar(32) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1047 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (1, '王五', '男', 13, '陕西', '12345', 'zs@qq.com', 'zhangsan', '123');
INSERT INTO `user` VALUES (1010, '王五', '男', 13, '陕西', '12345', 'zs@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1011, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1012, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1013, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1014, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1015, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1016, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1017, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1018, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1019, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1020, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1021, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1022, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1023, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1024, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1025, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1026, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1027, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1028, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1029, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1030, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1031, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1032, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1033, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1034, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1035, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1036, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1037, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1038, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1039, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1040, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1041, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1042, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1043, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1044, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1045, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn', NULL, NULL);
INSERT INTO `user` VALUES (1046, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn', NULL, NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
