package com.javamercury.mercury;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MercuryApplication {

	public static void main(String[] args) {
		System.out.println("App is about to work!");

		SpringApplication.run(MercuryApplication.class, args);
	}

}
