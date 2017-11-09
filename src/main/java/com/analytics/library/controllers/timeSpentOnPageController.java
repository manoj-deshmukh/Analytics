package com.analytics.library.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.analytics.library.models.Timer;

@RestController
@CrossOrigin(origins = "*")
public class timeSpentOnPageController {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="/saveTime", method=RequestMethod.POST ,consumes = {"application/json"})
	public ResponseEntity < String > persistTime(@RequestBody Timer timer) {
       //  personRepository.persist(person);
		LOGGER.info("Time spent on This page is :"+timer.getTime());
		return ResponseEntity.status(HttpStatus.OK).build();
    }
}
