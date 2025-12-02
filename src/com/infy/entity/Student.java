package com.infy.entity;

public class Student {
	private Integer studentId;
	private String studentName;
	private String course;
	private Float fee;
	
	public Student(Integer studentId, String studentName, String course, Float fee) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
		this.fee = fee;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Float getFee() {
		return fee;
	}

	public void setFee(Float fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", course=" + course + ", fee="
				+ fee + "]";
	}
	
}
