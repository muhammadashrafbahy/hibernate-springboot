package com.example.demo;

import javax.persistence.*;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
public class entity {

	private int id ;
	private String name;
	private int age ;
	
	
	public entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public entity(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
