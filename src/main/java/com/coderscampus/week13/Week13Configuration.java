package com.coderscampus.week13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coderscampus.week13.domain.User;



@Configuration
public class Week13Configuration {
	@Bean
	User user() {
		return new User("trevor@craftycodr.com","asdfasdf", "Trevor");
	}
}
