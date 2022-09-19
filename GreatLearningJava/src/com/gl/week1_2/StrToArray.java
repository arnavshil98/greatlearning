package com.gl.week1_2;

public class StrToArray {

	public static void main(String[] args) {

		String str = "halloween";
		 // it can't take non primitive data type.
		// however manipulation of array needs wrapper class.
		
		/*
		 * using standard .toCharArr() method.
		 */
		char [] s = str.toCharArray();
		for(char a:s) {
			System.out.println(a);
		}
		
		/*
		 * using conventional method.
		 */
		char [] chArr = new char[str.length()];
		for(int k = 0; k<str.length();k++) {
			chArr[k] = str.charAt(k);
		}
		
		for(char l:chArr) {
			System.out.println("the character is: "+l);
		}
		
		char[] f = {'g','o','o','d'};
		// String is immutable. hence, use StringBuffer.
		StringBuffer strBuff = new StringBuffer();
		int i =0;
		while(i<f.length) {
			strBuff.append(f[i]);
			i++;
		}
		
		System.out.println(strBuff);
	}

}
