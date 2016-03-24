package com.home3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("studService")
public class StudentServiceImpl implements com.SpringJDBC.dao.IStudentDao {
    @Autowired
    private com.SpringJDBC.dao.IStudentDao studentDao;

    public void saveStudentToDB(com.SpringJDBC.entities.Student student){
        if ((student != null) && (student.getPib() != null)
                && (!"".equals(student.getPib())) && (student.getCourse() > 0)) {
            studentDao.addStudent(student);
            System.out.println("Student have been saved "+student);
        }
    }

	@Override
	public void addStudent(com.SpringJDBC.entities.Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public com.SpringJDBC.entities.Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}


}
