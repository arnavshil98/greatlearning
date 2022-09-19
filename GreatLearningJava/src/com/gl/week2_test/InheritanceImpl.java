package com.gl.week2_test;
abstract class First {
static void m1() {
	System.out.println("hello");
}
    int i;
    public First() {
    	
    }
    public void x(int... i) {
    	
    }
}

class Second extends First {

    int j;

    void display() {

        super.i = j + 1;

        System.out.println(j + " " + i);

    }

}    

public class InheritanceImpl {

    public static void main(String args[]) {

        Second obj = new Second();

        obj.i=1;

        obj.j=2;   

        obj.display();     
    }
    }
