package com.nagi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("*")
@SpringBootApplication
public class NagiGroupApplication {

	public static void main(String[] args) {
		SpringApplication.run(NagiGroupApplication.class, args);
	}

}
