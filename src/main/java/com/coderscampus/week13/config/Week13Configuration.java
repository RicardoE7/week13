package com.coderscampus.week13.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coderscampus.week13.domain.User;



@Configuration
public class Week13Configuration {
	@Bean
	public User user() {
		return new User("trevor@craftycodr.com","asdfasdf", "Trevor");
	}
}
