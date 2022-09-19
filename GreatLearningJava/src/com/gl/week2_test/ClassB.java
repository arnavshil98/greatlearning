package com.gl.week2_test;

class ClassA {

	ClassA(int x) {

		System.out.print(" Constructor called " + x);

	}

}

// This class contains an instance of ClassA

class ClassB {

	ClassA obj1 = new ClassA(10);

	ClassB(int i) {
		obj1 = new ClassA(i);
	}

	public static void main(String[] args) {

		ClassB obj2 = new ClassB(5);

	}

}
