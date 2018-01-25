package io.yadnyesh.kksball;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KksballApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(KksballApplication.class, args);
	}
}
