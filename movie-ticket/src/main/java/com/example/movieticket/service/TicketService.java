package com.example.movieticket.service;

import com.example.movieticket.model.Ticket;
import com.example.movieticket.repo.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class TicketService {
    @Autowired
    private TicketRepo ticketRepo;

    public Ticket createTicket(String imdbId, String numOfSeat){
        Ticket ticket  = new Ticket();
        ticket.setImdbId(imdbId);
        ticket.setNumOfSeat(Integer.parseInt(numOfSeat));
        return ticketRepo.save(ticket);
    }
}
