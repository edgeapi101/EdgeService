package com.edge.service;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*
* demonstrates how service-specific properties can be injected
*/
@ConfigurationProperties(prefix = "user.service", ignoreUnknownFields = false)
@Component
public class ServiceProperties {
	@NotNull // you can also create configurationPropertiesValidator
	private String name = "IVRService";
	
	@NotNull // you can also create configurationPropertiesValidator
	private String description = "IVR Service Spring Boot Service using Spring Data JPA, Spring Cloud Demo";

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
