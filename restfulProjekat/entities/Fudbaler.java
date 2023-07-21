package com.example.restfulProjekat.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity(name="fudbaler") 
public class Fudbaler {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String birthplace;
	private String number;
	
	@ManyToMany(mappedBy = "fudbaler")
	private Set<Tim> timovi;
	
	public Fudbaler(int id, String name, String birthplace, String number) {
		this.id = id;
		this.name = name;
		this.birthplace = birthplace;
		this.number = number;
	}
	
	public Fudbaler() {
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Fudbaler [id=" + id + ", name=" + name + ", birthplace=" + birthplace + ", number=" + number + "]";
	}
	
}
