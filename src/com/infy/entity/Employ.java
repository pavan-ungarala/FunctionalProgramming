package com.infy.entity;

public class Employ {
	private Integer employId;
	private String name;
	private String department;
	private Double salary;
	
	public Employ(Integer employId, String name, String department, Double salary) {
		super();
		this.employId = employId;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public Integer getEmployId() {
		return employId;
	}

	public void setEmployId(Integer employId) {
		this.employId = employId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employe [employId=" + employId + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ "]";
	}	

}
