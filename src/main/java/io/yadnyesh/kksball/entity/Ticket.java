package io.yadnyesh.kksball.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="ticket")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ticket_id")
	private Integer ticketId;
	
	@Column(name="passenger_name", nullable = false)
	private String passengerName;
	
	@Column(name="booking_date")
	private Date bookingDate;
	
	@Column(name="source_station")
	private String sourceStation;
	
	@Column(name="dest_station")
	private String destStation;
	
	@Column(name="email")
	private String email;
	
	public Ticket() {
	}
	
	public Ticket(String passengerName, Date bookingDate, String sourceStation, String destStation, String email) {
		this.passengerName = passengerName;
		this.bookingDate = bookingDate;
		this.sourceStation = sourceStation;
		this.destStation = destStation;
		this.email = email;
	}
	
	public Integer getTicketId() {
		return ticketId;
	}
	
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
	
	public String getPassengerName() {
		return passengerName;
	}
	
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	
	public Date getBookingDate() {
		return bookingDate;
	}
	
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	
	public String getSourceStation() {
		return sourceStation;
	}
	
	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}
	
	public String getDestStation() {
		return destStation;
	}
	
	public void setDestStation(String destStation) {
		this.destStation = destStation;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null || getClass() != o.getClass()) {
			return false;
		}
		Ticket ticket = (Ticket) o;
		return Objects.equals(ticketId, ticket.ticketId) && Objects.equals(passengerName, ticket.passengerName) && Objects
				.equals(bookingDate, ticket.bookingDate) && Objects.equals(sourceStation, ticket.sourceStation) && Objects
				.equals(destStation, ticket.destStation) && Objects.equals(email, ticket.email);
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(ticketId, passengerName, bookingDate, sourceStation, destStation, email);
	}
}
