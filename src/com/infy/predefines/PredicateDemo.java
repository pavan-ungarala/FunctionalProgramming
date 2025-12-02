package com.infy.predefines;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		//Predicate is a predefined functional interface, it is returning boolean value and taking one input (one method parameter).
		Predicate<String> p1 = (s) -> s.isEmpty();
		Predicate<String> p2 = (s) -> s.isBlank();
		Predicate<Integer> p3 = (n) -> n != 0;
		Predicate<Integer> p4 = (n) -> n > 0;
		
		boolean stringStatus = p1.test("  ");
		boolean stringStatus_asPerJava11 = p2.test("  ");
		boolean zeroCheck = p3.test(22);
		boolean valueCheck = p4.test(-22);
		
		System.out.println(stringStatus);
		System.out.println(stringStatus_asPerJava11);
		System.out.println(zeroCheck);
		System.out.println(valueCheck);

	}

}
