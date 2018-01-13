package io.yadnyesh.kksball.service;

import io.yadnyesh.kksball.entity.Ticket;
import io.yadnyesh.kksball.repository.TicketBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketBookingService {

	@Autowired
	TicketBookingRepository ticketBookingRepository;
	
	public Ticket findTicketById(Integer ticketId){
		return ticketBookingRepository.findOne(ticketId);
	}
	
	public Ticket createTicket(Ticket ticket){
		return ticketBookingRepository.save(ticket);
	}
}
