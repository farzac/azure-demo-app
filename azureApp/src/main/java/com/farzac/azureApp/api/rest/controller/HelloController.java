package com.farzac.azureApp.api.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fabioz
 *
 */
@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Greetings aaaaaaafrom Spring Boot!";
	}

}