package com.gl.prework;

import java.util.Scanner;

public class PalindromeNumbers {

	public static void main(String[] args) {

		/*
		 * 123454321
		 */
		Scanner input = new Scanner(System.in);
		int length = input.nextInt() * 2;
		System.out.println(length);

		StringBuffer number = new StringBuffer("");
		int i = 1;
		int j = 1;
		while (i < length) {

			if (i <= length / 2) {
				number.append(String.valueOf(i));
				System.out.println("number:" + number);

			}

			else {

				number.append(String.valueOf(i - (2 * j)));
				System.out.println("number:" + number);
				j++;
			}
			i++;

		}
		System.out.println("---- result ------");
		System.out.println(number);

	}

}
