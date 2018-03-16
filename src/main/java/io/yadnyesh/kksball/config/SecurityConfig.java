package io.yadnyesh.kksball.config;

import io.yadnyesh.kksball.service.Topic.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private UserDetailsServiceImpl userDetailsServiceImpl;
	
	@Autowired
	private TopicAuthenticationEntryPoint topicAuthenticationEntryPoint;
	
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
//		httpSecurity.csrf().disable().authorizeRequests().antMatchers("/api/*")
//				.hasAnyRole("admin", "user").and().formLogin();
		httpSecurity.csrf().disable()
				.authorizeRequests()
					.antMatchers("/user/**").hasAnyRole("ADMIN", "USER")
					.and().httpBasic().realmName("Topic security application Realm")
					.authenticationEntryPoint(topicAuthenticationEntryPoint);
	
	}
	

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("sean").password("password").roles("user").and()
		////		.withUser("test").password("password").roles("test");
		
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		auth.userDetailsService(userDetailsServiceImpl).passwordEncoder(bCryptPasswordEncoder);
	}
}
