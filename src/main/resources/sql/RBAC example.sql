CREATE TABLE `permission` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PID` int(11) DEFAULT NULL COMMENT '父节点名称',
  `NAME` varchar(50) NOT NULL COMMENT '名称',
  `TYPE` varchar(20) DEFAULT NULL COMMENT '类型:菜单or功能',
  `SORT` int(11) DEFAULT NULL COMMENT '排序',
  `URL` varchar(255) DEFAULT NULL,
  `PERM_CODE` varchar(50) DEFAULT NULL COMMENT '菜单编码',
  `ICON` varchar(255) DEFAULT NULL,
  `STATE` varchar(10) DEFAULT NULL,
  `DESCRIPTION` text,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=144 DEFAULT CHARSET=utf8;

/*Data for the table `permission` */

insert  into `permission`(`ID`,`PID`,`NAME`,`TYPE`,`SORT`,`URL`,`PERM_CODE`,`ICON`,`STATE`,`DESCRIPTION`) 
values (1,NULL,'系统管理','F',1,'','','&#xe62e;','',''),
(2,1,'角色管理','F',3,'/role/list','','icon-hamburg-my-account','closed',''),
(3,1,'用户管理','F',2,'/system/user/list','','icon-hamburg-user','closed',''),
(4,2,'添加','O',NULL,'','sys:role:add','','','角色添加'),
(7,3,'添加','O',NULL,'','sys:user:add','','','用户添加'),
(12,1,'权限管理','F',5,'/function/list','','icon-hamburg-login','closed',''),
(14,15,'系统数据源监控','F',6,'/druid','','icon-hamburg-database','',''),
(15,NULL,'系统监控','F',5,'','','&#xe62e;','',''),
(37,15,'定时任务管理','F',NULL,'/schedule/list','','icon-hamburg-full-time',NULL,'定时任务管理，支持集群'),
(39,1,'菜单管理','F',4,'/permission/list','','icon-hamburg-old-versions',NULL,''),
(45,39,'修改','O',NULL,'','sys:perm:update',NULL,NULL,'菜单管理'),
(58,39,'添加','O',NULL,'','sys:perm:add',NULL,NULL,'菜单管理'),
(59,39,'删除','O',NULL,'','sys:perm:delete',NULL,NULL,'菜单管理'),
(61,40,'添加','O',NULL,'','sys:dict:add',NULL,NULL,'字典管理'),
(62,40,'删除','O',NULL,'','sys:dict:delete',NULL,NULL,'字典管理'),
(63,40,'修改','O',NULL,'','sys:dict:update',NULL,NULL,'字典管理'),
(69,40,'查看','O',NULL,'','sys:dict:view',NULL,NULL,'字典管理'),
(70,39,'查看','O',NULL,'','sys:perm:menu:view',NULL,NULL,'菜单管理'),
(72,71,'酒店列表','F',NULL,'shop/goods',NULL,'icon-hamburg-product',NULL,'商品管理'),
(73,71,'房型管理','F',NULL,'shop/goodsType',NULL,'icon-hamburg-milestone',NULL,'商品类型'),
(79,78,'城市列表',NULL,NULL,'/city/list',NULL,NULL,NULL,NULL),
(80,78,'线路列表',NULL,NULL,'/line/list',NULL,NULL,NULL,NULL),
(92,15,'邮件发送管理',NULL,NULL,'/email/list',NULL,NULL,NULL,'发送邮件信息'),
(93,79,'添加城市',NULL,NULL,NULL,'sys:city:add',NULL,NULL,'添加城市'),
(94,79,'删除城市',NULL,NULL,NULL,'sys:city:delete',NULL,NULL,''),
(95,80,'添加线路',NULL,NULL,NULL,'sys:line:add',NULL,NULL,'添加线路'),
(96,80,'删除线路',NULL,NULL,NULL,'sys:line:delete',NULL,NULL,''),
(97,3,'删除用户',NULL,NULL,NULL,'sys:user:delete',NULL,NULL,'删除用户'),
(98,3,'设置角色',NULL,NULL,NULL,'sys:user:toRole',NULL,NULL,'设置角色'),
(99,2,'修改',NULL,NULL,NULL,'sys:role:update',NULL,NULL,''),
(100,39,'子菜单-添加',NULL,NULL,NULL,'sys:subperm:add',NULL,NULL,''),
(101,39,'子菜单-修改',NULL,NULL,NULL,'sys:subperm:update',NULL,NULL,''),
(102,39,'子菜单-删除',NULL,NULL,NULL,'sys:subperm:delete',NULL,NULL,''),
(103,12,'添加权限',NULL,NULL,NULL,'sys:permission:add',NULL,NULL,''),
(104,12,'修改权限',NULL,NULL,NULL,'sys:permission:update',NULL,NULL,'修改权限'),
(105,12,'删除权限',NULL,NULL,NULL,'sys:permission:delete',NULL,NULL,'删除权限'),
(106,NULL,'系统统计',NULL,NULL,'',NULL,'&#xe61a;',NULL,'统计系统访问量'),
(107,106,'访问统计',NULL,NULL,'/logcount/index',NULL,NULL,NULL,''),
(108,37,'定时添加',NULL,NULL,NULL,'sys:quartz:add',NULL,NULL,'定时添加'),
(109,37,'定时删除',NULL,NULL,NULL,'sys:quartz:delete',NULL,NULL,'定时删除'),
(110,92,'邮件删除',NULL,NULL,NULL,'sys:email:delete',NULL,NULL,'邮件删除'),
(111,37,'立即执行一次',NULL,NULL,NULL,'sys:quartz:start',NULL,NULL,''),
(112,37,'暂停',NULL,NULL,NULL,'sys:quartz:stop',NULL,NULL,''),
(113,37,'恢复',NULL,NULL,NULL,'sys:quartz:resume',NULL,NULL,''),
(114,79,'修改城市',NULL,NULL,NULL,'sys:city:update',NULL,NULL,''),
(115,79,'区域删除',NULL,NULL,NULL,'sys:area:delete',NULL,NULL,''),
(116,79,'区域修改',NULL,NULL,NULL,'sys:area:update',NULL,NULL,''),
(117,80,'删除站名',NULL,NULL,NULL,'sys:station:delete',NULL,NULL,''),
(122,NULL,'评论管理',NULL,NULL,'',NULL,'&#xe622;',NULL,''),
(123,122,'意见反馈',NULL,NULL,'/comment/index',NULL,NULL,NULL,''),
(130,15,'邮件发送日志',NULL,NULL,'/email_log/index',NULL,NULL,NULL,''),
(131,106,'方法日志',NULL,NULL,'/method/list',NULL,NULL,NULL,''),
(132,NULL,'商品管理',NULL,NULL,NULL,NULL,'',NULL,NULL),
(133,132,'商品分类',NULL,NULL,'/weixinShopCategoryController/weixinShopCart',NULL,NULL,NULL,'微信商品分类'),
(134,NULL,'微信管理',NULL,NULL,NULL,NULL,'',NULL,NULL),
(135,134,'微信菜单',NULL,NULL,'/menuManagerController/list',NULL,NULL,NULL,'公众号首页菜单'),
(136,132,'商品管理',NULL,NULL,'/weixinShopGoodsController/weixinShopGoods',NULL,NULL,NULL,'管理商品'),
(137,NULL,'购买管理',NULL,NULL,NULL,NULL,'',NULL,NULL),
(138,137,'购物车管理',NULL,NULL,'/weixinShopCartController/weixinShopCart',NULL,NULL,NULL,''),
(139,NULL,'客服管理',NULL,NULL,NULL,NULL,'',NULL,NULL),
(140,139,'客服管理',NULL,NULL,'/customerServiceController/customerService',NULL,NULL,NULL,'客服管理'),
(141,134,'公众号管理',NULL,NULL,'/weixinAccountController/weixinAccount',NULL,NULL,NULL,''),
(142,1,'系统图标',NULL,NULL,'/system/icon',NULL,NULL,NULL,''),
(143,15,'定时任务表达式',NULL,NULL,'/systemCornController/list',NULL,NULL,NULL,'自定义定时任务');

DROP TABLE IF EXISTS `system_role`;

CREATE TABLE `system_role` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(20) NOT NULL,
  `ROLE_CODE` varchar(20) NOT NULL,
  `DESCRIPTION` text,
  `SORT` smallint(6) DEFAULT NULL,
  `DEL_FLAG` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `system_role` */

insert  into `system_role`(`ID`,`NAME`,`ROLE_CODE`,`DESCRIPTION`,`SORT`,`DEL_FLAG`) 
values (1,'admin','admin','admin',2,NULL),
(13,'superadmin','superadmin','超级管理员',1,NULL),
(14,'cs','cs','cs',NULL,NULL);
DROP TABLE IF EXISTS `system_role_permission`;

CREATE TABLE `system_role_permission` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ROLE_ID` int(11) DEFAULT NULL,
  `PERMISSION_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_ROLE_PER_REFERENCE_PERMISSI` (`PERMISSION_ID`) USING BTREE,
  KEY `FK_ROLE_PER_REFERENCE_ROLE` (`ROLE_ID`) USING BTREE,
  CONSTRAINT `system_role_permission_ibfk_1` FOREIGN KEY (`PERMISSION_ID`) REFERENCES `permission` (`ID`),
  CONSTRAINT `system_role_permission_ibfk_2` FOREIGN KEY (`ROLE_ID`) REFERENCES `system_role` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3275 DEFAULT CHARSET=utf8;

/*Data for the table `system_role_permission` */

insert  into `system_role_permission`(`ID`,`ROLE_ID`,`PERMISSION_ID`) 
values (2616,1,79),(2617,1,80),(2618,1,106),(2619,1,107),(2627,1,131),(2631,1,122),(2632,1,123),(2633,1,1),(2634,1,2),(2635,1,3),(2636,1,12),(2637,1,39),(2638,1,15),(2639,1,14),(2640,1,37),(2641,1,92),(2642,1,130),(2807,14,79),(2808,14,93),(2809,14,94),(2810,14,114),(2811,14,115),(2812,14,116),(2813,14,80),(2814,14,95),(2815,14,96),(2816,14,117),(2817,14,1),(2818,14,3),(2819,14,7),(2820,14,97),(2821,14,98),(2822,14,2),(2823,14,4),(2824,14,99),(2825,14,39),(2826,14,45),(2827,14,58),(2828,14,59),(2829,14,70),(2830,14,100),(2831,14,101),(2832,14,102),(2833,14,12),(2834,14,103),(2835,14,104),(2836,14,105),(2837,14,15),(2838,14,37),(2839,14,108),(2840,14,109),(2841,14,111),(2842,14,112),(2843,14,113),(2844,14,92),(2845,14,110),(2846,14,130),(2847,14,14),(3227,13,106),(3228,13,107),(3229,13,131),(3230,13,122),(3231,13,123),(3232,13,132),(3233,13,133),(3234,13,136),(3235,13,134),(3236,13,135),(3237,13,141),(3238,13,137),(3239,13,138),(3240,13,139),(3241,13,140),(3242,13,1),(3243,13,2),(3244,13,4),(3245,13,99),(3246,13,3),(3247,13,7),(3248,13,97),(3249,13,98),(3250,13,12),(3251,13,103),(3252,13,104),(3253,13,105),(3254,13,39),(3255,13,45),(3256,13,58),(3257,13,59),(3258,13,70),(3259,13,100),(3260,13,101),(3261,13,102),(3262,13,142),(3263,13,15),(3264,13,14),(3265,13,37),(3266,13,108),(3267,13,109),(3268,13,111),(3269,13,112),(3270,13,113),(3271,13,92),(3272,13,110),(3273,13,130),(3274,13,143);

/*Table structure for table `system_user` */
DROP TABLE IF EXISTS `system_user`;

CREATE TABLE `system_user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(20) NOT NULL,
  `PASSWORD` varchar(255) NOT NULL,
  `SALT` varchar(255) DEFAULT NULL,
  `BIRTHDAY` datetime DEFAULT NULL,
  `GENDER` smallint(6) DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `PHONE` varchar(20) DEFAULT NULL,
  `ICON` varchar(500) DEFAULT NULL,
  `CREATE_DATE` datetime DEFAULT NULL,
  `STATE` char(1) DEFAULT NULL,
  `DESCRIPTION` text,
  `LOGIN_COUNT` int(11) DEFAULT NULL,
  `PREVIOUS_VISIT` datetime DEFAULT NULL,
  `LAST_VISIT` datetime DEFAULT NULL,
  `DEL_FLAG` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `system_user` */

insert  into `system_user`(`ID`,`NAME`,`PASSWORD`,`SALT`,`BIRTHDAY`,`GENDER`,`EMAIL`,`PHONE`,`ICON`,`CREATE_DATE`,`STATE`,`DESCRIPTION`,`LOGIN_COUNT`,`PREVIOUS_VISIT`,`LAST_VISIT`,`DEL_FLAG`) 
values (1,'admin','e10adc3949ba59abbe56e057f20f883e','3d06a5c14d010804','2014-03-16 22:44:39',1,'779205344@qq.com','123456789','aaa','2014-03-20 14:38:57','0','普通管理员',131,'2015-01-22 15:51:46','2015-01-22 16:49:13',NULL),
(6,'super','36bebf9f705f2582242853024b3a52d6','97efb48ee6adff63','2015-01-15 00:00:00',1,'779205344@qq.com','13721035120',NULL,'2015-01-15 15:55:37',NULL,'超级管理员',NULL,NULL,NULL,NULL);

/*Table structure for table `system_user_role` */

DROP TABLE IF EXISTS `system_user_role`;

CREATE TABLE `system_user_role` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_ID` int(11) NOT NULL,
  `ROLE_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_USER_ROL_REFERENCE_ROLE` (`ROLE_ID`) USING BTREE,
  KEY `FK_USER_ROL_REFERENCE_USERS` (`USER_ID`) USING BTREE,
  CONSTRAINT `system_user_role_ibfk_1` FOREIGN KEY (`ROLE_ID`) REFERENCES `system_role` (`ID`),
  CONSTRAINT `system_user_role_ibfk_2` FOREIGN KEY (`USER_ID`) REFERENCES `system_user` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `system_user_role` */

insert  into `system_user_role`(`ID`,`USER_ID`,`ROLE_ID`) values (1,1,1),(2,6,13);





