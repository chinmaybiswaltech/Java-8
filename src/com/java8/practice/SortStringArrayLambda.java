package com.java8.practice;

import java.util.Arrays;

public class SortStringArrayLambda {

	public static void main(String[] args) {
		String[] arr = { "ab", "ef", "cd"};
		
		Arrays.sort(arr, StringArraySort::sortMethod);
		
		System.out.println("Sorted Array is");
		for(String s: arr) {
			System.out.println(s);
		}
	}

}
