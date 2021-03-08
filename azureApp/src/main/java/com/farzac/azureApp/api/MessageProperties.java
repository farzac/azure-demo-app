package com.farzac.azureApp.api;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@ConfigurationProperties(prefix= "config")
public class MessageProperties {
	
	private String message;

}
