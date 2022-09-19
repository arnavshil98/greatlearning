package com.gl.week1_2;

public class TestMultiArray {

	public static void main(String[] args) {

		int[][] x = { { 1, 3, 6 }, { 2, 4, 7 }, { 5, 8, 9 } };
		int[][] y = { { 2, 4, 7 }, { 1, 4, 9 }, { 2, 5, 7 } };
		int i = 0;
		System.out.println("printing each element of the matrix: x");
		while (i < 3) {
			int j = 0;
			while (j < 3) {
				System.out.println("i:" + i + " " + "j:" + j + " array element: " + x[i][j]);
				j++;
			}
			i++;
		}
		System.out.println("element wise sum of matrix");
		int p = 0;
		while (p < 3) {
			int sum = 0;
			int q = 0;
			while (q < 3) {
				sum = x[p][q] + y[p][q];
				System.out.println("i:" + p + " " + "j:" + q + " array element: " + x[p][q]);
				System.out.println("i:" + p + " " + "j:" + q + " array element: " + y[p][q]);
				System.out.println(sum);
				q++;
			}
			p++;
		}
	}

}
