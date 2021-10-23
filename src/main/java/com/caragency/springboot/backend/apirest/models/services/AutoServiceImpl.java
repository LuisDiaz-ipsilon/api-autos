package com.caragency.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caragency.springboot.backend.apirest.models.dao.IAutoDao;
import com.caragency.springboot.backend.apirest.models.entity.Auto;

@Service
public class AutoServiceImpl implements IAutoService {

	@Autowired
	private IAutoDao autoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Auto> findAll(){
		return (List<Auto>) autoDao.findAll();
	}

}
