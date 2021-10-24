package com.caragency.springboot.backend.apirest.models.services;

import java.util.List;

import com.caragency.springboot.backend.apirest.models.entity.Auto;

public interface IAutoService {

	public List<Auto> findAll();
	
	public Auto findById(Long id);
	
	public Auto save(Auto auto);
	
	public void delete(Long id);
}
