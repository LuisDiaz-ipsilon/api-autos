package com.caragency.springboot.backend.apirest.models.services;

import java.util.List;

import com.caragency.springboot.backend.apirest.models.entity.Auto;

public interface IAutoService {

	public List<Auto> findAll();
}
