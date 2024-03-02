package com.example.movieticket.controller;

import com.example.movieticket.model.Ticket;
import com.example.movieticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/tickets")
public class TicketController {

    private TicketService ticketService;

    @PostMapping
    public ResponseEntity<Ticket> createTicket(@RequestBody Map<String, String > payload){
        return new ResponseEntity<>(ticketService.createTicket(payload.get("imdbId"), payload.get("numOfSeat")), HttpStatus.OK);
    }
}
