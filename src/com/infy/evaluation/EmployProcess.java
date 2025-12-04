package com.infy.evaluation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.infy.entity.Employ;

public class EmployProcess {

	//sorting the employ based on the Salary
	public static List<Employ> sortingEmploysFromHighestSalary(List<Employ> employs){
		List<Employ> empList = employs.stream().sorted(Comparator.comparingDouble(Employ :: getSalary).reversed()).toList();
		return empList;
	}
	
	//sorting the employs based on the highest salary from each department
	public static List<Employ> getHighestPaidEmployFromEachDepartment(List<Employ> employs){
		
		return null;
	}
	
	public static void main(String[] args) {
		List<Employ> employs = new ArrayList<>();
		employs.add(new Employ(101, "Pavan", "Software", 9200000.00));
		employs.add(new Employ(102, "Pinky", "HR", 2200000.00));
		employs.add(new Employ(103, "Hari", "Software", 8475000.10));
		employs.add(new Employ(104, "Hemanth", "Software", 9000000.00));
		employs.add(new Employ(105, "Priya", "IT", 7457200.90));
		employs.add(new Employ(106, "Chetan", "HR", 1894000.77));
		employs.add(new Employ(107, "Chandra", "IT", 3089000.20));
		employs.add(new Employ(108, "Anu", "IT", 4889000.90));
		
		System.out.println("Employs before storing");
		employs.forEach(System.out::println);
		List<Employ> sortedEmploys = sortingEmploysFromHighestSalary(employs);
		System.out.println();
		System.out.println("Employs sorted based on the salaries from highest to lowest salary");
		sortedEmploys.forEach(System.out::println);
		System.out.println();
		
		/*System.out.println("List of employs based on the highest salary in each department");
		List<Employ> highestSalaried = getHighestPaidEmployFromEachDepartment(employs);
		highestSalaried.forEach(System.out::println); */
		

	}

}
