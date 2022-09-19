package com.gl.week2_1;

import java.util.ArrayDeque;

public class ArrayDequeue {

	public static void main(String[] args) {

		ArrayDeque<Integer> arrDeq = new ArrayDeque<>();
		arrDeq.add(51);
		arrDeq.addFirst(92);
		arrDeq.add(32);
		// arrDeq.add(null); null not allowed
		ArrayDeque<Integer> arrDeq1 = new ArrayDeque<>();
		arrDeq1.addFirst(12);
		arrDeq1.addLast(67);
		arrDeq1.add(12);
		arrDeq.addAll(arrDeq1);

		System.out.println(arrDeq.toString());
		arrDeq.pollFirst();
		arrDeq.pollLast();
		System.out.println(arrDeq.toString());
	}

}
