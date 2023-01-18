package com.citibank.main;

import com.citibank.main.domain.CalculationsInterface;


public class CalculationsMain {

	public static void main(String[] args) {
		CalculationsInterface calculationsInterface = new CalculationsInterface() {
			
			@Override
			public double DoCalculations(double num1, double num2) {
				// TODO Auto-generated method stub
				return num1 + num2 ;
			}
		};
		
		double result = calculationsInterface.DoCalculations(10, 20);
		System.out.println("Additon :: " + result);
		
		System.out.println("---------------------------------------");
		calculationsInterface = (n1, n2) -> n1+n2;
		System.out.println("Result :: " + calculationsInterface.DoCalculations(10, 20));
		
	}
	

}
