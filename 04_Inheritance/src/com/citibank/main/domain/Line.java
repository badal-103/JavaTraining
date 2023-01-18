package com.citibank.main.domain;

public class Line extends Shapes {
	public Line() {
		System.out.println("This is a default constructor for Line");
	}
	public Line(int size){
		System.out.println("this is a param constructor for Line");
		System.out.println("Size : " + size);
	}
	@Override
	public void draw() {
		System.out.println("line is drawn");
	}

}
