-- -----------------------------------------------------
-- Schema wms: WAREHOUSE MANAGEMENT SYSTEM
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `wms`;
CREATE SCHEMA IF NOT EXISTS `wms` DEFAULT CHARACTER SET UTF8;
USE `wms`;

-- -----------------------------------------------------
-- Table `wms`.`wms_user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `wms`.`wms_user`;

CREATE TABLE IF NOT EXISTS `wms`.`wms_user` (
	`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
	`username` VARCHAR(15) NOT NULL DEFAULT '' COMMENT '用户名称',
	`nickname` VARCHAR(40) NOT NULL DEFAULT '' COMMENT '昵称',
	`password` VARCHAR(40) NOT NULL DEFAULT '' COMMENT '用户密码',
	`email` VARCHAR(40) NOT NULL DEFAULT '' COMMENT 'email地址',
	`phone` VARCHAR(13) NOT NULL DEFAULT '' COMMENT '用户手机',
	`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '用户创建时间',
	`last_login_time` TIMESTAMP NOT NULL COMMENT '最后登陆时间',
    `last_login_ip` VARCHAR(40) NOT NULL DEFAULT '' COMMENT '最后登陆IP',
	`status` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '用户状态',
	PRIMARY KEY (`id`)
)ENGINE = InnoDB DEFAULT CHARSET=UTF8 COMMENT '用户表';

-- `wms`.`wms_user`
insert into `wms`.`wms_user`
	(`username`,`nickname`,`password`,`email`,`phone`,`last_login_time`,`last_login_ip`,`status`)
values
	('mpthink','paul','123','test@163.com','13551178888','2016-10-30 00:00:00','10.11.22.33',1),
	('mayiyang','xiamage','123','test@163.com','13551170000','2016-10-31 00:00:00','10.11.22.33',1),
	('yangyeye','xiaoyang','123','test@163.com','13551179999','2016-10-30 00:00:00','10.11.22.33',1);

-- -----------------------------------------------------
-- Table `wms`.`wms_role`
-- ----------------------------------------------------- 
DROP TABLE IF EXISTS `wms`.`wms_role`;

CREATE TABLE IF NOT EXISTS `WMS`.`wms_role`(
	`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色id',
	`name` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '角色名称',
	`role_code` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '角色代码',
	`description` VARCHAR(200) NOT NULL DEFAULT '' COMMENT '角色说明',
	PRIMARY KEY (`id`)
)ENGINE = InnoDB DEFAULT CHARSET=UTF8 COMMENT '角色信息表';

-- `wms`.`wms_role` data;
insert into `wms`.`wms_role`(`name`,`role_code`,`description`) 
values ('superadmin','superadmin','超级管理员'),('admin','admin','管理员'),('仓管','storekeeper','仓管员'),('搬运工','carrier','搬运工'),('录单员','inputer','录单员');

-- -----------------------------------------------------
-- Table `wms`.`wms_user_role`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `wms`.`wms_user_role`;
CREATE TABLE `wms`.`wms_user_role` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_ID` int(11) NOT NULL,
  `ROLE_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_USER_ROL_REFERENCE_ROLE` (`ROLE_ID`) USING BTREE,
  KEY `FK_USER_ROL_REFERENCE_USER` (`USER_ID`) USING BTREE,
  CONSTRAINT `wms_user_role_ibfk_1` FOREIGN KEY (`ROLE_ID`) REFERENCES `wms_role` (`ID`),
  CONSTRAINT `wms_user_role_ibfk_2` FOREIGN KEY (`USER_ID`) REFERENCES `wms_user` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '用户角色表';

/*Data for the table `wms`.`wms_user_role` */

insert  into `wms`.`wms_user_role`(`ID`,`USER_ID`,`ROLE_ID`) values (1,1,1),(2,2,2);

-- -----------------------------------------------------
-- Table `wms`.`wms_permission`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `wms`.`wms_permission`;
CREATE TABLE `wms`.`wms_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) NOT NULL DEFAULT '0' COMMENT '父节点名称',
  `name` varchar(50) NOT NULL DEFAULT '' COMMENT '权限名称',
  `type` varchar(20) NOT NULL DEFAULT '' COMMENT '类型:菜单or功能',
  `sort` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '排序',
  `url` varchar(255) NOT NULL DEFAULT '' COMMENT '访问地址',
  `permission_code` varchar(50) NOT NULL DEFAULT '' COMMENT '菜单权限编码',
  `icon` varchar(255) NOT NULL DEFAULT '' COMMENT '图标',
  `status` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '权限状态',
  `description` VARCHAR(400) NOT NULL DEFAULT '' COMMENT '权限描述',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '权限表';

-- `wms`.`wms_permission` data;
insert  into `wms`.`wms_permission`(`ID`,`PID`,`NAME`,`TYPE`,`SORT`,`URL`,`PERMISSION_CODE`,`ICON`,`status`,`DESCRIPTION`) 
values (1,0,'系统管理','F',1,'','','&#xe62e;',1,''),
(2,1,'角色管理','F',3,'/role/list','','',1,''),
(3,1,'用户管理','F',2,'/user/list','','',1,'');

-- -----------------------------------------------------
-- Table `wms`.`wms_role_permission`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `wms`.`wms_role_permission`;
CREATE TABLE `wms`.`wms_role_permission` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ROLE_ID` int(11) NOT NULL DEFAULT '0',
  `PERMISSION_ID` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID`),
  KEY `FK_ROLE_permission_REFERENCE_permission` (`PERMISSION_ID`) USING BTREE,
  KEY `FK_ROLE_permission_REFERENCE_ROLE` (`ROLE_ID`) USING BTREE,
  CONSTRAINT `wms_role_permission_ibfk_1` FOREIGN KEY (`PERMISSION_ID`) REFERENCES `wms_permission` (`ID`),
  CONSTRAINT `wms_role_permission_ibfk_2` FOREIGN KEY (`ROLE_ID`) REFERENCES `wms_role` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '角色权限表';

insert  into `wms`.`wms_role_permission`(`ROLE_ID`,`PERMISSION_ID`) 
values (1,1),(1,2),(1,3);








-- -----------------------------------------------------
-- Table `wms`.`wms_notice`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `wms`.`wms_notice`;

CREATE TABLE IF NOT EXISTS `wms`.`wms_notice`(
	`notice_id` INT unsigned NOT NULL AUTO_INCREMENT COMMENT '通知Id',
	`notice_title` VARCHAR(200) NOT NULL DEFAULT '' COMMENT '通知标题',
	`notice_content` TEXT COMMENT '通知内容',
	`notice_create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '通知创建时间',
	`id` INT NOT NULL DEFAULT '0' COMMENT '通知创建人',
	PRIMARY KEY (`notice_id`),
	KEY `idx_id` (`id`)
)ENGINE = InnoDB DEFAULT CHARSET=UTF8 COMMENT '信息通知表';

-- -----------------------------------------------------
-- Table `wms`.`wms_log`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `wms`.`wms_log`;
CREATE TABLE IF NOT EXISTS `wms`.`wms_log`(
	`log_id` INT unsigned NOT NULL AUTO_INCREMENT,
	`log_action` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '日志行为',
	`log_create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '日志时间',
	`id` INT NOT NULL DEFAULT '0' COMMENT '用户ID',
	PRIMARY KEY (`log_id`),
	KEY `idx_id` (`id`)
)ENGINE = InnoDB DEFAULT CHARSET=UTF8 COMMENT '';

-- -----------------------------------------------------
-- Table `wms`.`wms_store`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `wms`.`wms_store`;
CREATE TABLE IF NOT EXISTS `wms`.`wms_store`(
	`store_id` INT unsigned NOT NULL AUTO_INCREMENT,
	`store_name` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '仓库名称',
	`store_sub_parrent` INT unsigned NOT NULL DEFAULT '0' COMMENT '父仓库ID',
	`store_sub_name` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '子仓库名称',
	`store_address` VARCHAR(40) NOT NULL DEFAULT '' COMMENT '仓库位置',
	`store_total_space` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '仓库空间',
	`store_manager` INT unsigned NOT NULL DEFAULT '0' COMMENT '仓库管理员',
	PRIMARY KEY (`store_id`)
)ENGINE = InnoDB DEFAULT CHARSET=UTF8 COMMENT '仓库信息表';

-- -----------------------------------------------------
-- Table `wms`.`wms_product`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `wms`.`wms_product` ;

CREATE TABLE IF NOT EXISTS `wms`.`wms_product` (
  `product_id` INT unsigned NOT NULL AUTO_INCREMENT,
  `product_name` VARCHAR(40) NOT NULL DEFAULT '' COMMENT '产品名称',
  `product_category_id` INT NOT NULL DEFAULT '0' COMMENT '产品分类',
  `customer_id` INT NOT NULL DEFAULT '0' COMMENT '客户单位ID',
  `product_market_price` DECIMAL(8,2) NOT NULL DEFAULT '0.00' COMMENT '产品市场价',
  `product_cost_price` DECIMAL(8,2) NOT NULL DEFAULT '0.00' COMMENT '产品出厂价',
  `product_volume` VARCHAR(10) NOT NULL DEFAULT '' COMMENT '产品体积',
  `product_unit` VARCHAR(10) NOT NULL DEFAULT '' COMMENT '产品单位',
  PRIMARY KEY (`product_id`)
)ENGINE = InnoDB DEFAULT CHARSET=UTF8 COMMENT '产品信息表';

-- -----------------------------------------------------
-- Table `wms`.`wms_product_category`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `wms`.`wms_product_category`;
CREATE TABLE IF NOT EXISTS `wms`.`wms_product_category`(
	`product_category_id` INT(8) unsigned NOT NULL AUTO_INCREMENT,
	`product_category_parentid` INT(8) unsigned NOT NULL DEFAULT '0' COMMENT '产品类别父ID',
	`product_category_name` VARCHAR(40) NOT NULL DEFAULT '' COMMENT '类别名称',
	PRIMARY KEY (`product_category_id`)
)ENGINE = InnoDB DEFAULT CHARSET=UTF8 COMMENT '产品分类表';

-- -----------------------------------------------------
-- Table `wms`.`wms_customer`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `wms`.`wms_customer`;

CREATE TABLE IF NOT EXISTS `wms`.`wms_customer` (
  `customer_id` INT unsigned NOT NULL AUTO_INCREMENT,
  `customer_name` VARCHAR(40) NOT NULL DEFAULT '' COMMENT '客户名称',
  `customer_way_pay` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '客户付款方式',
  `customer_way_out` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '客户发货方式',
  `customer_company` VARCHAR(40) NOT NULL DEFAULT '' COMMENT '客户公司名称',
  `customer_address` VARCHAR(40) NOT NULL DEFAULT '' COMMENT '客户单位地址',
  `customer_phone` VARCHAR(13) NOT NULL DEFAULT '' COMMENT '客户电话',
  `customer_category_id` INT NOT NULL DEFAULT '0' COMMENT '客户分类ID',
  PRIMARY KEY (`customer_id`)
)ENGINE = InnoDB DEFAULT CHARSET=UTF8 COMMENT '客户信息表';

-- -----------------------------------------------------
-- Table `wms`.`wms_customer_category`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `wms`.`wms_customer_category` ;

CREATE TABLE IF NOT EXISTS `wms`.`wms_customer_category` (
  `customer_category_id` INT unsigned NOT NULL AUTO_INCREMENT,
  `customer_category_name` VARCHAR(45) NOT NULL DEFAULT '' COMMENT '客户类别名称',
  PRIMARY KEY (`customer_category_id`)
)ENGINE = InnoDB DEFAULT CHARSET=UTF8 COMMENT '客户类别表';

-- -----------------------------------------------------
-- Table `wms`.`wms_instore_main`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `wms`.`wms_instore_main` ;

CREATE TABLE IF NOT EXISTS `wms`.`wms_instore_main` (
  `ism_id` INT unsigned NOT NULL AUTO_INCREMENT,
  `ism_sn` VARCHAR(40) NOT NULL DEFAULT '' COMMENT '入库单据生成序列号',
  `ism_ticket_no` VARCHAR(40) NOT NULL DEFAULT '' COMMENT '单据号码',
  `ism_ticket_time` TIMESTAMP NULL COMMENT '单据时间',
  `ism_carrier` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '搬运人员',
  `ism_car_no` VARCHAR(10) NOT NULL DEFAULT '' COMMENT '入库车辆车牌号',
  `ism_status` TINYINT NOT NULL DEFAULT '0' COMMENT '单据状态，-1:未提交，0：已提交，1：已勾单，2：已审核',
  `ism_total` INT NOT NULL DEFAULT '0' COMMENT '入库总量',
  `ism_remark` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '单据备注',
  `ism_creator` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '单据创建人',
  `ism_create_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '单据创建时间',
  `ism_chargebacker` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '单据退单人', 
  `ism_chargeback_date` TIMESTAMP NULL COMMENT '单据退单时间',
  `ism_confirmor` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '单据勾单人',
  `ism_confirm_date` TIMESTAMP NULL COMMENT '单据勾单时间',
  `ism_reviewer` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '单据审核人',
  `ism_review_date` TIMESTAMP NULL COMMENT '单据审核时间',
  `customer_id` INT NOT NULL DEFAULT '0' COMMENT '所属客户ID',
  PRIMARY KEY (`ism_id`)
)ENGINE = InnoDB DEFAULT CHARSET=UTF8 COMMENT '入库总表';

-- -----------------------------------------------------
-- Table `wms`.`wms_instore_sub`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `wms`.`wms_instore_sub` ;
CREATE TABLE IF NOT EXISTS `wms`.`wms_instore_sub` (
  `iss_id` INT unsigned NOT NULL AUTO_INCREMENT,
  `ism_id` INT unsigned NOT NULL DEFAULT '0' COMMENT '入库总表ID',
  `iss_parent_id` INT NOT NULL DEFAULT '0' COMMENT '子表父ID，用于分库，0：未分库子单，-1：已分库子单，>0:已分库小子单',
  `iss_plan_quantity` INT(10) NOT NULL DEFAULT '0' COMMENT '入库计划数量',
  `iss_real_quantity` INT(10) NOT NULL DEFAULT '0' COMMENT '入库实际数量',
  `product_id` INT unsigned NOT NULL DEFAULT '0' COMMENT '产品ID',
  `product_quality` TINYINT NOT NULL DEFAULT '0' COMMENT '质量',
  `store_id` INT unsigned NOT NULL DEFAULT '0' COMMENT '仓库ID',
  `iss_insert_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '入库子表插入时间',
  `iss_insert_order` SMALLINT(4) NOT NULL DEFAULT '0' COMMENT '入库子表插入顺序',
  PRIMARY KEY (`iss_id`),
  INDEX `fk_instore_sub_instore_main_idx` (`ism_id` ASC),
  INDEX `fk_instore_sub_store_idx` (`store_id` ASC),
  INDEX `fk_instore_sub_product_idx` (`product_id` ASC),
  CONSTRAINT `fk_instore_sub_instore_main`
    FOREIGN KEY (`ism_id`)
    REFERENCES `wms`.`wms_instore_main` (`ism_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_instore_sub_store`
    FOREIGN KEY (`store_id`)
    REFERENCES `wms`.`wms_store` (`store_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE,	
  CONSTRAINT `fk_instore_sub_product`
    FOREIGN KEY (`product_id`)
    REFERENCES `wms`.`wms_product` (`product_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE
)ENGINE = InnoDB DEFAULT CHARSET=UTF8 COMMENT '入库子表';

-- -----------------------------------------------------
-- Table `wms`.`wms_outstore_main`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `wms`.`wms_outstore_main` ;
CREATE TABLE IF NOT EXISTS `wms`.`wms_outstore_main` (
  `osm_id` INT unsigned NOT NULL AUTO_INCREMENT,
  `osm_sn` VARCHAR(40) NOT NULL DEFAULT '' COMMENT '出库单据生成序列号',
  `osm_ticket_no` VARCHAR(40) NOT NULL DEFAULT '' COMMENT '单据号码',
  `osm_ticket_time` TIMESTAMP NULL COMMENT '单据时间',
  `osm_carrier` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '搬运人员',
  `osm_car_no` VARCHAR(10) NOT NULL DEFAULT '' COMMENT '出库车辆车牌号',
  `osm_status` TINYINT NOT NULL DEFAULT '0' COMMENT '单据状态',
  `osm_total` INT NOT NULL DEFAULT '0' COMMENT '出库总量',
  `osm_remark` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '单据备注',
  `osm_creator` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '单据创建人',
  `osm_create_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '单据创建时间',
  `osm_chargebacker` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '单据退单人', 
  `osm_chargeback_date` TIMESTAMP NULL COMMENT '单据退单时间',
  `osm_confirmor` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '单据勾单人',
  `osm_confirm_date` TIMESTAMP NULL COMMENT '单据勾单时间',
  `customer_id` INT NOT NULL DEFAULT '0' COMMENT '客户单位ID',
  `osm_reviewer` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '单据审核人',
  `osm_review_date` TIMESTAMP NULL COMMENT '单据审核时间',
  PRIMARY KEY (`osm_id`)
)ENGINE = InnoDB DEFAULT CHARSET=UTF8 COMMENT '出库总表';

-- -----------------------------------------------------
-- Table `wms`.`wms_outstore_sub`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `wms`.`wms_outstore_sub` ;
CREATE TABLE IF NOT EXISTS `wms`.`wms_outstore_sub` (
  `oss_id` INT unsigned NOT NULL AUTO_INCREMENT,
  `osm_id` INT unsigned NOT NULL DEFAULT '0' COMMENT '出库总表ID',
  `oss_plan_quantity` INT(10) NOT NULL DEFAULT '0' COMMENT '出库计划数量',
  `oss_real_quantity` INT(10) NOT NULL DEFAULT '0' COMMENT '出库实际数量',
  `product_id` INT unsigned NOT NULL DEFAULT '0' COMMENT '产品ID',
  `product_quality` TINYINT NOT NULL DEFAULT '0' COMMENT '产品质量',
  `store_id` INT unsigned NOT NULL DEFAULT '0' COMMENT '仓库ID',
  `oss_insert_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '单据插入时间',
  `oss_insert_order` SMALLINT(4) NOT NULL DEFAULT '0' COMMENT '单据插入顺序',
  PRIMARY KEY (`oss_id`),
  INDEX `fk_outstore_sub_outstore_main_idx` (`osm_id` ASC),
  INDEX `fk_outstore_sub_store_idx` (`store_id` ASC),
  INDEX `fk_outstore_sub_product_idx` (`product_id` ASC),
  CONSTRAINT `fk_outstore_sub_outstore_main`
    FOREIGN KEY (`osm_id`)
    REFERENCES `wms`.`wms_outstore_main` (`osm_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_outstore_sub_store`
    FOREIGN KEY (`store_id`)
    REFERENCES `wms`.`wms_store` (`store_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE,	
  CONSTRAINT `fk_outstore_sub_product`
    FOREIGN KEY (`product_id`)
    REFERENCES `wms`.`wms_product` (`product_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE
)ENGINE = InnoDB DEFAULT CHARSET=UTF8 COMMENT '出仓子表';

-- -----------------------------------------------------
-- initial data
-- -----------------------------------------------------


-- `wms`.`wms_notice`
insert into `wms`.`wms_notice`(`notice_title`,`notice_content`,`id`)
values 
	('通知1','通知内容1',1),
	('通知2','通知内容2',2),
	('通知3','通知内容3',3);
-- `wms`.`wms_log`
insert into `wms`.`wms_log`(`log_action`,`id`)
values
	('操作1',1),
	('操作2',2),
	('操作3',3);
-- `wms`.`wms_store`
insert into `wms`.`wms_store`(`store_name`,`store_sub_parrent`,`store_sub_name`,`store_address`,`store_total_space`,`store_manager`)
values
	('总仓库1',0,'','总仓库1地址','300m3',1),
	('总仓库2',0,'','总仓库2地址','300m3',1),
	('总仓库1',1,'总仓库1分区A','总仓库1地址','300m3',1),
	('总仓库1',1,'总仓库1分区B','总仓库1地址','300m3',1),
	('总仓库2',2,'总仓库2分区A','总仓库2地址','300m3',1),
	('总仓库2',2,'总仓库2分区B','总仓库2地址','300m3',1);
-- `wms`.`wms_product_category`
insert into `wms`.`wms_product_category`(`product_category_parentid`,`product_category_name`)
values
	(0,'赠品'),
	(0,'热水器'),
	(1,'赠品分类1');
-- `wms`.`wms_product`
insert into 
	`wms`.`wms_product`(`product_name`,`product_category_id`,`customer_id`,`product_market_price`,`product_cost_price`,`product_volume`,`product_unit`)
values
	('史密斯热水器',2,1,2.00,1.00,'1m3','台'),
	('史密斯热水器2',2,1,2.00,1.00,'1m3','台'),
	('飞刀',1,1,2.00,1.00,'1m3','个');
-- `wms`.`wms_customer_category`
insert into `wms`.`wms_customer_category`(`customer_category_name`)
values
	('电器'),('酒水');
-- `wms`.`wms_customer`
insert into `wms`.`wms_customer`(`customer_name`,`customer_way_pay`,`customer_way_out`,`customer_company`,`customer_address`,`customer_phone`,`customer_category_id`)
values
	('史密斯','预付','预发','史密斯有限责任公司','成都','13438960666',1),
	('格力','预付','预发','格力有限责任公司','成都','13438960666',1);
-- `wms`.`wms_instore_main`
insert into `wms`.`wms_instore_main`
	(`ism_sn`,`ism_ticket_no`,`ism_ticket_time`,`ism_carrier`,`ism_car_no` ,`ism_status`,`ism_total` ,`ism_remark`,`ism_creator`,`ism_chargebacker`,`ism_chargeback_date`,`ism_confirmor`,`ism_confirm_date`,
`ism_reviewer`,`ism_review_date`,`customer_id`)
values
	('in-123','test123','2016-10-30 00:00:00','mayiyang','A12345',1,100,'remark','创建人','退单人','2016-10-30 00:00:00','审核人','2016-10-30 00:00:00','复核人','2016-10-30 00:00:00',1),
	('in-1234','test1234','2016-10-31 00:00:00','mayiyang','A12345',1,100,'remark','创建人','退单人','2016-10-30 00:00:00','审核人','2016-10-30 00:00:00','复核人','2016-10-30 00:00:00',1);
-- `wms`.`wms_instore_sub`
insert into `wms`.`wms_instore_sub`(`ism_id`,`iss_plan_quantity`,`iss_real_quantity` ,`product_id`,`product_quality`,`store_id`,`iss_insert_order`)
values
	(1,20,20,1,1,1,0),
	(1,30,30,2,1,1,1);
-- `wms`.`wms_outstore_main`
insert into `wms`.`wms_outstore_main`
	(`osm_sn`,`osm_ticket_no`,`osm_ticket_time`,`osm_carrier`,`osm_car_no`,`osm_status`,`osm_total`,`osm_remark`,`osm_creator`,`osm_chargebacker`,`osm_chargeback_date`,`osm_confirmor`,`osm_confirm_date`,
	`osm_reviewer`,`osm_review_date`,`customer_id`)
values
	('out-123','测试123','2016-10-30 00:00:00','mayiyang','A12345',1,100,'remark','创建人','退单人','2016-10-30 00:00:00','审核人','2016-10-30 00:00:00','复核人','2016-10-30 00:00:00',1),
	('out-1234','测试1234','2016-10-30 00:00:00','mayiyang','A12345',1,100,'remark','创建人','退单人','2016-10-30 00:00:00','审核人','2016-10-30 00:00:00','复核人','2016-10-30 00:00:00',1);
-- `wms`.`wms_outstore_sub`
insert into `wms`.`wms_outstore_sub`(`osm_id`,`oss_plan_quantity`,`oss_real_quantity`,`product_id`,`product_quality`,`store_id`,`oss_insert_order`)
values
	(1,20,20,1,1,1,0),
	(1,30,30,2,1,1,1);