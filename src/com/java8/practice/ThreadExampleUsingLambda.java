package com.java8.practice;

public class ThreadExampleUsingLambda {

	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread implementation using anonymous class");
			}
		}).start();
		
		new Thread(()->System.out.println("Thread implementation using Lambda")).start();
	}
}
