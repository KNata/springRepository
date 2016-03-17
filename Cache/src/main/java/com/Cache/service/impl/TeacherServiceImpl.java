package com.Cache.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Cache.dao.ITeacherDao;
import com.Cache.entities.Teacher;
import com.Cache.service.ITeacherService;


@Service("teachersWorker")
public class TeacherServiceImpl implements ITeacherService {
	
    @Autowired
    private ITeacherDao teachersDao;
    
    TeacherServiceImpl() {
    
    }
    
    public Teacher addTeacher(Teacher teacher){
        teachersDao.addTeacher(teacher);
        System.out.println("Teacher has been added "+teacher);
        return teacher;
    }
    
    
    public Teacher getTeacherById(int id){
        return teachersDao.getTeacherById(id);
    }
    
    
    public void saveTeacher(Teacher teacher){
        teachersDao.saveTacher(teacher);
        System.out.println("Teacher has been saved "+teacher);
    }

}
