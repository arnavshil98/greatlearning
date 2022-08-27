package com.gl.week1;

public class A {

	static int p;
	static String str ;
	int i;
	String s;

	public static void name() {
		System.out.println("name of the person is: "+ str);
		
//		 System.out.println("name of the person is: "+ s); 
//		 not possible as static methods will be loaded at the compile time, 
//		when the class is loaded into memory.thus it can only access static variables.
	}
	
	
	public static int area(int l, int b) {
		return l*b;
	}
	
	A() {

		System.out.println("default class A constructor");
	}

	A(int j, String x) {
		this.i = j;
		this.s = x;
		System.out.println(s + " is " + i + " years old.");
	}

	{
		System.out.println("instance block of class A");
	}
	static{
		System.out.println("static block of A");
		p = 18;
		str = "Krishna";
	}

}
