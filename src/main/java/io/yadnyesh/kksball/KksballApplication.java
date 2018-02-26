package io.yadnyesh.kksball;

import io.yadnyesh.kksball.entity.Person;
import io.yadnyesh.kksball.service.PersonManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import io.yadnyesh.kksball.repository.PersonManagementRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.Date;
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
		//createPerson();
		//getPersonByLastName();
		List<Person> personList = personManagementService.getPersonByLastName("Murphy", new PageRequest(0,2,Sort.Direction.ASC, "firstName"));
		personList.forEach(System.out::println);
	}
	
//	private void getPersonByLastName() {
//		List<Person> personList = personManagementService.getPersonByLastName("Murphy");
//		personList.forEach(System.out::println);
//	}
	
	//	private void createPerson() {
//		//Person person1 = new Person("Sean", "Murphy", "sean.m2018@gmail.com", new Date());
//		List<Person > personList = Arrays.asList(new Person("Sean4", "Murphy2", "sean4.m2018@gmail.com2", new Date()),
//				new Person("Sean5", "Murphy3", "sean5.m2018@gmail.com", new Date()));
//		Iterable<Person> createdPerson = personManagementService.createMultiPerson(personList);
//		System.out.println(createdPerson);
//		//System.out.println(personManagementRepository.save(person1));
//	}
}
