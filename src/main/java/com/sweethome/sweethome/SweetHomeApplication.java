package com.sweethome.sweethome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class SweetHomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SweetHomeApplication.class, args);
	}

}
