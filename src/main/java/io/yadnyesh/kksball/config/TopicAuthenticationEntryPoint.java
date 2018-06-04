package io.yadnyesh.kksball.config;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class TopicAuthenticationEntryPoint extends BasicAuthenticationEntryPoint {
	
	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
						 AuthenticationException authException) throws IOException, ServletException {
		response.addHeader("WWW-Authencate", "Basic realm=\"" + getRealmName() + "\"");
		response.sendError(HttpServletResponse.SC_UNAUTHORIZED, authException.getMessage());
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		setRealmName("Topic security application realm");
	}
}
