package com.example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService servie;
	
	@GetMapping("/")
	public List<User> viewUser()
	{
		servie.ViewAllUser();
		List<User> user = servie.ViewAllUser();
		
		return  user;
	}
	
	
	@PostMapping("/")
	public String addUser(@RequestBody User u)
	{
		servie.addUser(u);
		return "User Added SuccessFully..!!!";
	}
	
	@DeleteMapping("/")
	public String deleteUser(@RequestParam("id")int id)
	{
		servie.deleteUser(id);
		
		return "User Successfully deleted..";
	}
	
	@PutMapping("/")
	public String updateUser(@RequestBody User u)
	{
		servie.updateUser(u);
		
		return "User Update Successfully..!!!";
	}
	
	
	
	

}
