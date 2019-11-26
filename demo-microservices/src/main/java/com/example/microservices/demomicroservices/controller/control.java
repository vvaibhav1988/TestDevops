package com.example.microservices.demomicroservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class control 
{
	
	@GetMapping
	public String sayHello()
	{
		return "First Test Application";
	}

}
