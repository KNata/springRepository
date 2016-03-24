package com.natalia;

import java.util.List;

public interface IStudentService {
	
	Student addStudent(Student aStudent);
	Student getStudent(int anId);
	Student getCachedStudent(int anId);
	
	int getNumberOfStudents();
	List<Student> getAllStudents();

}
