package com.cg.em;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeeController {

	@Autowired
	private employeeService service;

	//Retrieval
	@GetMapping("/employees")
	public List<employee> list(){
		return service.listAll();
	}
	
	//Retrieve By Id
	@GetMapping("/employees/{id}")
	public ResponseEntity <employee> get(@PathVariable Integer id){
		try {
			employee employee = service.get(id);
			return new ResponseEntity<employee>(employee,HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<employee>(HttpStatus.NOT_FOUND);
		}
	            }
	
	
	//Create
	@PostMapping("/employees")
	public void add(@RequestBody employee employee) {
		service.save(employee);
	}
	
	//Update
	@PutMapping("/employees/{id}")
	public ResponseEntity<?> update(@RequestBody employee employee,@PathVariable Integer id){
		try {
			employee existemployee = service.get(id);
			service.save(existemployee);
			return new ResponseEntity <> (HttpStatus.OK);
		} 
		catch (Exception e) {
			return new ResponseEntity<> (HttpStatus.NOT_FOUND);
		}
	}
	
	//Delete
	@DeleteMapping("/employees/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
	
	
	
	
}

