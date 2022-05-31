package com.qa.mortgage;

import java.util.Scanner;

public class MortgageCalculator {
	public static float[] calculator(){
		try (Scanner scanner = new Scanner(System.in)) {;;;;
			System.out.print("Insert yearly intrest rate as a percentage: ");
			float yearlyIntrestRate = scanner.nextFloat()/100f;
			System.out.print("Insert loan ammount in £:");
			float loan = scanner.nextFloat();
			System.out.print("Insert Duration in years:");
			int years = scanner.nextInt();
			int months = 12;
			int n= months * years;
			float r = yearlyIntrestRate / months;
			float top=(float) Math.pow((1+r), n);
			float m= loan*(r*top/(top-1));
			System.out.println("Your monthly playment will be £" + String.format("%.2f", Math.round(m * 100.00) / 100.00f));
			float total= m*n;
			System.out.println("Your total payment is £" + String.format("%.2f", Math.round(total * 100.00) / 100.00f));
			System.out.println("Profit made from intrest is £" + String.format("%.2f", (Math.round((total-loan) * 100.00) / 100.00f)));
			float [] result = new float[3];
			result[0]=Math.round(m * 100.00) / 100.00f;
			result[1]=Math.round(total * 100.00) / 100.00f;
			result[2]=Math.round((total-loan) * 100.00) / 100.00f;
			return result;
		}
	}
	

}

