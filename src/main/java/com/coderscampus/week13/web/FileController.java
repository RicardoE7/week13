package com.coderscampus.week13.web;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.week13.domain.User;
import com.coderscampus.week13.service.FileService;
@RestController
public class FileController {
	
	@Autowired
	private FileService fileService;
	
	@Autowired
	private User user;
	
	@GetMapping("/customer-report")
	public Integer getCustomerData(Integer customerId) {
		Integer customerData = 0;
		//fetch data based on customerId
		customerData = getCustomerDataById(customerId);
		return customerData;
	}
	
	private Integer getCustomerDataById(Integer customerId) {
		return new Random().nextInt();
	}
	
	@GetMapping("/read-lines")
	public List<String> readLines() throws IOException{
		System.out.println(user);
		return fileService.readFile("text.txt");
		
	}
	@GetMapping("/hello-world")
	public String helloWorld() throws IOException{
		return "Hello World";
		
	}
	@PostMapping("/hello-world")
	public String helloWorldPost() throws IOException{
		return "Okay cool, you just posted some data";
		
	}
	
}
