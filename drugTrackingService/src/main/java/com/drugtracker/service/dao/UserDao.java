package com.drugtracker.service.dao;

import java.util.List;

import com.drugtracker.service.model.User;

public interface UserDao {
	public List<User> getUsers();
	public User getUser(String user_id);
	public void insertUser(User user);
}
