package com.gl.week2;

abstract class ParentClass {
	abstract void company();

	public void topSpeed() {
		System.out.println("speed is 80 kmph");
	}

	public void price() {
		System.out.println("price is 8.00-25.00 L");
	}

	String brandName = "Honda";
	public void printBrand() {
		System.out.println(brandName);
	}	
	
	protected void owner() {
		System.out.println("ram gopal verma");
	}

	protected String licenseNum = "1231DL0457";
	protected String ChassieNumber = "123HonCity965";
}

public class ChildClass1 extends ParentClass {

	private int i;
	
	
	ChildClass1(){
		System.out.println("child class default constructor");
	}
	
	ChildClass1(int i){
		System.out.println("child class default param constructor");
		this.i = i;
	}
	
	String brandName = "Maruti";
	
	@Override
	public void printBrand() {
		System.out.println(brandName);
	}	

	@Override
	void company() {
		System.out.println("honda city");

	}

	@Override
	public void topSpeed() {
		System.out.println("speed is 120 kmph");
	}

	@Override
	protected void owner() {
		System.out.println("raju irani");
	}

	protected String licenseNum = "1131DL0417"; // wrong data insert by RTO office

	public static void main(String[] args) {
		ParentClass obj = new ChildClass1(32); // upcasting
		System.out.println(obj.licenseNum); // data member can't be inherited
		obj.owner(); // protected method can be overridden 
		System.out.println(obj.brandName); // data member can't be inherited
		obj.printBrand(); // methods are overridden
		obj.topSpeed();
		obj.price();  // declared in parent class
		obj.company(); // abstract method must be initialized in non abstract class.
		
		ChildClass1 obj1 = (ChildClass1) obj; // explicit downcasting
		System.out.println("-----------------------------------");
		obj.owner();
		obj.printBrand();
		
		
		
		
	}

}
