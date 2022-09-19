package com.gl.week1_2;

import java.util.Random;

public class MinNumArray {
	   
	public static void main(String[] args) {
		
		int[] a = new int[5];
		Random rm = new Random();
		for (int i = 0; i < 5; i++) {
			a[i] = rm.nextInt();
		}
		for (int f : a) {
			System.out.println("printing the element of array: " + f);
		}
		System.out.println("determining the min value of the array: ");

		// determining the minimum of the array;
		for (int f : a) {
			int k = 0;
			int x = 0;

			while (x < (a.length - 1)) {
				if (f > a[x]) {
					k = 1;
					break;
				}
				x++;
			}

			if (k == 0) {
				System.out.println("min number of the array is: " + f);
				break;
			}

		}
		// code ends here.
		int sum = 0;
		for (int s : a) {
			sum = sum + s;

		}
		System.out.println("sum of all the elements of array: " + sum);
		System.out.println("average of all the elements of array: " + (sum / a.length));
		System.out.println("identity hash map of array: " + a);// 4e25154f hexadecimal value.
	}

}
