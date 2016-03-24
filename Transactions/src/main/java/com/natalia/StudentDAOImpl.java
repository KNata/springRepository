package com.natalia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.googlecode.ehcache.annotations.Cacheable;

@Transactional
@Repository
public class StudentDAOImpl implements IStudentDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Student addStudent(Student aStudent) {
		entityManager.persist(aStudent);
		return aStudent;
	}

	@Override
	public Student getStudent(int anId) {
		Student student = entityManager.find(Student.class, anId);
		return student;
	}

	@Override
	@Cacheable(cacheName = "studentCache")
	public Student getCachedStudent(int anid) {
		Student student = entityManager.find(Student.class, anid);
		return student;
	}

	@Override
	public int getNumberOfStudets() {
		return ((Number)entityManager.createNamedQuery(Student.COUNT_ALL).getSingleResult()).intValue();
	}

	@Override
	public List<Student> detAllStudents() {
		return entityManager.createNamedQuery(Student.FIND_ALL).getResultList();
	}

}
