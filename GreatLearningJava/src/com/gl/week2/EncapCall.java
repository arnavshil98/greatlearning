package com.gl.week2;

public class EncapCall {

	public static void main(String[] args) {
		EncapPra obj = new EncapPra(12, "years");
		obj.display();
		obj.setN(1.3f);
		System.out.println(obj.getN());
	}

}
