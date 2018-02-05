package io.yadnyesh.kksball;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import io.yadnyesh.kksball.repository.PersonManagementRepository;

@SpringBootApplication
public class KksballApplication implements CommandLineRunner {
	
	@Autowired
	private PersonManagementRepository personManagementRepository;
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(KksballApplication.class, args);
	}
	
	@Override
	public void run(String... strings) throws Exception {
	
	}
}
