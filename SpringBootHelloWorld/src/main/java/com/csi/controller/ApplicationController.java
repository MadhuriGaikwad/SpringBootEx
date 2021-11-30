package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

	@GetMapping("/say")
	public String sayWelcome()
	{
		return "WELCOME TO FINTECH CSI PUNE";
	}
	
	@GetMapping("/services")
	public String csiServices()
	{
		return "E-COMMERCE APPLICATION DEVELOPMENT ";
	}
	
	@GetMapping("/Address")
	public String CsiAddress()
	{
		return "Pune";
	}
}
