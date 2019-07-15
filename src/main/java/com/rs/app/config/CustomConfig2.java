package com.rs.app.config;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfig2 implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {
	@Override
	public void customize(ConfigurableServletWebServerFactory factory) {
		factory.setContextPath("/my-app1");
		factory.setPort(8697);		
	}
}
