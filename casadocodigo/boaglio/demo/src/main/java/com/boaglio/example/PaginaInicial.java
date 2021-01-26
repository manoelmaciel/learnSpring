package com.boaglio.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaginaInicial {
	
	@RequestMapping("/")
	String Home() {
		return "<h1>Olá ... Spring Boot!</h1>";
	}

}
