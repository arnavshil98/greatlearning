package com.gl.week2;

public class B extends A {

	String s1 = "Hello Sam";

	public void printname() {
		System.out.println("METHOD OF  B");
		System.out.println(s1);

	}

	@Override
	public void print() {
		System.out.println("print METHOD OF  B");
	}

	public static void main(String[] args) {

		B obj = new B();
		obj.printName(); // as data member is not overridden
		obj.print(); // method is overridden
		System.out.println("---------------------");
		A obj1 = new A();
		obj1.printName(); // no concept of inheritance is required
		obj1.print(); // no concept of inheritance is required
		System.out.println("---------------------");
		A obj2 = new B(); // up casting
		obj2.printName();// as data member is not overridden
		obj2.print();// method is overridden
		System.out.println("---------------------");
		B obj3 = (B) obj2; // down casting
		obj3.printName();
		obj3.print();
		System.out.println("---------------------");
	}

}