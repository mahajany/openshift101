package com.techactivate.bootdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techactivate.bootdemo.entity.User;

@RestController
public class UserController {

	@RequestMapping("/")
	public List<User> getEmployees() {
		List<User> users = new ArrayList<User>();
		users.add(new User(1, "Yogesh", "Mahajan", "yogesh@techactivate.com"));
		return users;
	}

}
