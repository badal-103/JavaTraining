package com.citibank.main.domain;

public class Circle extends Shapes {
	public Circle() {
		super();
		System.out.println("This is a default constructor of Circle");
		
	}
	public Circle(int size) {
		super(size);
		System.out.println("this is a param constructor for Circle");
		System.out.println("Size : " + size);
	}
//	@Override
//	public void draw() {
//		System.out.println("Drawing Circle");
//		}
	

}

