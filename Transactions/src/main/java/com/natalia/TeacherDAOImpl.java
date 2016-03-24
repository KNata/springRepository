package com.natalia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.googlecode.ehcache.annotations.Cacheable;

@Transactional
@Repository

public class TeacherDAOImpl  implements ITeacherDAO {
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Teacher addTeacher(Teacher aTeacher) {
		entityManager.persist(aTeacher);
		return aTeacher;
	}

	@Override
	public Teacher getTeacher(int anId) {
		Teacher teacher = entityManager.find(Teacher.class, anId);
		return teacher;
	}

	@Override
	@Cacheable(cacheName = "teacherCache")
	public Teacher getCachedTeacher(int anid) {
		Teacher teacher = entityManager.find(Teacher.class, anid);
		return teacher;
	}

	@Override
	public int getNumberOfTeachers() {
		return ((Number)entityManager.createNamedQuery(Teacher.COUNT_ALL).getSingleResult()).intValue();
	}

	@Override
	public List<Teacher> detAllTeachers() {
		return entityManager.createNamedQuery(Teacher.FIND_ALL).getResultList();
	}

}
