package com.gl.week2;

public class SubChildClass extends ChildClass1 {

	public static void main(String[] args) {

		ChildClass1 obj = new SubChildClass();
		System.out.println(obj.brandName);
		System.out.println(obj.licenseNum);
		System.out.println(obj.ChassieNumber);
		obj.owner();
	}

}
