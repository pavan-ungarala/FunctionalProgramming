package com.infy.main;

import java.util.Scanner;

import com.infy.expression.CalculationExpressions;
import com.infy.functions.Calculator;

public class CalculatorMain {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CalculationExpressions calc = new CalculationExpressions();
		System.out.println("Welcome to calculator functional interface usease");
		System.out.println("Select your operation: ");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.print("Enter your option: ");
		int opt = scan.nextInt();
		System.out.println("Enter the values");
		System.out.print("number1: ");
		int n1 = scan.nextInt();
		System.out.print("number2: ");
		int n2 = scan.nextInt();
		switch(opt) {
		case 1:
			System.out.println("Addition of these two numbers are: "+ calc.calculate((a,b) -> a+b, n1, n2));
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			System.out.println("Please enter correct option");
		}

	}

}
