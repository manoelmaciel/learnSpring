package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClientController {
	
	@GetMapping("/clients")
	public List<Cliente> Listar() {
		
		Cliente cliente1 = new Cliente(1L, "Maciel", "34 99283-2399", "manoelbraz.maciel@gmail.com");
		Cliente cliente2 = new Cliente(1L, "Manoel", "34 99283-2399", "manoelbraz.maciel@gmail.com");
		
		return Arrays.asList(cliente1, cliente2);
	}

}
