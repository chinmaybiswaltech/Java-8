package com.java8.practice;

public class MethodRefLambdaTest {

	public static void main(String[] args) {

		MyIntegerInstanceMethodRef obj = new MyIntegerInstanceMethodRef();
		CalculatorInterface<Integer, Integer> abc = obj::sumMethod;
		System.out.println(abc.sumMethod(10, 29));

	}

}
