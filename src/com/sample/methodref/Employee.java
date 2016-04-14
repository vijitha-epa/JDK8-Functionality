package com.sample.methodref;

public class Employee {

	private int id;
	private String name;
	
	Employee(){}
	
	Employee(int id, String name){
		this.id= id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
