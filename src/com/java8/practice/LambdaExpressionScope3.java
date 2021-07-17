package com.java8.practice;

public class LambdaExpressionScope3 {
	 int i =100;
	static int j = 200;

	public static void main(String[] args) {
		LambdaExpressionScope3 obj = new LambdaExpressionScope3();
		SumFunctionalInterface sum = (a,b)->{
			return a+b+obj.i+j;
		};
		
		System.out.println(sum.sumMethod(10, 20));

	}

}
