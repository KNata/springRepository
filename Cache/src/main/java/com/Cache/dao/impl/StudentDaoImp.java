package com.Cache.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Cache.dao.IStudentDao;
import com.Cache.entities.Student;

@Transactional
@Repository
public class StudentDaoImp implements IStudentDao {
	
    private static final String JPQL_SELECT_STUDENT_BY_ID = "SELECT s FROM students s where s.id = ?1";
    private static final String JPQL_SELECT_STUDENT_BY_NAME = "SELECT s FROM students s where s.pib = ?1";
    
    @PersistenceContext
    private EntityManager entityManager;

    public void addStudent(Student student) {
        entityManager.merge(student);
    }

    public Student getStudentById(int anId) {
    	TypedQuery<Student> query = entityManager.createQuery(
		        JPQL_SELECT_STUDENT_BY_ID, Student.class);
		    return query.setParameter("id", anId).getSingleResult();	
    }
    
   
	@Override
	
	public Student getStudentByName(String aName) {
		 TypedQuery<Student> query = entityManager.createQuery(
			        JPQL_SELECT_STUDENT_BY_NAME, Student.class);
			    return query.setParameter("pib", aName).getSingleResult();			
	}
	
	@Override
    @Cacheable(cacheName = "dishesCache")
    public Student getStudentByNameCache(String aName) {
		Student student = entityManager.find(Student.class, aName);
	        return entityManager.find(Student.class, aName);
    }

	@Override
	public List<Student> getAllStudents() {
		return entityManager.createNamedQuery(Student.FIND_ALL).getResultList();
	}

	@Override
	public int getNumberOfStudents() {
		return ((Number)entityManager.createNamedQuery(Student.COUNT_STUDENTS).getSingleResult()).intValue();
	}
	

 }
