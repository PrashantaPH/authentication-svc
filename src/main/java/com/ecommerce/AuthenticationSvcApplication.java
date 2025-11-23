package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AuthenticationSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationSvcApplication.class, args);
	}

}
