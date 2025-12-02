package com.infy.predefines;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		//Function is a predefined functional interface, is it taking one input (one method parameter) and return a value its non-void method
		Function<String, String> f1 = (s) -> "Hello "+s;
		Function<Integer, String> f2 = (order) -> "Order Number "+order+" has been dispatched yesterday";
		Function<Integer, Boolean> f3 = (salary) -> {
			if(salary > 130000) {
				return true;
			}
			return false;
		};
		String wishes = f1.apply("Pavan");
		String message = f2.apply(3611);
		boolean eligible = f3.apply(192000);
		System.out.println(wishes);
		System.out.println(message);
		System.out.println("You are eligible to buy a new home: "+eligible);
	}

}
