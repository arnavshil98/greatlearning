package com.gl.week3;

public class TestClass {
	public TestClass(int i) {
		System.out.println("parameterized contuctor: "+ i);
	}
	public TestClass() {
		System.out.println("default contuctor");
	}
	
	public static void main(String[] args) {

		TestClass testClass = new TestClass(2); 
		/*
		 * initialize class.
		 * default provided by jvm.
		 */
	}

}
