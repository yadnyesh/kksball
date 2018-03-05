package io.yadnyesh.kksball.config;

import org.springframework.stereotype.Component;

@Component
public class DevProfileBean implements EnvBasedConfig{
	
	@Override
	public void setup() {
		System.out.println("Dev config setup.....");
	}
}
