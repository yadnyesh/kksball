package io.yadnyesh.kksball;

import io.yadnyesh.kksball.config.EnvBasedConfig;
import io.yadnyesh.kksball.entity.Employee;
import io.yadnyesh.kksball.repository.EmployeeRepository;
import io.yadnyesh.kksball.service.AsyncService;
import io.yadnyesh.kksball.service.GithubLookupService;
import io.yadnyesh.kksball.service.PersonManagementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Arrays;
import java.util.stream.Collectors;

@SpringBootApplication
@EnableAsync
@EnableScheduling
public class KksballApplication implements CommandLineRunner {
	
	@Autowired
	AsyncService asyncService;
	
	@Autowired
	EnvBasedConfig envBasedConfig;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(KksballApplication.class, args);

	}
	
	@Override
	public void run(String... args) {
		envBasedConfig.setup();
		String collectStr = Arrays.stream(args).collect(Collectors.joining(","));
		System.out.println(collectStr);
		employeeRepository.save(getEmployee());
	}

	private Employee getEmployee() {
		Employee employee = new Employee();
		employee.setEmployeeName("Yadnyesh");
		employee.setEmail("yadnyesh@yotabyte.io");
		employee.setSalary(90000000000.00);
		System.out.println(employee);
		return employee;
	}
	
}
