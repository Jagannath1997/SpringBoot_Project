package com.jagan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jagan.entities.Ticket;
import com.jagan.services.TicketBookingService;

@RestController
@RequestMapping(value = "/tickets")
public class TicketBookingController {
	private static final Logger logger = LoggerFactory.getLogger(TicketBookingController.class);

	@Autowired
	public TicketBookingService ticketBookingService;

	@PostMapping(value = "/create")
	public Ticket createTicket(Ticket ticket) {
		logger.info("createTicket()::method call");
		return ticketBookingService.createTicket(ticket);
	}

//	@GetMapping(value = "/ticket/{ticketId}")
//	public Ticket getTicketById(@PathVariable("ticketId") Integer ticketId) {
//		return ticketBookingService.getTicketById(ticketId);
//	}

	public void demo(){
		System.out.println("demo()..!");	
	}
}
