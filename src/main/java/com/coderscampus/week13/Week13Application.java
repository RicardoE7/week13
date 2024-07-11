package com.coderscampus.week13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@ComponentScan("com.coderscampus.week13")

public class Week13Application {

	public static void main(String[] args) {
		SpringApplication.run(Week13Application.class, args);
	}

}
