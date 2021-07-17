package com.java8.practice;

public class LambdaExpressionScopeExample {

	public static void main(String[] args) {
		final int x =1;
		SumFunctionalInterface sum = (a,b)-> a+b+x;
		System.out.println(sum.sumMethod(10, 20));

	}

}
