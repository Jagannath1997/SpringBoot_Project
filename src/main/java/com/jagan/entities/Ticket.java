package com.jagan.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "ticket")
@Data
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ticketId;

	@Column(name = "passenger_name", nullable = false)
	private String passengerName;

	@Column(name = "booking_date")
	private String bookingDate;

	@Column(name = "source_station")
	private String sourceStation;

	@Column(name = "dest_station")
	private String destStation;

	@Column(name = "email")
	private String email;

}
