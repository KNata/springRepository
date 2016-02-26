package com.SpringJDBC.service;

import com.SpringJDBC.entities.Teacher;

public interface ITeacherService {
	
    Teacher addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    void saveTeacher(Teacher teacher);
    
}
