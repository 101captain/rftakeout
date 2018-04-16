package com.bunfly.dao;

import org.apache.ibatis.annotations.Param;

import com.bunfly.entity.Teacher;

public interface HomeTeacherMapper {
	Teacher selectTeacherById(@Param("id")Integer id);
}
