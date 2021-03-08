/**
 * 
 */
package com.farzac.azureApp.api.rest.controller;

import org.springframework.web.bind.annotation.RestController;

import com.farzac.azureApp.api.MessageProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author fabioz
 *
 */
@Setter
@Getter
@AllArgsConstructor
@RestController(value = "/helloAzure")
public class HelloController {

	private final MessageProperties properties;
	
	
	
}
