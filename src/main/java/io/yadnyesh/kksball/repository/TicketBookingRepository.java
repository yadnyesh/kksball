package io.yadnyesh.kksball.repository;

import io.yadnyesh.kksball.entity.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketBookingRepository extends CrudRepository<Ticket, Integer>{

}
