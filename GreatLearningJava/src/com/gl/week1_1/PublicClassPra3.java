package com.gl.week1_1;

import com.gl.week1.PublicClassPra;
import com.gl.week1.PublicClassPra2;

public class PublicClassPra3 {
	
	private PublicClassPra2 publicClassPra2;
	
	public PublicClassPra2 getPublicClassPra2() {
		return publicClassPra2;
	}

	public void setPublicClassPra2(PublicClassPra2 publicClassPra2) {
		this.publicClassPra2 = publicClassPra2;
	}
	
	public static void main(String[] args) {
		PublicClassPra publicClass = new PublicClassPra();
		publicClass.meth1();
		// publicClass.meth2();  default hence can't access
		// publicClass.meth4(); protected hence can't access in other package
		/*
		 * can't access publicClass.meth3(); as it is private accessing private data
		 * members using public getters and setters.
		 */

		publicClass.setStr("chao!"); // public method to access private data member
		System.out.println(publicClass.getStr());
		
		/*
		 *PublicClassPra2 is public but to avoid direct access to the class we need
		 *to provide encapsulation. 
		 */
		
		PublicClassPra3 publicClassPra3Obj = new PublicClassPra3();
		PublicClassPra2 publicClassPra2Obj = new PublicClassPra2();
		publicClassPra2Obj.str = "hello!";
		publicClassPra3Obj.setPublicClassPra2(publicClassPra2Obj);
		System.out.println(publicClassPra3Obj.getPublicClassPra2().str);
		
	}


}
