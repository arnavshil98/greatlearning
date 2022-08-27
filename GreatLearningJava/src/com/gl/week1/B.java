package com.gl.week1;

public class B extends A {

	int q;
	int w;

	B() {
		System.out.println("default class B constructor");
	}

	B(int a, int b) {

		System.out.println("parameterized class B constructor");
		this.q = a;
		this.w = b;
	}

	{
		System.out.println("instance block of class B");
	}
	static {
		System.out.println("static block of B");
	}

	public static void main(String[] args) {

		B b = new B(3, 6);
		System.out.println(b.q + b.w);
		System.out.println(A.p * 2);

		A.name();
		System.out.println(A.area(3, 4));

		/*
		 * AInterface.god = "god doesn't exist"; variables declared in interfaces are
		 * static and final.
		 */
		System.out.println(AInterface.god);

	}

}
