// Develop a LE to return 5 Student objects
package com.infy.tasks;

import java.util.function.Supplier;

import com.infy.entity.Student;

public class FunctionToReturnStudentObjects {

	public static void main(String[] args) {
		Supplier<Student[]> studentObjectsFunction = () ->{
			return new Student[] {
					new Student(101,"Pavan","Microservices",3500.00f),
					new Student(102,"Hari","Data Science",7500.00f),
					new Student(101,"Hemanth","UI FullStack",12000.00f),
					new Student(101,"Chandra","Generative AI",10000.00f),
					new Student(101,"Anusha","React", 3000.00f)
			};
		};
		Student[] studentsList = studentObjectsFunction.get();
		System.out.println("The list of students data is::::");
		for(Student s: studentsList) {
			System.out.println(s.toString());
		}
	}

}
