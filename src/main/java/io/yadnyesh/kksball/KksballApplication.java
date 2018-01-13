package io.yadnyesh.kksball;

import io.yadnyesh.kksball.entity.Ticket;
import io.yadnyesh.kksball.service.TicketBookingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Date;

@SpringBootApplication
public class KksballApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(KksballApplication.class, args);
		TicketBookingService ticketBookingService = applicationContext.getBean("ticketBookingService", TicketBookingService.class);
		Ticket ticket = new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setDestStation("Mumbai");
		ticket.setSourceStation("Pune");
		ticket.setPassengerName("Sachin");
		ticket.setEmail("Test@test.com");
		ticketBookingService.createTicket(ticket);
	}
}
