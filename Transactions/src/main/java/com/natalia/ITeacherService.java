package com.natalia;

import java.util.List;

public interface ITeacherService {
	
	Teacher addTeacher(Teacher aTeacher);
	Teacher getTeacher(int anId);
	Teacher getCachedTeacher(int anId);
	
	int getNumberOfTeachers();
	List<Teacher> getAllTeachers();


}
