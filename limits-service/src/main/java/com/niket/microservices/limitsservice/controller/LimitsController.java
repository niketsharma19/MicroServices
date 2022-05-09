package com.niket.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niket.microservices.limitsservice.configuration.MyConfigurations;
import com.niket.microservices.limitsservice.model.Limits;

@RestController
@RequestMapping(value = "/limits")
public class LimitsController {

	@Autowired
	private MyConfigurations myConfigurations;

	@GetMapping(value = "/getDefault")
	public Limits getLimits() {
		return new Limits(0, 100, "Fake");
	}

	@GetMapping(value = "/getProps")
	public Limits getLimitsProps() {
		return new Limits(myConfigurations.minimum, myConfigurations.maximum, myConfigurations.profile);
	}

}
