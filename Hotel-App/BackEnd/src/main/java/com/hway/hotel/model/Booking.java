package com.hway.hotel.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="booking-tbl")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String customerName;
	
	private String customerPhone;
	
	private String customerAddress;
	
	private String customerPayment;
	
	private Date checkIn;
	
	private Integer stayDays;
	
	private String roomType;
	
	private Integer bookingPrice;
	
	private Integer roomNum;
	
	private String people;
	
	private Integer total;
	
	private Float discount;
	
	private Float grandTotal;

}
