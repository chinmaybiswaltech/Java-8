package com.java8.practice;

@FunctionalInterface
public interface CalculatorInterface<A, B> {
	A sumMethod(B val1, B val2);

}
