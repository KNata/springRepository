package com.SpringJDBC.dao;

import com.SpringJDBC.entities.Teacher;

public interface ITeacherDao {
	
    void addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    void saveTacher(Teacher teacher);

}
