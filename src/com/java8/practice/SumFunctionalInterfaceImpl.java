package com.java8.practice;

public class SumFunctionalInterfaceImpl {

	public static void main(String[] args) {
		SumFunctionalInterface sum = (a,b)-> a+b;
		System.out.println(sum.sumMethod(10, 20));

	}

}
