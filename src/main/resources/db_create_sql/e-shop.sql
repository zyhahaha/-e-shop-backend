/*
Navicat MySQL Data Transfer

Source Server         : e-shop
Source Server Version : 80028
Source Host           : localhost:3306
Source Database       : e-shop

Target Server Type    : MYSQL
Target Server Version : 80028
File Encoding         : 65001

Date: 2022-03-26 23:06:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for shop-cart
-- ----------------------------
DROP TABLE IF EXISTS `shop-cart`;
CREATE TABLE `shop-cart` (
  `id` int NOT NULL,
  `product_id` int DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Table structure for shop-order
-- ----------------------------
DROP TABLE IF EXISTS `shop-order`;
CREATE TABLE `shop-order` (
  `id` int NOT NULL,
  `order_no` varchar(128) DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  `total_price` int DEFAULT NULL,
  `receiver_name` varchar(32) DEFAULT NULL,
  `receiver_mobile` varchar(32) DEFAULT NULL,
  `receiver_address` varchar(128) DEFAULT NULL,
  `order_status` int DEFAULT NULL,
  `postage` int DEFAULT NULL,
  `payment_type` int DEFAULT NULL,
  `pay_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `delivery_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `end_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Table structure for shop-order-item
-- ----------------------------
DROP TABLE IF EXISTS `shop-order-item`;
CREATE TABLE `shop-order-item` (
  `id` int NOT NULL,
  `order_no` varchar(128) DEFAULT NULL,
  `product_id` int DEFAULT NULL,
  `product_name` varchar(100) DEFAULT NULL,
  `product_img` varchar(128) DEFAULT NULL,
  `unit_price` int DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `total_price` int DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Table structure for shop-product
-- ----------------------------
DROP TABLE IF EXISTS `shop-product`;
CREATE TABLE `shop-product` (
  `id` int NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `image` varchar(500) DEFAULT NULL,
  `detail` varchar(500) DEFAULT NULL,
  `category_id` int DEFAULT NULL,
  `price` int DEFAULT NULL,
  `stock` int DEFAULT NULL,
  `status` int DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Table structure for shop-user
-- ----------------------------
DROP TABLE IF EXISTS `shop-user`;
CREATE TABLE `shop-user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(32) DEFAULT NULL COMMENT '用户名',
  `password` varchar(50) DEFAULT NULL,
  `role` int(4) unsigned zerofill DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COMMENT='用户名';

-- ----------------------------
-- Table structure for usertable
-- ----------------------------
DROP TABLE IF EXISTS `usertable`;
CREATE TABLE `usertable` (
  `username` varchar(255) DEFAULT NULL,
  `userpassword` varchar(255) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `user_id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;
