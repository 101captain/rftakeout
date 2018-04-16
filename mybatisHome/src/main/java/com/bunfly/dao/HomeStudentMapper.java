package com.bunfly.dao;

import java.util.List;

import com.bunfly.entity.Student;

public interface HomeStudentMapper {
	Student selectStudentById(Integer id);
	Student selectStudentById2(Integer id);
	List<Student> selectStudentAll();
}
