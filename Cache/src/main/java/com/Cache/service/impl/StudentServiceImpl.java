package com.Cache.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Cache.dao.IStudentDao;
import com.Cache.entities.Student;
import com.Cache.entities.Teacher;
import com.Cache.service.IStudentService;


@Service("studService")
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private IStudentDao studentDao;

    public void saveStudentToDB(Student student){
       studentDao.addStudent(student);
    }

	@Override
	public Student getStudentByName(String aName) {
		return studentDao.getStudentByName(aName);
	}

	public Student getStudentByNameCache(String aName) {
		return studentDao.getStudentByNameCache(aName);
	}
	
	@Override
	public List<Student> getStudents() {
		return studentDao.getAllStudents();
	}

	@Override
	public int getStudentCount() {
		return studentDao.getNumberOfStudents();
	}

	@Override
	public Student getStudentById(int anId) {
		return studentDao.getStudentById(anId);
	}

}
