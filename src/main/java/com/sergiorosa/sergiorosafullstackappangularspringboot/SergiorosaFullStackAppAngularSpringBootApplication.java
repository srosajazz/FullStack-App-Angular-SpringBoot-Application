package com.sergiorosa.sergiorosafullstackappangularspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class SergiorosaFullStackAppAngularSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SergiorosaFullStackAppAngularSpringBootApplication.class, args);
	}

}
