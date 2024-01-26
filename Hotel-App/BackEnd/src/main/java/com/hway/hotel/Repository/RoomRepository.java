package com.hway.hotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hway.hotel.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {

}
