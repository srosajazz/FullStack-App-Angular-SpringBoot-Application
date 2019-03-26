package com.sergiorosa.sergiorosafullstackappangularspringboot.rest;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(ResourceConstants.ROOM_RESERVATION_V1)
public class ReservationResources {
	
	 @RequestMapping(path ="", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	    public ResponseEntity<ReservationResources> getAvailableRooms (
	            @RequestParam(value = "checkin")
	            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	                    LocalDate checkin,
	            @RequestParam(value = "checkout")
	            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	                    LocalDate checkout) {
	return new ResponseEntity<>(new ReservationResources(), HttpStatus.OK);	
	}
}
