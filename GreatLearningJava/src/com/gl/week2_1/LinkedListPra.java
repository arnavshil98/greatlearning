package com.gl.week2_1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPra {
	/*
	 * linked list inherits both List and queue.
	 */
	public static void main(String[] args) {
		LinkedList<Integer> linkList = new LinkedList<>();
		linkList.add(12);
		linkList.add(13);
		linkList.add(11);
		linkList.add(11);
		linkList.add(19);
		linkList.add(2, 17);
		linkList.add(null);
		linkList.pollFirst();// removes the first element of the linkedList FIFO due to queue.
		
		linkList.addFirst(18);
		linkList.addLast(36);
		System.out.println("first value if the linkedlist: " + linkList.peek());
		System.out.println(linkList.toString());

		Iterator<Integer> itr = linkList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
