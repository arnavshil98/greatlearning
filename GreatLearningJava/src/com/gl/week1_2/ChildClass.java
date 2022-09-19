package com.gl.week1_2;

public class ChildClass extends ParentClass{

	public ChildClass() {
		System.out.println("child class constructor");
	}
	static {
	System.out.println("static block of child class");	
	}
	{
		System.out.println("instance block of child class");
	}
	
	private void meth1() {
		System.out.println("this is private method of ChildClass");
	}
	public static void main(String[] args) {
		ParentClass obj = new ChildClass(); // upcasting
		/*
		 * can't access meth1()
		 */
	//	ParentClass obj1 = new ParentClass();
		/*
		 * can't access meth1()
		 */
		// ChildClass obj3 = new ChildClass();
		// obj3.meth1();
		
		
	}

}
