package com.citibank.main.domain;

//Generalization 
public abstract class Shapes {
	boolean isSalary;
	public Shapes() {
		System.out.println("This is a default constructor");
	}
	public Shapes(int size) {
		System.out.println("Param constructor for Shapes");
		System.out.println("Size :  " + size);
	}
	public abstract void draw();

}
