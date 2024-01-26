package com.hway.hotel.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hway.hotel.Service.RoomService;
import com.hway.hotel.model.Room;

@org.springframework.stereotype.Controller


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/hotel")
public class RoomController {
	
	@Autowired
	private RoomService roomService;

	@GetMapping("/room")
	public List<Room> getmapping() {
		return roomService.getAllRoom();
	}
	
	
}
