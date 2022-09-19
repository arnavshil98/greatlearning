package com.gl.week2_1;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {

		Integer[] i = { 1, 5, 2, 9, 15, 23, 12, 0 };
		System.out.println("printing original array");
		System.out.println(Arrays.asList(i));
		Arrays.sort(i);
		System.out.println("printing sorted array");
		System.out.println(Arrays.asList(i));

	}

}
