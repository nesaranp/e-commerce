package com.niit.dao;

import java.util.List;

import com.niit.model.User;

public interface UserDao {
	public boolean saveordelete(User user);
	public boolean delete(User user);
	public User getUserid(String userid);
	public List<User> list(); 
	
}
