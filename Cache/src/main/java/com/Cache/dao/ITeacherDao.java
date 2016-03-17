package com.Cache.dao;

import com.Cache.entities.Teacher;

public interface ITeacherDao {
	
    void addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    void saveTacher(Teacher teacher);

}
