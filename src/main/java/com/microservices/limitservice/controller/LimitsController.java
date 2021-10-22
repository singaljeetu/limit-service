package com.microservices.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limitservice.bean.Limits;
import com.microservices.limitservice.configuration.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	Configuration configuration;
	
	@GetMapping(path = "/limits")
	public Limits getLimits() {
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
	}

}
