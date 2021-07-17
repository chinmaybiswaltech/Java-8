package com.java8.practice;

public class ConstructorReferenceExamples {

	public static void main(String[] args) {
		EmployeeGenerator emp = Employee::new;
        Employee obj= emp.createEmployee("Azad");
         System.out.println(obj.getName());
	}

}
