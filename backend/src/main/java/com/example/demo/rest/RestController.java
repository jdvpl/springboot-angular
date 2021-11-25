package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping ("/api")
	public String nombreSitio() {
		return "Api Rest JDVPL";
	}
	
	@GetMapping ("/description")
	public String descripcionSitio() {
		return "Api Rest de con Spring Boot y Angular";
	}
}
