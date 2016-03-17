package com.Cache.dao;

import java.util.ArrayList;
import java.util.List;

import com.Cache.entities.Student;

public interface IStudentDao {
	
    void addStudent(Student student);
    Student getStudentById(int id);
    Student getStudentByName(String aName);
    List<Student> getAllStudents();
    int getNumberOfStudents();
    Student getStudentByNameCache(String aName);


}
