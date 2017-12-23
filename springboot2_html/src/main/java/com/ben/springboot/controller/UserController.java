package com.ben.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/show")
	public String show() {
		
		return "/user.html";
	}
}
