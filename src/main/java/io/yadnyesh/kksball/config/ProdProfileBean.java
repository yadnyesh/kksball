package io.yadnyesh.kksball.config;

public class ProdProfileBean implements EnvBasedConfig{
	
	@Override
	public void setup() {
		System.out.println("Prod config setup.....");
	}
}
