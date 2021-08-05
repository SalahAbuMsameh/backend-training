package com.example.demo.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * Aug 4, 2021
 * @author Salah Abu Msameh
 */
@Configuration
public class ServiceConfig {

	Logger logger = LogManager.getLogger(ServiceConfig.class);
	
	@Bean
	public LogManager logManager(@Value("${server.port}") String port) {
		logger.info("server port >> " + port);
		return null;//new LogManager();
	}
}
