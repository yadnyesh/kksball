package io.yadnyesh.kksball.config;

public class DevProfileBean implements EnvBasedConfig{
	
	@Override
	public void setup() {
		System.out.println("Dev config setup.....");
	}
}
