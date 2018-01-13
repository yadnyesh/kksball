package io.yadnyesh.kksball.controller;

import io.yadnyesh.kksball.entity.Ticket;
import io.yadnyesh.kksball.repository.TicketBookingRepository;
import io.yadnyesh.kksball.service.TicketBookingService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketBookingController {
	
	private TicketBookingService ticketBookingService;
	
	public Ticket createTicket(Ticket ticketRequest){
		return ticketBookingService.createTicket(ticketRequest);
	}

}
