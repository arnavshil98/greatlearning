package com.gl.prework;

public class Main {

	final float pi = 7 / 22;

	float radius = 5, area = 0;

	public void calculateArea() {

		area = pi * radius * radius;

		System.out.println(" Area of circle is: " + area);

	}

	public static void main(String[] args) {

		Main obj = new Main();

		obj.calculateArea();

	}

}
