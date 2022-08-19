package com.gl.prework;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		StringBuffer pattern = new StringBuffer("");
		int i = input.nextInt();
		while (1 <= i) {
			int j = 1;
			StringBuffer str = new StringBuffer("");
			while (j <= i) {
				str.append("*");
				j++;
			}
			System.out.println(str);
			i--;
		}

	}

}
