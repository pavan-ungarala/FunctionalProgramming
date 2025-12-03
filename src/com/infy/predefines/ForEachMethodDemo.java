package com.infy.predefines;

import java.util.ArrayList;
import java.util.List;

import com.infy.entity.Student;

public class ForEachMethodDemo {

	public static void main(String[] args) {
		List<Object> al = new ArrayList<>();
		al.add("a");
		al.add(5);
		al.add("b");
		al.add(6);
		al.add("c");
		al.add(7);
		System.out.println(al);
		
		al.forEach((obj) -> System.out.print(obj+" ")); //normal forEach method usage
		System.out.println();
		al.forEach(System.out::println); //by using method reference in forEach method
		System.out.println();
		
		//perform string operation for the string values in the list
		al.forEach((obj) ->{
			if(obj instanceof String s) {
				System.out.print(s.toUpperCase()+" ");
			}else {
				System.out.print(obj+" ");
			}
		}); //For this kind of requirement method reference is not possible.
		System.out.println();
		System.out.println();
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(101,"Pavan","Microservices",3500.00f));
		students.add(new Student(102,"Hari","Data Science",7500.00f));
		students.add(new Student(101,"Hemanth","UI FullStack",12000.00f));
		
		System.out.println("Entair student objects through for each method");
		students.stream().forEach(System.out::println); //by using method reference
		
		
	}

}
