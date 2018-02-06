package io.yadnyesh.kksball;

import io.yadnyesh.kksball.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import io.yadnyesh.kksball.repository.PersonManagementRepository;

import java.util.Date;

@SpringBootApplication
public class KksballApplication implements CommandLineRunner {
	
	@Autowired
	private PersonManagementRepository personManagementRepository;
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(KksballApplication.class, args);
	}
	
	@Override
	public void run(String... strings) throws Exception {
		createPerson();
	}
	
	private void createPerson() {
		Person person1 = new Person("Sean", "Murphy", "sean.m2018@gmail.com", new Date());
		System.out.println(personManagementRepository.save(person1));
	}
}
