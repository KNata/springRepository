package com.natalia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("teacherService")
public class TeacherService implements ITeacherService {
	
@Autowired
private ITeacherDAO teacherDao;


	@Override
	public Teacher addTeacher(Teacher aTeacher) {
		return teacherDao.addTeacher(aTeacher);
	}

	@Override
	public Teacher getTeacher(int anId) {
		return teacherDao.getTeacher(anId);
	}

	@Override
	public Teacher getCachedTeacher(int anId) {
		return teacherDao.getCachedTeacher(anId);
	}

	@Override
	public int getNumberOfTeachers() {
		return teacherDao.getNumberOfTeachers();
	}

	@Override
	public List<Teacher> getAllTeachers() {
		return teacherDao.detAllTeachers();
	}
}
