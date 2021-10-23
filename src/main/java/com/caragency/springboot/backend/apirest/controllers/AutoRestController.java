package com.caragency.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caragency.springboot.backend.apirest.models.entity.Auto;
import com.caragency.springboot.backend.apirest.models.services.IAutoService;

//colocar en la anotacion crossOrigin (origins = {"http://localhost:4200"}) para especificar el origen
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class AutoRestController {
	
	@Autowired
	private IAutoService autoService;

	@GetMapping("/autos")
	public List<Auto> index(){
		return autoService.findAll();
	}
}
