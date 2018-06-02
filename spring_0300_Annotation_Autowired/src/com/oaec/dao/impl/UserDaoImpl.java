package com.oaec.dao.impl;

import com.oaec.dao.UserDao;

public class UserDaoImpl implements UserDao {
	public UserDaoImpl() {
		System.out.println("UserDaoImpl");
	}

	@Override
	public void save() {
		System.out.println("用户正在保存");
		
	}

}
