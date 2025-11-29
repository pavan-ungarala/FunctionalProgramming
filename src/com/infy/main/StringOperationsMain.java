package com.infy.main;

import com.infy.functions.StringFunctions;

public class StringOperationsMain {

	public static void main(String[] args) {
		StringFunctions f1 = (String s) -> System.out.println(s.length());
		StringFunctions f2 = (String s) -> System.out.println(s.toUpperCase());
		StringFunctions f3 = (String s) -> System.out.println(s.toLowerCase());
		StringFunctions f4 = (String s) -> System.out.println(s.substring(1));
		StringFunctions f5 = (String s) -> {
									String currentString = "Hi...";
									System.out.println(currentString + s);
								};
		f1.stringOperatios("Pavan");
		f2.stringOperatios("pavan");
		f3.stringOperatios("PAVAN");
		f4.stringOperatios("Pavan");
		f5.stringOperatios("Pavan");
	}

}
