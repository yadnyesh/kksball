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
	
	public void cancelTicket(Integer ticketId) {
		ticketBookingRepository.delete(ticketId);
	}
	
	public Ticket findTicketById(Integer ticketId){
		return ticketBookingRepository.findOne(ticketId);
	}
	
	public Ticket createTicket(Ticket ticket){
		return ticketBookingRepository.save(ticket);
	}
	
	public Ticket updateTicket(Ticket requestTicket){
		return ticketBookingRepository.save(requestTicket);
	}
	
	public Iterable<Ticket> getAllTickets() {
		return ticketBookingRepository.findAll();
	}
	
	public Ticket updateTicket(Integer ticketId, String newEmail) {
		Ticket ticket = ticketBookingRepository.findOne(ticketId);
		ticket.setEmail(newEmail);
		Ticket updatedTicket = ticketBookingRepository.save(ticket);
		return updatedTicket;
	}
}
