package com.farzac.azureApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.farzac.azureApp.api.MessageProperties;

@SpringBootApplication
@EnableConfigurationProperties(MessageProperties.class)
public class AzureAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureAppApplication.class, args);
	}

}
