package com.SpringJDBC.dao.impl;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.SpringJDBC.dao.ITeacherDao;
import com.SpringJDBC.entities.Teacher;


@Repository
public class TeacherDaoImpl implements ITeacherDao {
	
    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){
        return sessionFactory.getCurrentSession();
    }
    
    @Transactional
    public void addTeacher(Teacher teacher) {
        currentSession().save(teacher);
    }
    
    @Transactional
    public Teacher getTeacherById(int id) {
        return (Teacher) currentSession().get(Teacher.class, id);
    }
    
    @Transactional
    public void saveTacher(Teacher teacher) {
        currentSession().update(teacher);
    }
}
