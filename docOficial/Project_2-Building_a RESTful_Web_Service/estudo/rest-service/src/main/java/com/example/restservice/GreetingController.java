package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {


	private static final String templateGreeting = "Hello ... %s!";
	private static final String templateTest = "Testando ... %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(templateGreeting, name));		
	}	
			
	@GetMapping("/test")
	public Greeting test(@RequestParam(value = "name", defaultValue = "O mecanismo") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(templateTest, name));		
	}	
			
}
