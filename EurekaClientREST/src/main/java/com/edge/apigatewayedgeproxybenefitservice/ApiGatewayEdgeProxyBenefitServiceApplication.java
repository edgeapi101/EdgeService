package com.edge.apigatewayedgeproxybenefitservice;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class ApiGatewayEdgeProxyBenefitServiceApplication {

	@RequestMapping(value = "/echoBeneficiaryName/{name}")
	public String echoStudentName(@PathVariable(name = "name") String name) {
		return "Hello  " + name + " Responsed on : " + new Date();
	}

	@RequestMapping(value = "/getBeneficiaryDetails/{name}")
	public Beneficiary getStudentDetails(@PathVariable(name = "name") String name) {
		return new Beneficiary(name, "John Doe Street,Anywhere,United States");
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayEdgeProxyBenefitServiceApplication.class, args);
	}
}

class Beneficiary {
	String name;
	String address;
	 

	public Beneficiary(String name, String address) {
		super();
		this.name = name;
		this.address = address;
		 
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
 

}
