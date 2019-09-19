package com.rj.act;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class SpringBootAcutatorAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAcutatorAdminServerApplication.class, args);
	}

}
