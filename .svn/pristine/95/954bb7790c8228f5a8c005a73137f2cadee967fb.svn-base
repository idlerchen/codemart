package com.fenbi.codemart.dao.impl;

import com.fenbi.codemart.bean.User;
import com.fenbi.codemart.dao.BaseDao;
import com.fenbi.codemart.dao.UserDao;

public class UserDaoImpl extends BaseDao<User> implements UserDao {

	@Override
	public int createUser(User user) {
		
		String sql = "INSERT INTO user(user_type,username,telephone,password)"
				+ " VALUES(?,?,?,?)";
		return this.update(sql, user.getUserType(), user.getUsername(), user.getTelephone(), user.getPassword());
		
	}

	@Override
	public User selectUserByUsernameAndPassword(String username, String password) {
		
		String sql = "SELECT id,user_type userType,username,telephone,password,email,realname,qq_num qqNum,province_id provinceId,city_id cityId,county_id countyId,photo_url photoUrl,create_time createTime"
				+ " FROM user"
				+ " WHERE username = ? AND password = ?";
		return this.getBean(sql, username, password);
		
	}
	
	@Override
	public User selectUserByTelephoneAndPassword(String telephone, String password) {
		
		String sql = "SELECT id,user_type userType,username,telephone,password,email,realname,qq_num qqNum,province_id provinceId,city_id cityId,county_id countyId,photo_url photoUrl,create_time createTime"
				+ " FROM user"
				+ " WHERE telephone = ? AND password = ?";
		return this.getBean(sql, telephone, password);
		
	}

	@Override
	public User selectUserByEmailAndPassword(String email, String password) {
		
		String sql = "SELECT id,user_type userType,username,telephone,password,email,realname,qq_num qqNum,province_id provinceId,city_id cityId,county_id countyId,photo_url photoUrl,create_time createTime"
				+ " FROM user"
				+ " WHERE email = ? AND password = ?";
		return this.getBean(sql, email, password);
		
	}

	@Override
	public User selectUserByUserId(int userId) {
		
		String sql = "SELECT id,user_type userType,username,telephone,password,email,realname,qq_num qqNum,province_id provinceId,city_id cityId,county_id countyId,photo_url photoUrl,create_time createTime"
				+ " FROM user"
				+ " WHERE id = ?";
		return this.getBean(sql, userId);
		
	}
	
	@Override
	public User selectUserByUsername(String username) {
		
		String sql = "SELECT id,user_type userType,username,telephone,password,email,realname,qq_num qqNum,province_id provinceId,city_id cityId,county_id countyId,photo_url photoUrl,create_time createTime"
				+ " FROM user"
				+ " WHERE username = ?";
		return this.getBean(sql, username);
		
	}

	@Override
	public User selectUserByTelephone(String telephone) {
		
		String sql = "SELECT id,user_type userType,username,telephone,password,email,realname,qq_num qqNum,province_id provinceId,city_id cityId,county_id countyId,photo_url photoUrl,create_time createTime"
				+ " FROM user"
				+ " WHERE telephone = ?";
		return this.getBean(sql, telephone);
		
	}

	@Override
	public User selectUserByEmail(String email) {
		
		String sql = "SELECT id,user_type userType,username,telephone,password,email,realname,qq_num qqNum,province_id provinceId,city_id cityId,county_id countyId,photo_url photoUrl,create_time createTime"
				+ " FROM user"
				+ " WHERE email = ?";
		return this.getBean(sql, email);
		
	}

	@Override
	public int updateUserByUserinfo(User user) {
		
		String sql = "UPDATE user"
				+ " SET realname = ?,qq_num = ?,province_id = ?,city_id = ?,county_id = ?"
				+ " WHERE username = ?";
		return this.update(sql, user.getRealname(), user.getQqNum(), user.getProvinceId() ,user.getCityId(), user.getCountyId(), user.getUsername());
		
	}

	@Override
	public int updateEmailByUserId(String email, int userId) {
		
		String sql = "UPDATE user"
				+ " SET email = ?"
				+ " WHERE id = ?";
		return this.update(sql, email, userId);
		
	}

	@Override
	public int updateTelephoneByUserId(String telephone, int userId) {
		
		String sql = "UPDATE user"
				+ " SET telephone = ?"
				+ " WHERE id = ?";
		return this.update(sql, telephone, userId);
		
	}

	

}
