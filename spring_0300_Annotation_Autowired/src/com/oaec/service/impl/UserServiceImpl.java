package com.oaec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.oaec.dao.UserDao;
import com.oaec.dao.impl.UserDaoImpl;
import com.oaec.service.UserService;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public void regist() {
		userDao.save();
		
	}
	
//	public UserDao getUserDao() {	
//		return userDao;
//	}
	/**
	 * @Autowired��Ĭ���ǰ����ͽ���ע�룬����밴����ע������Ҫ��@Qualifierע��
	 * ���Լ���set�����ϣ�Ҳ���Լ��������ϣ������ƻ���װ��
	 */
	/*@Autowired
	 //value����ʡ��
	@Qualifier(value="userDao")
	public void setUserDao(UserDao userDao) {
		System.out.println("setUserDao");
		this.userDao = userDao;
	}*/
	
}
