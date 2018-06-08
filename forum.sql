/*
Navicat MySQL Data Transfer

Source Server         : Forum
Source Server Version : 50168
Source Host           : localhost:3306
Source Database       : forum

Target Server Type    : MYSQL
Target Server Version : 50168
File Encoding         : 65001

Date: 2018-06-07 15:25:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `comment`
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `cId` int(12) NOT NULL AUTO_INCREMENT,
  `cContent` varchar(300) NOT NULL,
  `byId` int(6) NOT NULL COMMENT 'post表的pId',
  `userId` int(6) NOT NULL,
  `time` time DEFAULT NULL,
  PRIMARY KEY (`cId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('1', 'You can remove some unnecessary variables. I left them just to help you understand how the process works.', '7', '4', null);
INSERT INTO `comment` VALUES ('2', 'down voteAs the question has been tagged with data.table, here is a corresponding solution which uses some tricky arithmetic with NA and logical value.', '7', '3', null);
INSERT INTO `comment` VALUES ('3', 'The trick here is to use the fact that', '7', '1', null);

-- ----------------------------
-- Table structure for `post`
-- ----------------------------
DROP TABLE IF EXISTS `post`;
CREATE TABLE `post` (
  `pId` int(6) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `pContent` varchar(300) NOT NULL,
  `userId` int(6) NOT NULL,
  `time` date DEFAULT NULL,
  `userName` char(10) NOT NULL,
  PRIMARY KEY (`pId`,`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of post
-- ----------------------------
INSERT INTO `post` VALUES ('1', '10 Kids Unaware of Their Halloween Costume', 'It\'s one thing to subject yourself to a Halloween costume mishap because, hey, that\'s your prerogative.', '1', null, 'Fyj');
INSERT INTO `post` VALUES ('2', 'What Instagram Ads Will Look Like', 'Instagram offered a first glimpse at what its ads will look like in a blog post Thursday. The sample ad, which you can see below.', '2', null, 'Tom');
INSERT INTO `post` VALUES ('3', 'The Future of Magazines Is on Tablets', 'Eric Schmidt has seen the future of magazines, and it\'s on the tablet. At a Magazine Publishers Association.', '3', null, 'Lucy');
INSERT INTO `post` VALUES ('4', 'Pinterest Now Worth $3.8 Billion', 'Pinterest\'s valuation is closing in on $4 billion after its latest funding round of $225 million, according to a report.', '4', null, 'Rose');
INSERT INTO `post` VALUES ('5', 'Edit Visual Studio Team project on Mac', 'I am working on a Xamarin.Forms project using Visual Studio. The project is hosted at Visual Studio Online and I edit it with Team Explorer.', '1', null, 'Fyj');
INSERT INTO `post` VALUES ('6', 'Android Webview with Geolocation', 'I have a very, very simple scenario and I am running into a very common issue', '4', null, 'Rose');
INSERT INTO `post` VALUES ('7', 'Code 1/0 based on previous year', 'What I want to do is I want to plot the values in special way. On the x-Axis there should be the years and months?', '2', null, 'Tom');

-- ----------------------------
-- Table structure for `test`
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `user` char(5) NOT NULL,
  `ps` char(5) NOT NULL,
  PRIMARY KEY (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of test
-- ----------------------------
INSERT INTO `test` VALUES ('tom', '123');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(6) NOT NULL AUTO_INCREMENT,
  `name` char(10) NOT NULL,
  `password` char(16) NOT NULL,
  `email` varchar(30) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `intro` varchar(50) DEFAULT NULL,
  `time` date DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'Fyj', 'Fyj', null, null, null, null);
INSERT INTO `user` VALUES ('2', 'Tom', 'Tom', null, null, null, null);
INSERT INTO `user` VALUES ('3', 'Lucy', 'Lucy', null, null, null, null);
INSERT INTO `user` VALUES ('4', 'Rose', 'Rose', null, null, null, null);
INSERT INTO `user` VALUES ('5', 'Bob', 'dsds', null, null, null, null);
INSERT INTO `user` VALUES ('6', 'test', 'test', null, null, null, null);
INSERT INTO `user` VALUES ('7', '', '', null, null, null, null);
INSERT INTO `user` VALUES ('8', '', '', null, null, null, null);

-- ----------------------------
-- Table structure for `via`
-- ----------------------------
DROP TABLE IF EXISTS `via`;
CREATE TABLE `via` (
  `userId` int(6) NOT NULL AUTO_INCREMENT,
  `avatar` char(12) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of via
-- ----------------------------
INSERT INTO `via` VALUES ('1', 'avatar1');
INSERT INTO `via` VALUES ('2', 'avatar2');
INSERT INTO `via` VALUES ('3', 'avatar3');
INSERT INTO `via` VALUES ('4', 'avatar4');
