package com.home.loan.homepage.controller;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer
{
@Override
public void addCorsMappings (CorsRegistry registry) {

 registry.addMapping("/**")
	.allowedOrigins("http://localhost:3000") // React's default port
	.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allow specific methods
	.allowedHeaders("*") // Allow all headers
	.allowCredentials(true)
	.maxAge(3600); // Allow credentials (e.g., cookies, authorization headers)
}
}
