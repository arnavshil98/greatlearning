package com.gl.prework;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		/*
		 * FibonacciSeries: current number = sum of previous 2 numbers. except first 2
		 * numbers are fixed 0,1 (fix)
		 */
		/*
		 * created by arnav
		 */

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> series = new ArrayList<>();
		series.add(0);
		series.add(1);
		int length = input.nextInt();
		int i = 2;
		while (i < length) {
			// 0,1 (fix)

			Integer sumValue = null;
			sumValue = series.get(series.size() - 1) + series.get(series.size() - 2);
			series.add(sumValue);

			i++;
		}
		;
		System.out.println(series);

	}

}
