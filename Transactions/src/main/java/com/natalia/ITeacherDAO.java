package com.natalia;

import java.util.List;

public interface ITeacherDAO {

	Teacher addTeacher(Teacher aTeacher);
	Teacher getTeacher(int anId);
	Teacher getCachedTeacher(int anid);
	
	int getNumberOfTeachers();
	List<Teacher> detAllTeachers();

}
