package com.seydou.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * Seydou Coulibaly this basic app force user to authenticate This SpringBoot
 * app use Starting Servlet engine: [Apache Tomcat/11.0.18]
 */
class SecuringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecuringWebApplication.class, args);
	}

}
