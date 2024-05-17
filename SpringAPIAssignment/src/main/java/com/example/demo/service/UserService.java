package com.example.demo.service;
import java.util.List;

import com.example.demo.model.User;

public interface UserService {
	
	public void addUser(User u);
	public List<User> ViewAllUser();
	public void deleteUser(int id);
	public void updateUser(User u);
	public User getById(int id);
	

}
