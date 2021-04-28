package com.training;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.training.model.Booking;
public interface BookingRepo extends JpaRepository<Booking, Integer> {

	List<Booking> findByuname(String uname);

	

}
