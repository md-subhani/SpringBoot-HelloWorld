package com.example.servcie;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String getHelloMessage() {
		return "Welcome To SpringBoot World";
	}

}
