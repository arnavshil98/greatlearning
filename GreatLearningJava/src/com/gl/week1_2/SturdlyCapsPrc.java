package com.gl.week1_2;

import java.util.ArrayList;
import java.util.Scanner;

public class SturdlyCapsPrc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("please give character inputs");
		// String sentence = sc.next(); this doesn't accept any character after space. hello hi => 5 char
		String sentence = sc.nextLine(); // accept any character after space. hello hi => 8 char
		System.out.println("length of sentence: "+sentence.length());
		
		char[] a = sentence.toCharArray();
		for (char q : a) {
			System.out.println("array element: " + q);
		}
		int i = 0;
		ArrayList<String> sturdlyCaps = new ArrayList<>();
		while (i < a.length) {
			if (i % 2 == 0) {
				String alpha = String.valueOf(a[i]).toUpperCase();
				sturdlyCaps.add(alpha);
			} else {
				String alpha = String.valueOf(a[i]);
				sturdlyCaps.add(alpha);
			}
			i++;
		}
		System.out.println(sturdlyCaps.toString());
		StringBuffer sturdlyCapsSentence = new StringBuffer();

		for (String c : sturdlyCaps) {
			sturdlyCapsSentence.append(c);
		}
		System.out.println("output");
		System.out.println(sturdlyCapsSentence);
	}

}
