package com.springpro.springazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringazureApplication {

	@GetMapping("/msg")
	public  String msg()
	{
		return "hello";
	}
	public static void main(String[] args) {

		SpringApplication.run(SpringazureApplication.class, args);
		System.out.println("hi");
	}

}
