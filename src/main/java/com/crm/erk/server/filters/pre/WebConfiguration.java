package com.crm.erk.server.filters.pre;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		System.out.println("CorsRegistry " + registry);
		registry.addMapping("/**").allowedOrigins("*").allowedOrigins("http://51.68.44.179","http://51.68.44.179/","http://51.68.44.179/authenticate","http://localhost:8080","51.68.44.179").allowedMethods("GET", "POST", "DELETE",
				"PUT");
	}

}
