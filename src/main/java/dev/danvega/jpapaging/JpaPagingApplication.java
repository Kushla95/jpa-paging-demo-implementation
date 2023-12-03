package dev.danvega.jpapaging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.javafaker.Faker;

@SpringBootApplication
public class JpaPagingApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaPagingApplication.class, args);
	}
	
	@Bean
	Faker faker() {
		return new Faker();
	}

}
