package com.statistics.service.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping(value = "/home")
	public String getHome() {
		return "Welcome Home "+ new Date().toString();
	}
}
