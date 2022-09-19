package com.gl.week2_1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ArrayReverse {
	 
	/*
	 * reversing the same array.
	 */
	static void reverse(Integer a[])
	    {
	        Collections.reverse(Arrays.asList(a));
	        System.out.println(Arrays.asList(a));
	    }
	public static void main(String[] args) {

		int[] i = { 1, 5, 2, 9, 15, 23, 12, 0 };
		Integer[] arr = new Integer[i.length];
		/*
		 * assigning reversed values into a new array.
		 */
		int s = 7;
		int f = 0;
		for(int k:i) {
			arr[f] = i[s];
			s--;
			f++;
		}
		
		for(int l: arr) {
			System.out.println(l);
		}
		System.out.println("reversing arr:");
		reverse(arr);
		
		
	}

}
