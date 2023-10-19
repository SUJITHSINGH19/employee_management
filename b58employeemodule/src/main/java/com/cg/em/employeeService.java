package com.cg.em;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class employeeService {

	@Autowired
	private employeeRepository repository;

	public List<employee> listAll(){
		return repository.findAll();
	}

	public employee get(Integer id) {
		return repository.findById(id).get();
	}
	
	public void save(employee employee) {
		repository.save(employee);
	}
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}
	
	
	
	
	
	
	
	
	
	
	
}
