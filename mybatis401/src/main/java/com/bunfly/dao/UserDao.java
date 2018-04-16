package com.bunfly.dao;

import java.util.List;

import com.bunfly.entity.User;

/**
 * 数据库操作UserDao层
 * @author Administrator
 *
 */
public interface UserDao {

	User getUserById(Integer id);
	List<User> getAllUser();
	int insertUser(User user);
	int deleteUser(Integer id);
	int updateUser(User user);
	
}
