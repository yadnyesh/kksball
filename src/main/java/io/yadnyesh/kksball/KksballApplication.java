package io.yadnyesh.kksball;

import io.yadnyesh.kksball.config.EnvBasedConfig;
import io.yadnyesh.kksball.entity.GithubUser;
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
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

@SpringBootApplication
@EnableAsync
@EnableScheduling
public class KksballApplication implements CommandLineRunner {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(KksballApplication.class);
	
	@Autowired
	AsyncService asyncService;
	
	@Autowired
	private PersonManagementService personManagementService;
	
	@Autowired
	private GithubLookupService githubLookupService;
	
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
	}

}
