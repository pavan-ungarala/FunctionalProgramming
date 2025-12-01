//Develop a LE to take an array of integers add all those integers and return sum.
package com.infy.tasks;

import java.util.function.Function;

public class SumOfIntegers {
	
	public static int sumOfArrayElements(int[] arr) {
		Function<int[], Integer> additionFunction = (ar) -> {
			if(ar.length == 0) {
				throw new ArrayIndexOutOfBoundsException();
			}
			int sum = ar[0];
			int length = ar.length;
			for(int i=1; i<length; i++){
				sum += ar[i];
			}
			return sum;
		};
		int sum = additionFunction.apply(arr);
		return sum;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {15,22,10,17,55};
		System.out.println("Sum of the array elements: "+sumOfArrayElements(arr));
	}

}
