package com.gl.week2_1;

import java.util.Stack;

public class StackPra {

	public static void main(String[] args) {
		// LIFO
		Stack<Integer> stackObj = new Stack<>();
		stackObj.push(11);
		stackObj.push(1);
		stackObj.push(13);
		stackObj.push(19);
		System.out.println("peek: " + stackObj.peek());
		System.out.println(stackObj.toString());
		System.out.println("pop: " + stackObj.pop());
		System.out.println(stackObj.toString());
		System.out.println("search: "+ stackObj.search(13));
		System.out.println("search: "+ stackObj.search(11));
		System.out.println("search: "+ stackObj.search(14));

	}

}
