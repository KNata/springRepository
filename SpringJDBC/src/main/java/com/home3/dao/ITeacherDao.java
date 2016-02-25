package com.home3.dao;

import com.home3.entities.Teacher;


public interface ITeacherDao {
	
    void addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    void saveTacher(Teacher teacher);

}
