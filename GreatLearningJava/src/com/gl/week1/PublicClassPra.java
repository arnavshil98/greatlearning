package com.gl.week1;

public class PublicClassPra {

	public void meth1() {
		System.out.println("this is public meth1 of PublicClassPra and  com.gl.week1 package");
	}

	void meth2() {
		System.out.println("this is default meth2 of PublicClassPra and  com.gl.week1 package");
	}

	private void meth3() {
		System.out.println("this is private meth3 of PublicClassPra and  com.gl.week1 package");
	}
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public void readStr(String value) {
		System.out.println("the value of private String is:"+ value);
	}

	protected void meth4() {
		System.out.println("this is protected meth4 of PublicClassPra and  com.gl.week1 package");
	}

	public static void main(String[] args) {
		PublicClassPra publicClass = new PublicClassPra();
		publicClass.meth1();
		publicClass.meth2();
		publicClass.meth4();
		String z = "xyz";
		publicClass.readStr(z);
		/*
		 * private data members and methods can be accesses 
		 * only within the class.
		 */
		publicClass.str = "hello";
		System.out.println(publicClass.str);
		publicClass.meth3();
	}


}
