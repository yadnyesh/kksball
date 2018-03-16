package io.yadnyesh.kksball.service.Topic;

import io.yadnyesh.kksball.entity.Topic.UserInfo;
import io.yadnyesh.kksball.repository.Topic.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		UserInfo userInfo = userRepository.getActiveUser(userName);
		GrantedAuthority authority = new SimpleGrantedAuthority(userInfo.getRole());
		
		User user = new User(userInfo.getUserName(), userInfo.getPassword(), Arrays.asList(authority));
		UserDetails userDetails = (UserDetails) user;
		return userDetails;
	}
}
