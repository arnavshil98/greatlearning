package com.gl.week1_1;

import com.gl.week1.PublicClassPra;

public class PublicClassPra4 extends PublicClassPra{
	public static void main(String[] args) {
		PublicClassPra4 obj = new PublicClassPra4();
		obj.meth4();
		// PublicClassPra obj2 = new PublicClassPra4();
//		obj2.meth4(); not possible, protected can be accessed only by
//		instance of child class
		
	}

}
