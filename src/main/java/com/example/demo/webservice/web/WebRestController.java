package com.example.demo.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {
	
	@GetMapping("/hello")
	public String hell() {
		return "hellow_dasld";
	}

}
