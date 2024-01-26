package com.hway.hotel.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hway.hotel.Repository.RoomRepository;
import com.hway.hotel.model.Room;

@Service
public class RoomService {
	
	@Autowired
	private RoomRepository roomRepository;
	
	public List<Room> getAllRoom(){
		return roomRepository.findAll();
	}
	
	public  void getRoom(int id, int roomNum) {
		
		Optional<Room> roomOptional = roomRepository.findById(id);
		
		
		if (roomOptional.isPresent()){
	        Room room = roomOptional.get();
	        int available = room.getAvailable();
	        System.out.println("before:"+available);
	        available = available - roomNum;
	        System.out.println("after:"+available);

	        int rented = roomNum;
	        System.out.println("rented: "+rented);
	        room.setAvailable(available);
	        room.setRented(rented);
	        roomRepository.save(room);
	        
	    } else {
	      System.out.println("Error data unavailable");
	    }
	}
}
