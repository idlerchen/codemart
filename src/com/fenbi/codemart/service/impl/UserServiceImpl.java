package com.fenbi.codemart.service.impl;

import com.fenbi.codemart.bean.User;
import com.fenbi.codemart.dao.UserDao;
import com.fenbi.codemart.dao.impl.UserDaoImpl;
import com.fenbi.codemart.service.UserService;

public class UserServiceImpl implements UserService {

	UserDao userDao = new UserDaoImpl();

	@Override
	public boolean createUser(User user) {
		return userDao.createUser(user) > 0;
	}

	@Override
	public User getUserByUsernameAndPassword(String username, String password) {
		return userDao.selectUserByUsernameAndPassword(username, password);
	}

	@Override
	public User getUserByTelephoneAndPassword(String telephone, String password) {
		return userDao.selectUserByTelephoneAndPassword(telephone, password);
	}

	@Override
	public User getUserByEmailAndPassword(String email, String password) {
		return userDao.selectUserByEmailAndPassword(email, password);
	}

	@Override
	public boolean checkUsername(String username) {
		return userDao.selectUserByUsername(username) == null;
	}

	@Override
	public boolean checkTelephone(String telephone) {
		return userDao.selectUserByTelephone(telephone) == null;
	}

	@Override
	public boolean checkEmail(String email) {
		return userDao.selectUserByEmail(email) == null;
	}

	@Override
	public boolean updateUserByUserinfo(User user) {
		return userDao.updateUserByUserinfo(user) > 0;
	}

	@Override
	public User getUserByUserId(int userId) {
		return userDao.selectUserByUserId(userId);
	}

	@Override
	public User getUserByUsername(String username) {
		return userDao.selectUserByUsername(username);
	}

	@Override
	public boolean updateEmailByUserId(String email, int userId) {
		return userDao.updateEmailByUserId(email, userId) > 0;
	}

	@Override
	public boolean updateTelephoneByUserId(String telephone, int userId) {
		return userDao.updateTelephoneByUserId(telephone, userId) > 0;
	}

}
