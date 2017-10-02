package com.decos.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class AppApplication {
	
	private static final Logger log = LoggerFactory.getLogger(AppApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
		log.info("BIENVENIDO A LA APP");
	}

}
