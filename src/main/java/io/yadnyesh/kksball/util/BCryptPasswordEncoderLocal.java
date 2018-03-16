package io.yadnyesh.kksball.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderLocal {
	
	public static void main(String[] args) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		System.out.println(bCryptPasswordEncoder.encode("m@123"));
		System.out.println(bCryptPasswordEncoder.encode("s@123"));
		
	}
	
}
