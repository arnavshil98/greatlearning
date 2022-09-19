package com.gl.week1;

public class PublicClassPra2 {
	
	public String str = null;
	
	public static void main(String[] args) {
		PublicClassPra publicClass = new PublicClassPra();
		publicClass.meth1();
		publicClass.meth2();
		publicClass.meth4();
		/*
		 * can't access publicClass.meth3(); as it is private accessing private data
		 * members using public getters and setters.
		 */

		publicClass.setStr("chao!");
		System.out.println(publicClass.getStr());
	}

}
