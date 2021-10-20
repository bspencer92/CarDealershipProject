package com.CarDealership.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.CarDealership.Entity.User;



@Controller
public class UserController {
	
	@Autowired
	UserService userService; 
	
	@GetMapping("/sign-up")
	public ModelAndView signUp(Model model) {
		System.out.println("in sign up");
//When the user tries to view the sign up page
//This servlet will handle the request and add a spring 
//ModelAttribute object to map to the sign up form called “student”, which is a 
//Student object.
		return new ModelAndView("sign-up", "user", new User());
	}
	
	@PostMapping("/sign-up")
	//The Model Attribute will map to the html model attribute 
	//in step 19
		public String handleSignUp(Model model, @ModelAttribute("student") User user, HttpSession session) {
			userService.saveUser(user);
			model.addAttribute("newUser", user);
			return "thank-you";
		}
}
