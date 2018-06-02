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
	 * @Autowired：默认是按类型进行注入，如果想按名字注入则需要加@Qualifier注解
	 * 可以加在set方法上，也可以加在属性上（这种破坏封装）
	 */
	/*@Autowired
	 //value可以省略
	@Qualifier(value="userDao")
	public void setUserDao(UserDao userDao) {
		System.out.println("setUserDao");
		this.userDao = userDao;
	}*/
	
}
