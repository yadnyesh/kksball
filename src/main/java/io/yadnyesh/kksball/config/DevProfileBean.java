package io.yadnyesh.kksball.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevProfileBean implements EnvBasedConfig{
	
	@Override
	public void setup() {
		System.out.println("Dev config setup.....");
	}
}
