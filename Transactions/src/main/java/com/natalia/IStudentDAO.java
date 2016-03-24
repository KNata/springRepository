package com.natalia;

import java.util.List;

public interface IStudentDAO {
	
	Student addStudent(Student aStudent);
	Student getStudent(int anId);
	Student getCachedStudent(int anid);
	
	int getNumberOfStudets();
	List<Student> detAllStudents();

}
