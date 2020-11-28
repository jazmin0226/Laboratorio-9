package com.cenfotec.seguridad.basica.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GeneralController {

	@GetMapping("/")
	public String index() {
		return "index";
	}	
	
	
}
