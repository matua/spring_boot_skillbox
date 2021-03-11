package com.example.time_serv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
//@SpringBootConfiguration
//@ComponentScan
//@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.example"})
public class TimeServApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeServApplication.class, args);
	}

}
