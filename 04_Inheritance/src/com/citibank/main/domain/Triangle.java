package com.citibank.main.domain;

public class Triangle extends Shapes {
	public Triangle() {
		System.out.println("This is a default constructor for Trianle");
	}
	public Triangle(int size){
		System.out.println("this is a param constructor for Triangle");
		System.out.println("Size : " + size);
	}
	@Override
	public void draw() {
		System.out.println("Triangle is drawn");
			}

}
