// Develop a LE to print sum of the fee paid by those returned by 5 student objects.
package com.infy.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import com.infy.entity.Student;

public class SumOfStudentFee {

	public static void main(String[] args) {
		Supplier<List<Student>> studentObjectsFunction = () ->{
			List<Student> studentsList = new ArrayList<>();
			studentsList.add(new Student(101,"Pavan","Microservices",3500.00f));
			studentsList.add(new Student(102,"Hari","Data Science",7500.00f));
			studentsList.add(new Student(101,"Hemanth","UI FullStack",12000.00f));
			studentsList.add(new Student(101,"Chandra","Generative AI",10000.00f));
			studentsList.add(new Student(101,"Anusha","React", 3000.00f));
			return studentsList;
		};
		
		Function<List<Student>, Float> sumOfFeeFunction = (students) -> {
			if(students.size() == 0) {
				throw new ArrayIndexOutOfBoundsException();
			}
			float sum = students.get(0).getFee();
			int size = students.size();
			for(int i=1; i<size; i++) {
				sum += students.get(i).getFee();
			}
			return sum;
		};
		
		List<Student> studentsList = studentObjectsFunction.get();
		float totalFee = sumOfFeeFunction.apply(studentsList);
		System.out.println("Total feese paied by the students are: "+totalFee);
		
	}

}
