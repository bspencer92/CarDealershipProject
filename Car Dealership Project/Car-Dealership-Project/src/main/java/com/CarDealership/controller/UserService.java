package com.CarDealership.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.CarDealership.Entity.User;


@Service
public class UserService {
	private ArrayList<User> userList; 
	
	public ArrayList<User> saveUser(User user) {
		userList.add(user);
		return userList;

	}

	public User login(String email, String password) {
		User user = new User();
		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).getEmail().equals(email)
					&& userList.get(i).getPassword().equals(password)) {
				System.out.println("found user");
				return userList.get(i);
			}

		}
		return user;
	}
}
