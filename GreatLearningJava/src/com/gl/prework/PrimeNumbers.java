package com.gl.prework;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) throws Exception {

		Scanner divident = new Scanner(System.in);
		int number = divident.nextInt();
		
		int j = 2;
		while(j< number) {
			if(number%j ==0) {
				throw new Exception(number+": "+"this is not prime number");
			}
			
			j++;
		}
		System.out.println(number+": "+"is prime number");
		

	}
}
