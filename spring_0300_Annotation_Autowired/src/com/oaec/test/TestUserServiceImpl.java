package com.oaec.test;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Properties;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oaec.pojo.Department;
import com.oaec.pojo.User;
import com.oaec.service.UserService;
import com.oaec.service.impl.UserServiceImpl;

class TestUserServiceImpl {
	ApplicationContext ac = null;
	@Before
	public void before() {
		System.out.println("before");
		ac = new ClassPathXmlApplicationContext("applicationContext.xml");

	}

	@Test
	void test() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserServiceImpl)ac.getBean("userservice");
		userService.regist();
		ac.close();
	}
	
}
