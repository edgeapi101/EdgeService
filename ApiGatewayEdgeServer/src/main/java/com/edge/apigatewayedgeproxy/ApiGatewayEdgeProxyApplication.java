package com.edge.apigatewayedgeproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.edge.apigatewayedgeproxy.filters.ErrorFilter;
import com.edge.apigatewayedgeproxy.filters.PostFilter;
import com.edge.apigatewayedgeproxy.filters.PreFilter;
import com.edge.apigatewayedgeproxy.filters.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ApiGatewayEdgeProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayEdgeProxyApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
