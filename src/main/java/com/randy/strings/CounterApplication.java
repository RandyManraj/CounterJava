package com.randy.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class CounterApplication {
	Integer counter = 0;

	public static void main(String[] args) {
		SpringApplication.run(CounterApplication.class, args);
	}

}
