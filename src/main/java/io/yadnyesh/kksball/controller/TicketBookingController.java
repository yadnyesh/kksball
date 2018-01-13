package io.yadnyesh.kksball.controller;

import io.yadnyesh.kksball.entity.Ticket;
import io.yadnyesh.kksball.service.TicketBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/tickets")
public class TicketBookingController {
	
	@Autowired
	private TicketBookingService ticketBookingService;
	
	@PostMapping(value="/ticket")
	public Ticket createTicket(@RequestBody Ticket ticketRequest){
		return ticketBookingService.createTicket(ticketRequest);
	}

	@GetMapping(value="/ticket/{ticketId}")
	public Ticket findTicketById(@PathVariable("ticketId") Integer ticketId){
		return ticketBookingService.findTicketById(ticketId);
	}
	
	@GetMapping(value="/ticket")
	public Iterable<Ticket> getAllTickets(){
		return ticketBookingService.getAllTickets();
	}
}
