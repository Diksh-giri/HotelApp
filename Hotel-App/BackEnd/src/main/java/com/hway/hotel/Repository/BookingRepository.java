package com.hway.hotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hway.hotel.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
