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
	public List<Auto> findAll() {
		return (List<Auto>) autoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Auto findById(Long id) {
		// TODO Auto-generated method stub
		return autoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Auto save(Auto auto) {
		// TODO Auto-generated method stub
		return autoDao.save(auto);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		autoDao.deleteById(id);

	}

}
