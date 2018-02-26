package io.yadnyesh.kksball;

import com.sun.xml.internal.ws.util.CompletedFuture;
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
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class KksballApplication implements CommandLineRunner {
	
	@Autowired
	private PersonManagementService personManagementService;
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(KksballApplication.class, args);
	}
	
	@Override
	public void run(String... strings) throws Exception {
		List<Person> list = personManagementService.findByLastNameOrFirstName("Sean", "Murphy");
	}
}
