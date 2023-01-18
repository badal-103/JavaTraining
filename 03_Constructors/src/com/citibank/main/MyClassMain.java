package com.citibank.main;

import com.citibank.main.domain.MyClass;

public class MyClassMain {

	public static void main(String[] args) {
		System.out.println("Main starts");
		MyClass myclass = new MyClass();
		myclass.show();
		System.out.println("--------------------------");
		//new MyClass();
		new MyClass().show();
		new MyClass(10); //calls the int param constructor based on the argument
		new MyClass("Badal");  //calls the string param constructor based on the argument.
		System.out.println("Main ends");
		
	}

}
