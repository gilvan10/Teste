package com.aprendendo.teste;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class TesteController {

	@GetMapping
	public String getBook() {
		return "API Teste";
	}
	
}
