package com.gl.week2_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UpdateArray {

	public static void main(String[] args) {

		Integer[] i = { 1, 5, 2, 9, 15, 23, 12, 0 };
		Array.set(i, 2, 6);
		System.out.println(Arrays.asList(i));
	}

}
