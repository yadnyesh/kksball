package io.yadnyesh.kksball;

import io.yadnyesh.kksball.entity.Ticket;
import io.yadnyesh.kksball.service.TicketBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;
import java.util.Date;

@SpringBootApplication
public class KksballApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(KksballApplication.class, args);
	}
}
