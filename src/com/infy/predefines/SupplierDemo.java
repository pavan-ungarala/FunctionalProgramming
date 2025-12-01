package com.infy.predefines;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		//Supplier<R> is a predefined functional interface, it supplies the output and not taking any input (no method parameter).
		Supplier<String> s1 = () -> "Hello";
		Supplier<Double> s2 = () -> 74300.50;
		Supplier<Integer> s3 = () -> 1;
		
		String msg = s1.get();
		double price = s2.get();
		int units = s3.get();
		System.out.println(msg);
		System.out.println("Laptop price: "+price);
		System.out.println("Units: "+units);
	}

}
