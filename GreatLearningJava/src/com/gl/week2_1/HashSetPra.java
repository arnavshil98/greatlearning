package com.gl.week2_1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPra {

	public static void main(String[] args) {

		HashSet<String> hashObj = new HashSet<>(3,1);
		
		hashObj.add("hi");
		hashObj.add("bonjour");
		hashObj.add("chao");
		hashObj.add("chao");
		hashObj.add("sayanora");
		System.out.println(hashObj.toString());
		Iterator<String> iterator =  hashObj.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			System.out.println(iterator.hashCode());
		}
		
		hashObj.remove("sayanora");
		System.out.println(hashObj.toString());
	}

}
