package io.yadnyesh.kksball.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController implements ErrorController {
	
	private static final String PATH="/error";
	
	@Override
	public String getErrorPath() {
		return PATH;
	}
	
	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome, Yadnyesh!";
	}
	
	@GetMapping(PATH)
	public String displayError(){
		return "Displaying custom Error!!!";
	}
}
