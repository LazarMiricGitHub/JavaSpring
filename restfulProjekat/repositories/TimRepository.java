package com.example.restfulProjekat.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.restfulProjekat.entities.Fudbaler;
import com.example.restfulProjekat.entities.Tim;

public interface TimRepository extends CrudRepository<Tim, Integer>{

	List<Tim> findAllTimByFudbaler(Fudbaler fudbaler);
}
