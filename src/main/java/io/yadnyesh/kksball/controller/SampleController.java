package io.yadnyesh.kksball.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome, Yadnyesh!";
	}
	
	@GetMapping("/error")
	public String displayError(){
		return "Error!!!";
	}
}
