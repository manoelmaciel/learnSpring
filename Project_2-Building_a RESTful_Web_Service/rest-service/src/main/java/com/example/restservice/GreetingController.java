package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {


	private static final String greeting = "Hello ... %s!";
	private static final String testing = "Testando ... %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(greeting, name));		
	}	
			
	@GetMapping("/testing")
	public Testing testing(@RequestParam(value = "name", defaultValue = "O mecanismo!") String name) {
		return new Testing(counter.incrementAndGet(), String.format(testing, name));		
	}	
			
}
