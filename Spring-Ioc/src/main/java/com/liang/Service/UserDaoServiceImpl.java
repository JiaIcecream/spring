package com.liang.Service;

import com.liang.Dao.UserDao;

public class UserDaoServiceImpl implements UserDaoService{
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void getUser() {
		userDao.getUser();
	}

}
