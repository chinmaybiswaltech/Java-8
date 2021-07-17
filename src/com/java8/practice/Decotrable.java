package com.java8.practice;

@FunctionalInterface
public interface Decotrable {

	// Single Abstract Method
	void decorateWithCurtains();

	// default method
	default void decorateWithPaints() {
		System.out.println("Decorating with paints default method");
	}

	// static method
	static void staticMethod() {
		System.out.println("static method in FunctionalInterface");
	}
}
