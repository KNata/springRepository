package com.Cache.entities;


import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "dishes")
@NamedQueries({
        @NamedQuery(name = Student.FIND_ALL, query = "SELECT student FROM students student"),
        @NamedQuery(name = Student.COUNT_STUDENTS, query = "SELECT count(student) FROM students student"),
})

public class Student {
	
	public static final String FIND_ALL = "findAll";
    public static final String COUNT_STUDENTS = "countStudents";
	
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
