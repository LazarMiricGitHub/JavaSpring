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
import com.example.restfulProjekat.entities.Tim;
import com.example.restfulProjekat.repositories.TimRepository;

@RestController
public class TimController {

	@Autowired
	private TimRepository repository;

	//GET localhost:8080/timovi
	@GetMapping("/timovi")
	public List<Tim> getAll(){
		return (List<Tim>) repository.findAll();
	}
	
	//GET localhost:8080/timovi/1
	@GetMapping("/timovi/{id}")
	public Tim getTim(@PathVariable int id){
		return repository.findById(id).orElse(null);
	}
	
	//POST 
	@PostMapping("/timovi")
	public Tim create(@RequestBody Tim tim) {
		return repository.save(tim);
	}
	
	//POST 
	@PostMapping("/timovi/{id}")
	public Tim update(@PathVariable int id, @RequestBody Tim tim) {
		return repository.save(tim);
	}
	
	//DELETE
	@DeleteMapping("/timovi/{id}")
	public void deleteOne(@PathVariable int id) {
		repository.deleteById(id);
	}
	
	//GET localhost:8080/timovi/count
	@GetMapping("/timovi/count")
	public long countTimove(){
		return repository.count();
	}
	
	//Dohvatanje tima u kojem igra fudbaler
	@GetMapping("/timfudbaler")
	public List<Tim> catchTeamWithPlayer(@RequestBody Fudbaler fudbaler){
		return repository.findAllTimByFudbaler(fudbaler);
	}
}
