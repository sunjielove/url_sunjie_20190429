/*
 Navicat Premium Data Transfer

 Source Server         : ORM
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : shorturl

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 29/04/2019 21:01:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_shorturl
-- ----------------------------
DROP TABLE IF EXISTS `t_shorturl`;
CREATE TABLE `t_shorturl`  (
  `shortId` int(11) NOT NULL AUTO_INCREMENT,
  `shortUrlCode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `longUrl` text CHARACTER SET utf8 COLLATE utf8_general_ci,
  `device` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `shortPrefix` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`shortId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_shorturl
-- ----------------------------
INSERT INTO `t_shorturl` VALUES (13, 'zaUb6f', 'https://www.baidu.com/', NULL, 'goo.cn');
INSERT INTO `t_shorturl` VALUES (14, 'QvqQFv', 'https://www.baidu.com/s?wd=%E4%B8%89%E7%9B%AE%E8%BF%90%E7%AE%97%E7%AC%A6&rsv_spt=1&rsv_iqid=0x8693f3a8003116a8&issp=1&f=8&rsv_bp=1&rsv_idx=2&ie=utf-8&tn=baiduhome_pg&rsv_enter=1&rsv_sug3=5&rsv_sug1=3&rsv_sug7=101', NULL, 'goo.cn');
INSERT INTO `t_shorturl` VALUES (15, 'IzUVbi', 'https://www.baidu.com/s?wd=shiro%E5%8E%9F%E7%90%86&rsv_spt=1&rsv_iqid=0xf9f9bae6000dc871&issp=1&f=3&rsv_bp=1&rsv_idx=2&ie=utf-8&tn=baiduhome_pg&rsv_enter=1&rsv_sug3=1&rsv_sug1=1&rsv_sug7=001&rsv_sug2=1&rsp=3&rsv_sug9=es_2_1&inputT=51985&rsv_sug4=51985&rsv_sug=9', NULL, 'goo.cn');
INSERT INTO `t_shorturl` VALUES (16, 'YnyYju', 'https://www.baidu.com/s?wd=mysql%20varchar%20%E6%9C%80%E5%A4%A7%E9%95%BF%E5%BA%A6&rsv_spt=1&rsv_iqid=0x8693f3a8003116a8&issp=1&f=8&rsv_bp=1&rsv_idx=2&ie=utf-8&rqlang=cn&tn=baiduhome_pg&rsv_enter=1&oq=mysql%25E5%25AD%2598%25E5%2582%25A8%25E9%2595%25BF%25E5%25AD%2597%25E7%25AC%25A6%25E4%25B8%25B2&rsv_t=6f99wqUnFZqDFQyFgYyafi2uSmVK%2BMe93kZcuk9Q8CvhI83UeTSM3v%2F4m0ihLS9COKSS&inputT=16096&rsv_pq=87b7f35a0011a634&rsv_sug3=143&rsv_sug1=125&rsv_sug7=100&bs=mysql%E5%AD%98%E5%82%A8%E9%95%BF%E5%AD%97%E7%AC%A6%E4%B8%B2', NULL, 'sj.cn');

SET FOREIGN_KEY_CHECKS = 1;
