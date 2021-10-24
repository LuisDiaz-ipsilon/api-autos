package com.caragency.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	
	@GetMapping("/autos/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Auto show(@PathVariable Long id) {
		return autoService.findById(id);
	}
	
	@PostMapping("/autos")
	@ResponseStatus(HttpStatus.CREATED)
	public Auto create(@RequestBody Auto auto){
		return autoService.save(auto);
	}
	
	@PutMapping("/autos/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Auto update(@RequestBody Auto auto, @PathVariable Long id) {
		Auto autoActual = autoService.findById(id);
		
		autoActual.setModelo(auto.getModelo());
		//colocar mas atributos en la siguiente actualizacion
		
		return autoService.save(autoActual);
	}
	
	@DeleteMapping("/autos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		autoService.delete(id);
	}
	
	
	
	
}
