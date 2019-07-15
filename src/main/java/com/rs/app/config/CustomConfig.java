package com.rs.app.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfig implements WebServerFactoryCustomizer<TomcatServletWebServerFactory> {
	@Override
	public void customize(TomcatServletWebServerFactory factory) {
		factory.setContextPath("/my-app");
		factory.setPort(8696);
	}
}
