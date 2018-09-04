



CREATE DATABASE codemart;

USE codemart;
-- 注册用户表
CREATE TABLE USER(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT '用户ID',
	user_type TINYINT COMMENT '用户身份 0开发者 1需求者',
	username VARCHAR(50) UNIQUE COMMENT '用户名',
	telephone VARCHAR(20) COMMENT '手机号',
	PASSWORD VARCHAR(50) COMMENT '用户登录密码',
	email VARCHAR(20) COMMENT '用户邮箱',
	realname VARCHAR(20) COMMENT '用户姓名',
	qq_num VARCHAR(20) COMMENT '用户QQ号',
	province_id INT COMMENT '用户地址-省',
	city_id INT COMMENT '用户地址-市',
	county_id INT COMMENT '用户地址-区县',
	photo_url VARCHAR(100) COMMENT '用户头像url',
	create_time TIMESTAMP COMMENT '创建时间'
);
-- 省
CREATE TABLE province(
	id INT PRIMARY KEY COMMENT '省编码',
	NAME VARCHAR(50) NOT NULL COMMENT '省名称'
);
-- 市
CREATE TABLE city(
	id INT PRIMARY KEY COMMENT '市编码',
	NAME VARCHAR(50) NOT NULL COMMENT '市名称',
	province_id INT COMMENT '所属省编码',
	FOREIGN KEY(province_id) REFERENCES province(id)
);
-- 区县
CREATE TABLE county(
	id INT PRIMARY KEY COMMENT '区县编码',
	NAME VARCHAR(50) NOT NULL COMMENT '区县名称',
	city_id INT COMMENT '所属市编码',
	FOREIGN KEY(city_id) REFERENCES city(id)
);
-- 用户完善开发者信息，插入开发者表信息中
CREATE TABLE developer(
	id INT AUTO_INCREMENT PRIMARY KEY COMMENT '开发者id',
	userid INT  COMMENT '用户ID',
	-- roleid int foreign key references role(id) comment '角色ID',多角色需另起表(role)
	work_status VARCHAR(20) COMMENT '时间状态 无/少/多/全时间',
	create_time TIMESTAMP COMMENT '创建时间',
	FOREIGN KEY(userid) REFERENCES USER(id)
);
-- 开发者拥有的角色类型
CREATE TABLE role_type(
	id INT AUTO_INCREMENT PRIMARY KEY COMMENT '角色类型ID',
	NAME VARCHAR(50) COMMENT '角色类型名称'
);
-- 开发者拥有的角色表
CREATE TABLE role(
	id INT AUTO_INCREMENT PRIMARY KEY COMMENT '角色表ID',
	developer_id INT  COMMENT '开发者ID',
	role_id INT  COMMENT '角色类型ID',
	FOREIGN KEY(developer_id) REFERENCES developer(id),
	FOREIGN KEY(role_id) REFERENCES role_type(id)
);
-- 开发者的项目经验表
CREATE TABLE developer_case(
	id INT AUTO_INCREMENT PRIMARY KEY COMMENT '开发者项目经验表ID',
	developer_id INT  COMMENT '开发者ID',
	NAME VARCHAR(100) COMMENT '项目名称',
	case_type INT COMMENT '项目类型',
	period VARCHAR(20) COMMENT '项目周期',
	-- industry所属行业 有多个行业需另起表
	detail VARCHAR(150) COMMENT '项目描述',
	link VARCHAR(50) COMMENT '项目连接',
	FOREIGN KEY(developer_id) REFERENCES developer(id),
	FOREIGN KEY(case_type) REFERENCES item_type(id)
);
-- 项目所属类型
CREATE TABLE item_type(
	id INT AUTO_INCREMENT PRIMARY KEY COMMENT '项目类型ID',
	NAME VARCHAR(30) COMMENT '项目类型名称'
);
-- 项目所属行业
CREATE TABLE industry(
	id INT AUTO_INCREMENT PRIMARY KEY COMMENT '行业ID',
	NAME VARCHAR(30) COMMENT '行业名称'
);

-- 需求者发布项目，项目表
CREATE TABLE item(
	id INT AUTO_INCREMENT PRIMARY KEY COMMENT '项目ID',
	userid INT  COMMENT '用户ID',
	itemtype INT  COMMENT '项目类型',
	role_id INT  COMMENT '招募角色',
	NAME VARCHAR(50) COMMENT '项目名称',
	-- industry所属行业，多行业需另起表
	money INT COMMENT '项目预算',
	period VARCHAR(20) COMMENT '项目周期',
	link_man VARCHAR(30) COMMENT '联系人',
	link_email VARCHAR(30) COMMENT '联系人邮箱',
	link_telephone VARCHAR(20) COMMENT '联系人电话',
	refer VARCHAR(50) COMMENT '参考网站',
	detail VARCHAR(200) COMMENT '项目描述',
	state INT  COMMENT '项目状态',
	applicant_num INT COMMENT '申请人数',
	create_time TIMESTAMP COMMENT '创建时间',
	FOREIGN KEY(userid) REFERENCES USER(id),
	FOREIGN KEY(itemtype) REFERENCES item_type(id),
	FOREIGN KEY(role_id) REFERENCES role_type(id),
	FOREIGN KEY(state) REFERENCES item_state(id)
);

CREATE TABLE item_state(
	id INT AUTO_INCREMENT PRIMARY KEY COMMENT '项目状态ID',
	NAME VARCHAR(30) COMMENT '项目状态名称'
);
-- 开发者报名表
CREATE TABLE apply(
	id INT AUTO_INCREMENT PRIMARY KEY  COMMENT '申请表ID',
	item_id INT  COMMENT '项目ID',
	developer_id INT  COMMENT '开发者ID',
	state INT COMMENT '申请状态，需要设计几级还是0/1',
	note VARCHAR(100) COMMENT '备注',
	create_time TIMESTAMP COMMENT '创建时间',
	FOREIGN KEY(item_id) REFERENCES item(id),
	FOREIGN KEY(developer_id) REFERENCES developer(id)
);









	
