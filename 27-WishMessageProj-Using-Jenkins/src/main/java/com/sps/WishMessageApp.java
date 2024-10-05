package com.sps;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WishMessageApp {

	@Bean("localDateTime")
	LocalDateTime createLdt() {
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		SpringApplication.run(WishMessageApp.class, args);
	}

}
