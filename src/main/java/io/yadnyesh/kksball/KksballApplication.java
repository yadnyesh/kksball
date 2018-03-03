package io.yadnyesh.kksball;

import io.yadnyesh.kksball.entity.Person;
import io.yadnyesh.kksball.service.PersonManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;


@SpringBootApplication
public class KksballApplication implements CommandLineRunner {
	
	@Autowired
	private PersonManagementService personManagementService;
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(KksballApplication.class, args);
	}
	
	@Override
	public void run(String... strings) throws Exception {
		List<Person> list = personManagementService.findByLastNameOrFirstName("Murphy", "Sean");
		list.forEach(System.out::println);
	}
}
