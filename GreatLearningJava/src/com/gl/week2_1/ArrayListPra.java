package com.gl.week2_1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPra {

	public static void main(String[] args) {

		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(3);
		arrList.add(41);
		arrList.add(41);
		arrList.add(16);
		arrList.add(11);
		arrList.add(null); // null is allowed
		arrList.add(2, 14);
		ArrayList<Integer> c = new ArrayList<>();
		c.add(17);
		c.add(19);
		c.add(21);
		arrList.addAll(c);
		arrList.remove(0); // index

		// not available linkList.poll();
		// not available linkList.peek();
		System.out.println(arrList.toString());

		Iterator<Integer> itr = arrList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
