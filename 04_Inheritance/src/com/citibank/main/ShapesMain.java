package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Circle;
import com.citibank.main.domain.Line;
import com.citibank.main.domain.Shapes;
import com.citibank.main.domain.Triangle;

public class ShapesMain {

	public static void main(String[] args) {
//		Circle circle = new Circle(10);
//		circle.draw();
//		Shapes shapes = new Circle();
//		shapes.draw();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice = scanner.nextInt();
		Shapes shapes = getShape(choice);
		

	}
	public static Shapes getShape(int choice) {
		if(choice == 1){
			return new Circle();
			
		}
		if(choice == 2){
			Shapes shapes = new Triangle();
			return shapes;
		}
		if(choice == 3) {
			return new Line();
			
		}
		return null;
	}

}
