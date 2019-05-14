package com.jagan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jagan.entities.Ticket;
import com.jagan.services.TicketBookingService;

@SpringBootApplication
public class SpringBootDataRestControllerApplication {

	public static void main(String[] args) {

		/* initialize the Spring Container */
		ApplicationContext applicationContext = SpringApplication.run(SpringBootDataRestControllerApplication.class,
				args);

		/* get the ticketBookingService class */
		TicketBookingService ticketBookingService = applicationContext.getBean("ticketBookingService",
				TicketBookingService.class);
		
		/* create the Ticket class obejct */
		Ticket ticket = new Ticket();

		// ticket.setTicketId(1001);
		ticket.setPassengerName("pqr");
		ticket.setBookingDate("12-05-19");
		ticket.setSourceStation("hyd");
		ticket.setDestStation("bbsr");
		ticket.setEmail("jagannath@gmail.com");

		ticketBookingService.createTicket(ticket);
	}
}
