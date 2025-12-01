package com.infy.predefines;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		//Consumer<T> is a predefined functional interface, it consumes input (one parameter) and non-return abstract method(void method).
		//accept() is the abstract method in Consumer functional interface.
		Consumer<String> c1 = (s) -> System.out.println(s);
		Consumer<Double> c2 = (cost) -> System.out.println(cost);
		Consumer<Integer> c3 = (items) -> System.out.println(items);
		c1.accept("Pavan");
		c2.accept(3374500.00);
		c3.accept(55);

	}

}
