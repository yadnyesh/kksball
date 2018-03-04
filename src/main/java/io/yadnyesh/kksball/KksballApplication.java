package io.yadnyesh.kksball;

import com.sun.xml.internal.ws.util.CompletedFuture;
import io.yadnyesh.kksball.entity.Person;
import io.yadnyesh.kksball.service.PersonManagementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
@EnableAsync
public class KksballApplication implements CommandLineRunner {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(KksballApplication.class);
	
	@Autowired
	private PersonManagementService personManagementService;
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(KksballApplication.class, args);
		LOGGER.error("error Message");
		LOGGER.warn("warn Message");
		LOGGER.info("info Message");
		LOGGER.debug("debug Message");
	}
	
	@Override
	public void run(String... strings) throws Exception {
	}

}
