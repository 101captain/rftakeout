package com.bunfly.test;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.bunfly.dao.HomeStudentMapper;
import com.bunfly.entity.Student;

public class StudentTest {
	private SqlSessionFactory sqlSessionFactory=null;
	Logger log = Logger.getLogger(StudentTest.class);
	
	public SqlSessionFactory getSessionFactory() throws IOException {
		
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");	
		if (sqlSessionFactory==null) {
			synchronized(StudentTest.class) {
			return	new SqlSessionFactoryBuilder().build(in);
			}
		}
		return sqlSessionFactory;
	}
	
	public SqlSession getSession() throws IOException {
		
		return this.getSessionFactory().openSession();
	}
	
	@Test
	public void selectStudentById() throws IOException {
		SqlSession session=	getSession();
		HomeStudentMapper sMapper=session.getMapper(HomeStudentMapper.class);
		Student student=sMapper.selectStudentById(1);
		System.out.println(student);
		session.close();
	}
	@Test
	public void selectStudentById2() throws IOException {
		SqlSession session=	getSession();
		HomeStudentMapper sMapper=session.getMapper(HomeStudentMapper.class);
		Student student=sMapper.selectStudentById2(1);
		System.out.println(student);
		session.close();
	}
	@Test
	public void selectStudentAll() throws IOException {
		SqlSession session=	getSession();
		HomeStudentMapper sMapper=session.getMapper(HomeStudentMapper.class);
		List<Student> list=sMapper.selectStudentAll();
		for (Student student : list) {
			System.out.println(student);
		}
		session.close();
	}
}
