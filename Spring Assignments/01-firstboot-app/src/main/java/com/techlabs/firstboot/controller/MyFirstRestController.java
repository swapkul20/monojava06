package com.techlabs.firstboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstRestController {
	
	@PostMapping("/sayhello")
	public String sayHello()
	{
		return "Hello! Welcome to spring boot";
	}
	
	@GetMapping("/say")
	public String sayBye()
	{
		return "Hello! Bye to spring boot";
	}

}
