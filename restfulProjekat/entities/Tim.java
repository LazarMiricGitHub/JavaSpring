package com.example.restfulProjekat.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity(name="tim") 
public class Tim {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String league;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "timfudbaler", 
	joinColumns = @JoinColumn(name = "tim_id", referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name = "fudbaler_id", referencedColumnName = "id"))
	private Set<Fudbaler> fudbaler;
	
	public Tim(int id, String name, String league) {
		this.id = id;
		this.name = name;
		this.league = league;
	}
	
	public Tim() {
		
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
	public String getLeague() {
		return league;
	}
	public void setLeague(String league) {
		this.league = league;
	}

	@Override
	public String toString() {
		return "Tim [id=" + id + ", name=" + name + ", league=" + league + "]";
	}
	
}


