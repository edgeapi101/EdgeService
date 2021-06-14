package com.edge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class IvrEurekaServiceDiscoveryHaApplication {

	public static void main(String[] args) {
		SpringApplication.run(IvrEurekaServiceDiscoveryHaApplication.class, args);
	}
}
