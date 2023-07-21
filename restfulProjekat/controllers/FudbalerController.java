package com.example.restfulProjekat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restfulProjekat.entities.Fudbaler;
import com.example.restfulProjekat.repositories.FudbalerRepository;

@RestController
public class FudbalerController {
	
		@Autowired
		private FudbalerRepository repository;

		//GET localhost:8080/fudbaleri
		@GetMapping("/fudbaleri")
		public List<Fudbaler> getAll(){
			return (List<Fudbaler>) repository.findAll();
		}
		
		//GET localhost:8080/fudbaleri/1
		@GetMapping("/fudbaleri/{id}")
		public Fudbaler getFudbaler(@PathVariable int id){
			return repository.findById(id).orElse(null);
		}
		
		//GET localhost:8080/fudbaleri/1
		@GetMapping("/fudbaleri/search/{name}")
		public Fudbaler getName(@PathVariable String name){
			return repository.findByName(name);
		}
		
		//POST 
		@PostMapping("/fudbaleri")
		public Fudbaler create(@RequestBody Fudbaler fudbaler) {
			return repository.save(fudbaler);
		}
		
		//POST 
		@PostMapping("/fudbaleri/{id}")
		public Fudbaler update(@PathVariable int id, @RequestBody Fudbaler fudbaler) {
			return repository.save(fudbaler);
		}
		
		//DELETE
		@DeleteMapping("/fudbaleri/{id}")
		public void deleteOne(@PathVariable int id) {
			repository.deleteById(id);
		}
		
		//GET localhost:8080/fudbaleri/count
		@GetMapping("/fudbaleri/count")
		public long countFudbalere(){
			return repository.count();
		}
}
