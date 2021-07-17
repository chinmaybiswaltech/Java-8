package com.java8.practice;

public class MethodReferenceStaticImpl {

	public static void main(String... args) {
		CalculatorInterface<Integer, Integer> sumObj = MyInterger::sum;
		System.out.println(sumObj.sumMethod(10, 30));
	}

}
