package com.example.restfulProjekat.repositories;

import com.example.restfulProjekat.entities.Fudbaler;
import org.springframework.data.repository.CrudRepository;

public interface FudbalerRepository extends CrudRepository<Fudbaler, Integer> {
	
	Fudbaler findByName(String name);

}
