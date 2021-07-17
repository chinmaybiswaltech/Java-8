package com.java8.practice;

@FunctionalInterface
public interface EmployeeGenerator {
  
	Employee createEmployee(String name);
}
