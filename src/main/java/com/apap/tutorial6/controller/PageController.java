package com.apap.tutorial6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.apap.tutorial6.model.UserRoleModel;

@Controller
public class PageController {
	@RequestMapping("/")
	public String home(Model model) {
		return "home";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
}
