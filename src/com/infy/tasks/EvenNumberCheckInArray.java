/* Develop a LE to take an array of integers 
 * check whether it contains at least one even number,
 * if available it returns true, other wise false
 */
package com.infy.tasks;

import java.util.function.Predicate;

public class EvenNumberCheckInArray {

	public static void main(String[] args) {
		Predicate<int[]> evenCheckFunction = (arr) ->{
			if(arr.length == 0) {
				throw new ArrayIndexOutOfBoundsException();
			}
			int length = arr.length;
			for(int i=0; i<length; i++) {
				if(arr[i]%2 == 0) {
					return true;
				}
			}
			return false;
		};
		Boolean evenCheck = evenCheckFunction.test(new int[] {33,5,21,1,9,10,11,101});
		System.out.println("One even number found in the given array: "+evenCheck);

	}

}
