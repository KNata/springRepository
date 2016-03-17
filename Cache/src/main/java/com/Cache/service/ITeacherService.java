package com.Cache.service;

import com.Cache.entities.Teacher;

public interface ITeacherService {
	
    Teacher addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    void saveTeacher(Teacher teacher);
    
}
