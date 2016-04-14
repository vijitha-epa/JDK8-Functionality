package com.sample.methodref;

public interface EmployeeFactory<e extends Employee>{
	
	e create(int id, String name);

}
