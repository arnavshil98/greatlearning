package com.gl.week2;

public class EncapPra {
	private int i;
	private String s;
private float n;
	public EncapPra(int i, String s) {
		this.i = i;
		this.s = s;
	}
	
	
	public void display() {
		System.out.println("print value: i "+ i+ " s: "+ s);
	}


	public float getN() {
		return n;
	}


	public void setN(float n) {
		this.n = n;
	}
}
