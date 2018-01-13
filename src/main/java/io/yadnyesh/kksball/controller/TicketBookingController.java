package io.yadnyesh.kksball.controller;

import io.yadnyesh.kksball.entity.Ticket;
import io.yadnyesh.kksball.service.TicketBookingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/tickets")
public class TicketBookingController {
	
	private TicketBookingService ticketBookingService;
	
	@PostMapping(value="/ticket")
	public Ticket createTicket(Ticket ticketRequest){
		return ticketBookingService.createTicket(ticketRequest);
	}

	@GetMapping(value="ticket/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId") Integer ticketId){
		return ticketBookingService.findById(ticketId);
	}
}
