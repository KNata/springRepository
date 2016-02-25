package com.natalia;

public class Student {
		
	private int studentId;
	private String pib;
	private int course;

	Student (String aPib, int aCourse) {
		pib = aPib;
		course = aCourse;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getPib() {
		return pib;
	}

	public void setPib(String pib) {
		this.pib = pib;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}
}
