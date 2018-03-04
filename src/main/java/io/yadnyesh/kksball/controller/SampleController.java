package io.yadnyesh.kksball.controller;

import io.yadnyesh.kksball.entity.ErrorJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;

@RestController
public class SampleController implements ErrorController {
	
	@Autowired
	ErrorAttributes errorAttributes;
	
	private static final String PATH="/error";
	
	@Override
	public String getErrorPath() {
		return PATH;
	}
	
	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome, Yadnyesh!";
	}
	
//	@GetMapping(PATH)
//	public String displayError(){
//		return "Displaying custom Error!!!";
//	}

	@GetMapping(PATH)
	ErrorJson error(HttpServletRequest request, HttpServletResponse response) {
		return new ErrorJson(response.getStatus(), getErrorAttributes(request, true));
	}
	
	private Map<String, Object> getErrorAttributes(HttpServletRequest request, boolean includeStackTrace) {
		RequestAttributes requestAttributes = new ServletRequestAttributes(request);
		return errorAttributes.getErrorAttributes(requestAttributes, includeStackTrace);
	}
}
