package com.caragency.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.caragency.springboot.backend.apirest.models.entity.Auto;

@Service
public interface IAutoDao extends CrudRepository<Auto, Long>{

}
