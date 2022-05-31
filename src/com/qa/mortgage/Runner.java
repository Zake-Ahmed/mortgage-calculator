package com.qa.mortgage;

public class Runner {
	public static void main(String[] args) {
		float[] finalValue = MortgageCalculator.calculator();
		System.out.println("=========================");
		System.out.println("Saved values");
		for (int i =0; i<finalValue.length; i++) {
			System.out.println('£' + String.format("%.2f", finalValue[i]));
		}
		
	}
}
