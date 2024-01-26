package com.hway.hotel.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hway.hotel.Repository.BookingRepository;
import com.hway.hotel.Service.BookingService;
import com.hway.hotel.Service.RoomService;
import com.hway.hotel.model.Booking;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/hotel")
public class BookingController {
	
	@Autowired
	private BookingService bookService;
	
	@Autowired
	private RoomService roomService;
	
	@PostMapping("/booking")
	public String bookingDetails(@RequestBody Booking booking){
		
		
		String roomtype = booking.getRoomType();
		System.out.println(roomtype);
		int roomNum = booking.getRoomNum();
		int id = 1;
		if(roomtype.equals("Single")) {
			id = 1;
		}else if(roomtype == "Deluxe") {
			id = 2;
		}else {
			id = 3;
		}
		bookService.insertBooking(booking);
		
		roomService.getRoom(id,roomNum);
		
		return "API Hit Success";
		
		
	}
	

}
