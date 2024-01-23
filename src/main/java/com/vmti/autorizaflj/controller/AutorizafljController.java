package com.vmti.autorizaflj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AutorizafljController {
	 @GetMapping("/saludo")
	    public String obtenerSaludo() {
	        return "¡Hola desde la API REST!";
	    }
}
