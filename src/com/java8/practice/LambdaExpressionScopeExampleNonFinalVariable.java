package com.java8.practice;

public class LambdaExpressionScopeExampleNonFinalVariable {

	public static void main(String[] args) {
		int x = 2;
		SumFunctionalInterface sum = (a,b)->{ 
			x =x+1;
			return a+b+x;
			};

	}

}
