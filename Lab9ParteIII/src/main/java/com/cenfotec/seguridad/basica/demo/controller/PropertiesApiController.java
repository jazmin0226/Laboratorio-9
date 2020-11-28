package com.cenfotec.seguridad.basica.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cenfotec.seguridad.basica.demo.domain.Property;

@RestController
public class PropertiesApiController {

	@GetMapping("/properties")
	public List<Property> getAllProperties(){
		ArrayList<Property>result =new ArrayList<>();
		result.add(new Property());
		return result;
	}
	
}
