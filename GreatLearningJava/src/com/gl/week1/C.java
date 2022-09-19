package com.gl.week1;

public class C {
	static int i = 0;
	int j = 0;

	C() {
		counter();
	}

	private void counter() {

		i++;
		j++;
		System.out.println("i: " + i);
		System.out.println("j: " + j);
	}

	public static void main(String[] args) {
		/*
		 * class is loaded into the memory once, as JVM reads main method as
		 * application. hence static variable is loaded once and its value gets
		 * manipulated. but instance variable is loaded again and again into memory.
		 * reset due to initialization
		 */
		C c = new C();
		C c1 = new C();
		C c2 = new C();

		System.out.println(c); // hash identity C@7852e922
		System.out.println(c1); // hash identity C@4e25154f
		System.out.println(c2); // hash identity C@70dea4e
		
		
		A.i = 13;
		System.out.println(A.i);
	}

}
