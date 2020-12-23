package com.crm.erk.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

import org.springframework.context.annotation.Bean;

@EnableZuulServer
@EnableDiscoveryClient
@SpringBootApplication
public class CrmErkServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrmErkServerApplication.class, args);
	}
	
	

}
