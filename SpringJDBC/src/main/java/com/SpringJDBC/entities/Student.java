package com.SpringJDBC.entities;


import javax.persistence.Entity;


public class Student {
	
    private int studentId;
    private String pib;
    private int course;

    
    public Student() {
    }


    public Student(int studentId, String pib, int course) {
        this.studentId = studentId;
        this.pib = pib;
        this.course = course;
    }

    public Student(String pib, int course) {
        this.course = course;
        this.pib = pib;
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
    
   
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", pib='" + pib + '\'' +
                ", course=" + course +
                '}';
    }

   
    public void setCourse(int course) {
        this.course = course;
    }
}
