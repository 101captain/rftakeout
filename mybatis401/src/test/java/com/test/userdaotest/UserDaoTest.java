package com.test.userdaotest;


import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.bunfly.dao.UserDao;
import com.bunfly.entity.User;

public class UserDaoTest {
//引入log4j日志	
Logger log = Logger.getLogger(UserDaoTest.class);
	@Test
	public void getUserById() throws IOException {
		//通过流去读取mybatis的全局配置文件
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");		/**
		 /* 
		  * 获得SqlSessionFactory 工厂
		  */
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		//获得Sqlsession 
		SqlSession session = factory.openSession();
		//得到映射文件
		UserDao ud = session.getMapper(UserDao.class);
		//执行指定语句
		User user = ud.getUserById(1);
		System.out.println(user);
		//提交查询结果
		session.commit();
		//关闭session
		session.close();
		
	}

}
