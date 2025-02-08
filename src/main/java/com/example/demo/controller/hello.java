package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hello {
	
	@GetMapping("/get")
	public static ResponseEntity<String> test() {
		return new ResponseEntity<>("Hi I am Deepan",HttpStatus.OK);
	}
	
}
