package com.jagan.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jagan.dao.TicketBookingDao;
import com.jagan.entities.Ticket;

@Service
public class TicketBookingService {
System.out.println("In TicketBookingSevice class...!");
	@Autowired
	private TicketBookingDao ticketBookingDao;

	/*
	 * This method is written for create a ticket *
	 */

	public Ticket createTicket(Ticket ticket) {
	System.out.println("createTicket()....!");
		return ticketBookingDao.save(ticket);
	}

}
