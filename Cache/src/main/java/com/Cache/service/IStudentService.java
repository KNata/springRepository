package com.Cache.service;

import java.util.List;

import com.Cache.entities.Student;

public interface IStudentService {
	
    void saveStudentToDB(Student student);
    Student getStudentById(int anId);
    Student getStudentByName(String aName);
    Student getStudentByNameCache(String aName);
    List<Student> getStudents();
    int getStudentCount();
}
