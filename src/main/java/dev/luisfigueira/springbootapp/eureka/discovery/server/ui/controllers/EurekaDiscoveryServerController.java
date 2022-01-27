package dev.luisfigueira.springbootapp.eureka.discovery.server.ui.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ds")
public class EurekaDiscoveryServerController {

	@Autowired
	Environment environment;

	@GetMapping(value = "/scramble")
	public String scrambleText(@RequestParam String param) {
		return "HELLO" + param + "WORLD";
	}

	@GetMapping(value = "/status")
	public String getNameAndPort() {
		return "Server Name: "
				+ environment.getProperty("spring.application.name")
				+ "\nServer Port: " + environment.getProperty("local.server.port");
	}

}
