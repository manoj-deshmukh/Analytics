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
import com.analytics.library.models.StatusCheck;

@RestController
@CrossOrigin(origins = "*")
public class ButtonController {
private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/saveHistory", method=RequestMethod.POST, consumes = {"application/json"})
	public ResponseEntity < String > persistHistory(@RequestBody StatusCheck statusHistory) {
       //  personRepository.persist(person);
		LOGGER.info("Click Event :"+statusHistory.toString());
		return ResponseEntity.status(HttpStatus.OK).build();
    }
	

}
