package com.java8.practice;

public class FunctionalInterfaceImpl1 {

	public static void main(String[] args) {
		MyInterface myInterface = new MyInterface() {

			@Override
			public void myMethod() {
				System.out.println("Implementation of Functional Interface in Anonymous Inner class");

			}

		};

		myInterface.myMethod();

		MyInterface myInterfaceLambda = () -> {
			System.out.println("Implementation of Functional Interface as Lambda Expression");
		};

		myInterfaceLambda.myMethod();
	}

}
