package com.tech.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Kailas World...!";
	}
	
}
