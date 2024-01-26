package com.hway.hotel.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hway.hotel.Repository.BookingRepository;
import com.hway.hotel.model.Booking;

@Service
public class BookingService {
	
	@Autowired
	private BookingRepository bookRepository;
	
	public void insertBooking(Booking booking) {
		bookRepository.save(booking);
	}

	

}
