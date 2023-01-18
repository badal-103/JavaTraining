package com.citibank.main.domain;

public class MyClass {
	int num1 = 10;
	static int num2 = 10;
	final int max = 500;
	public int num3 = 10;
	public static int num4 = 10;
	public MyClass() {
		// TODO Auto-generated constructor stub
		System.out.println("Def const ");
	}
	public static 
	public void display() {
		System.out.println(num1);
		System.out.println(num2);
		num1 = num1 + 10;
		num2 = num2 + 10;
		//max = max + 100;  //final keyword does not allow u to modify the value.
		System.out.println(num1);
		System.out.println(num2);
		
		
	}

}
