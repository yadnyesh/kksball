package io.yadnyesh.kksball.config;

import org.springframework.stereotype.Component;

@Component
public class ProdProfileBean implements EnvBasedConfig{
	
	@Override
	public void setup() {
		System.out.println("Prod config setup.....");
	}
}
