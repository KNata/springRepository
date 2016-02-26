package com.SpringJDBC.dao;

import com.SpringJDBC.entities.Student;

public interface IStudentDao {
	
    void addStudent(Student student);
    Student getStudentById(int id);

}
