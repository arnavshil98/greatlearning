package com.gl.week1_2;

public class ParentClass {

	public ParentClass() {
		System.out.println("parentclass constructor default");
	}

	public ParentClass(String s) {
		System.out.println("parentclass constructor default");
	}

	private void meth1() {
		System.out.println("this is private method of ParentClass");
	}

	static {
		System.out.println("static block of ParentClass");
	}
	{
		System.out.println("instance block of ParentClass");
	}

	public static void main(String[] args) {

	}

}
