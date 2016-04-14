package com.sample.methodref;

import java.util.Arrays;
import java.util.List;

/**
 * This class demonstrate the method referencing for 
 * 1 - Constructor
 * 2 - static method.
 * 
 * @author vijitha
 *
 */
public class MethodRef {

	public static void main(String[] args) {
		EmployeeFactory<Employee> empFactory = Employee::new;
		List<Employee> empList = Arrays.asList(empFactory.create(10, "Frank Peter"),
				empFactory.create(8, "John Carpenter"));

		empList.forEach(System.out::println);
	}
}
