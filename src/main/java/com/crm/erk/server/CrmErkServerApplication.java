package com.crm.erk.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
package com.crm.erk.server.filters.FilterZuul;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class CrmErkServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrmErkServerApplication.class, args);
	}
	
	@Bean
	public FilterZuul filterZuul() {
	   return new FilterZuul();
	}

}
