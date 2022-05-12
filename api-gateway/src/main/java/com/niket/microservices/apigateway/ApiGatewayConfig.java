package com.niket.microservices.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfig {

	@Bean
	public RouteLocator routeLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route((val) -> val.path("/currency-exchange/**").uri("lb://currency-exchange"))
				.route((val) -> val.path("/currency-conversion/**").uri("lb://currency-conversion"))
				.route((val) -> val.path("/currency-conversion-feign/**").uri("lb://currency-conversion"))
				.build();
	}

}
