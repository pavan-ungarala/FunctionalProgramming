package com.infy.predefines;

import java.util.function.Consumer;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		Consumer<String> messageFunction = System.out::println;
		messageFunction.accept("Hello Pavan");
		
		Consumer<Integer> priceFunction = System.out::println;
		priceFunction.accept(74560);
	}

}
