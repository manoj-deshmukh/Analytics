/**
 * 
 */
package com.analytics.library.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.analytics.library.models.HealthStatus;


/**
 * @author manoj
 *
 */
@RestController
public class HealthController {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="/health", method=RequestMethod.GET)
	public @ResponseBody ResponseEntity<HealthStatus> healthCheck(){ 
	
		HealthStatus healthstatus = new HealthStatus();
		healthstatus.setStatus("OK");
		LOGGER.debug("Executing Analytics Health Check Api");
		return new ResponseEntity<HealthStatus>(healthstatus, HttpStatus.OK);
	}
}
