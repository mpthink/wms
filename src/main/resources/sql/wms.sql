-- -----------------------------------------------------
-- Schema wms: WAREHOUSE MANAGEMENT SYSTEM
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `wms`;
CREATE SCHEMA IF NOT EXISTS `wms` DEFAULT CHARACTER SET UTF8;
USE `wms`;

-- -----------------------------------------------------
-- Table `WMS`.`wms_user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `wms`.`wms_user`;

CREATE TABLE IF NOT EXISTS `wms`.`wms_user` (
	`user_id` INT unsigned NOT NULL AUTO_INCREMENT COMMENT '用户ID',
	`user_name` VARCHAR(15) NOT NULL DEFAULT '' COMMENT '用户名称',
	`user_realname` VARCHAR(40) NOT NULL DEFAULT '' COMMENT '用户真实姓名',
	`user_password` VARCHAR(40) NOT NULL DEFAULT '' COMMENT '用户密码',
	`user_email` VARCHAR(40) NOT NULL DEFAULT '' COMMENT 'email地址',
	`user_phone` VARCHAR(13) NOT NULL DEFAULT '' COMMENT '用户手机',
	`user_create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '用户创建时间',
	`user_last_logintime` TIMESTAMP NOT NULL COMMENT '最后登陆时间',
    `user_last_loginip` VARCHAR(40) NOT NULL DEFAULT '' COMMENT '最后登陆IP',
	`user_status` SMALLINT(4) unsigned NOT NULL DEFAULT '0' COMMENT '用户状态',
	`user_role_id` SMALLINT(4) unsigned NOT NULL DEFAULT '0' COMMENT '用户角色',
	PRIMARY KEY (`user_id`)
)ENGINE = InnoDB DEFAULT CHARSET=UTF8 COMMENT '用户表';

-- -----------------------------------------------------
-- Table `wms`.`wms_role`
-- ----------------------------------------------------- 
DROP TABLE IF EXISTS `wms`.`wms_role`;

CREATE TABLE IF NOT EXISTS `WMS`.`wms_role`(
	`role_id` INT unsigned NOT NULL AUTO_INCREMENT COMMENT '角色id',
	`role_name` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '角色名称',
	`role_permission` VARCHAR(200) NOT NULL DEFAULT '' COMMENT '角色权限',
	PRIMARY KEY (`role_id`)
)ENGINE = InnoDB DEFAULT CHARSET=UTF8 COMMENT '角色信息表';

-- -----------------------------------------------------
-- Table `wms`.`wms_notice`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `wms`.`wms_notice`;

CREATE TABLE IF NOT EXISTS `wms`.`wms_notice`(
	`notice_id` INT unsigned NOT NULL AUTO_INCREMENT COMMENT '通知Id',
	`notice_title` VARCHAR(200) NOT NULL DEFAULT '' COMMENT '通知标题',
	`notice_content` TEXT COMMENT '通知内容',
	`notice_create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '通知创建时间',
	`user_id` INT NOT NULL DEFAULT '0' COMMENT '通知创建人',
	PRIMARY KEY (`notice_id`),
	KEY `idx_user_id` (`user_id`)
)ENGINE = InnoDB DEFAULT CHARSET=UTF8 COMMENT '信息通知表';

-- -----------------------------------------------------
-- Table `wms`.`wms_log`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `wms`.`wms_log`;
CREATE TABLE IF NOT EXISTS `wms`.`wms_log`(
	`log_id` INT unsigned NOT NULL AUTO_INCREMENT,
	`log_action` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '日志行为',
	`log_create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '日志时间',
	`user_id` INT NOT NULL DEFAULT '0' COMMENT '用户ID',
	PRIMARY KEY (`log_id`),
	KEY `idx_user_id` (`user_id`)
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
  `iss_parent_id` INT unsigned NOT NULL DEFAULT '0' COMMENT '子表父ID，用于分库',
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


