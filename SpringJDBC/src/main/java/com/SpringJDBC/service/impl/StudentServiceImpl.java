package com.home3.service.impl;

import com.home3.dao.IStudentDao;
import com.home3.entities.Student;
import com.home3.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("studService")
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private IStudentDao studentDao;

    public void saveStudentToDB(Student student){
        if ((student != null) && (student.getPib() != null)
                && (!"".equals(student.getPib())) && (student.getCourse() > 0)) {
            studentDao.addStudent(student);
            System.out.println("Student have been saved "+student);
        }
    }


}
