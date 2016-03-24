package com.natalia;

import java.util.ArrayList;

import javax.persistence.*;

@Entity
@Table(name = "Students")
@NamedQueries({
    //    @NamedQuery(name = Student.FIND_ALL, query = "SELECT student FROM Student student"),
        @NamedQuery(name = Student.COUNT_ALL, query = "SELECT count(student) FROM Student student")
})

public class Student {
	
	 public static final String FIND_ALL = "findAll";
     public static final String COUNT_ALL = "countAll";
		
	@Id
	@GeneratedValue
	@Column(name = "id")
	 private int studentId;
	@Column(name = "name")
	 private String name;
	@Column(name = "pib")
	 private String pib;
	@Column(name = "course")
	 private int course;
	@OneToOne(fetch = FetchType.LAZY)	
	 private ArrayList<Teacher> teacherList;

	 
	 
	 Student() {
		 
	 }
	 
	 Student(String aName, int aStudentId, String aPib, int aCourse) {
		 name = aName;
		 studentId = aStudentId;
		 pib = aPib;
		 course = aCourse;
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + course;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pib == null) ? 0 : pib.hashCode());
		result = prime * result + studentId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (course != other.course)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pib == null) {
			if (other.pib != null)
				return false;
		} else if (!pib.equals(other.pib))
			return false;
		if (studentId != other.studentId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", studentId=" + studentId + ", pib=" + pib + ", course=" + course + "]";
	}
	 
	 
}
