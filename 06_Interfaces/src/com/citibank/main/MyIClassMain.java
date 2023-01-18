package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.MyClass;
import com.citibank.main.domain.MyInterface;
import com.citibank.main.factory.MyFactory;

public class MyIClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main start");
		
		
		MyClass myClass = new MyClass();
		myClass.show();
		System.out.println("--------------------------");
		MyInterface myInterface = new MyClass();
		myInterface.show();
		System.out.println("--------------------------");
		System.out.println(MyInterface.message);
		System.out.println(MyClass.message);
		System.out.println("--------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. MyClass object ");
		System.out.println("2. YourClass object ");
		System.out.println("Entter your choice ");
		int choice = scanner.nextInt();
		MyInterface myInterface1 = MyFactory.getObject(choice);
		
		if(myInterface1 != null)
			myInterface1.show();
		else
			System.out.println("Invalid choice");
		
		
		
		
		
		System.out.println("Main end");

	}

}
