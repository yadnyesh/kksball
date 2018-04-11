package io.yadnyesh.kksball;

import io.yadnyesh.kksball.config.EnvBasedConfig;
import io.yadnyesh.kksball.service.AsyncService;
import io.yadnyesh.kksball.service.PersonManagementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

@SpringBootApplication
@EnableAsync
public class KksballApplication implements CommandLineRunner {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(KksballApplication.class);
	
	@Autowired
	AsyncService asyncService;
	
	@Autowired
	private PersonManagementService personManagementService;
	
	@Autowired
	EnvBasedConfig envBasedConfig;
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(KksballApplication.class, args);

	}
	
	@Override
	public void run(String... args) throws Exception {
		envBasedConfig.setup();
		String collectStr = Arrays.stream(args).collect(Collectors.joining(","));
		System.out.println(collectStr);
		
		Future<String> process1 = asyncService.process();
		Future<String> process2 = asyncService.process();
		Future<String> process3 = asyncService.process();
		
		
	}
	
	@Bean
	public Executor asyncExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(2);
		executor.setMaxPoolSize(2);
		executor.setQueueCapacity(500);
		executor.setThreadNamePrefix("GithubLookup-");
		executor.initialize();
		return executor;
	}

}
