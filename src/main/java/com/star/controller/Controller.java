package com.star.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.star.entity.UserEquipment;
import com.star.model.BookingDetails;

@RestController
public class Controller {
 
	@PostMapping("/bookEquipment")
	public ResponseEntity<UserEquipment> bookTheEquipments(@RequestBody BookingDetails bookingDetails){
		
	
		return null;
		
	}
}
