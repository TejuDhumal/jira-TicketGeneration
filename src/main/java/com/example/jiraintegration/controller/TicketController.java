package com.example.jiraintegration.controller;

import com.example.jiraintegration.dto.Event;
import com.example.jiraintegration.model.TicketPayload;
import com.example.jiraintegration.service.TicketService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/api")
public class TicketController {

    @Autowired
    private TicketService ticketService;



   @PostMapping("/create")
    public ResponseEntity createTicket(@Valid @RequestBody TicketPayload ticketPayload) throws URISyntaxException {
        Object response = ticketService.createTicket(ticketPayload);
       Event event = new Event();
       event.setStatusCode(201);
       event.setMessage("ticket created");
       System.out.println(response);
       event.setResult(response);
       return ResponseEntity.created(new URI("/api/create")).body(event);
    }

}
