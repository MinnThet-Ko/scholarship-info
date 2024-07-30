package com.si.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.si.models.User;
import com.si.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public String displayLoginPage(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}
	
	@PostMapping("/login")
	public String handleLogin(@ModelAttribute User user, Model model) {
		return "redirect:/";
	}
	
	@GetMapping("/registration")
	public String displayRegistrationPage(Model model) {
		System.out.println("In displayRegistrationPage");
		model.addAttribute("user", new User());
		return "registration";
	}
	
	@PostMapping("/registration")
	public String handleRegistration(@ModelAttribute User user, Model model) {
		this.userService.saveUser(user);
		return "redirect:/user/login";
	}
}
