package com.natalia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentService implements IStudentService {
	
	@Autowired
	private IStudentDAO studentDao;

	@Override
	public Student addStudent(Student aStudent) {
		return studentDao.addStudent(aStudent);
	}

	@Override
	public Student getStudent(int anId) {
		return studentDao.getStudent(anId);
	}

	@Override
	public Student getCachedStudent(int anId) {
		return studentDao.getCachedStudent(anId);
	}

	@Override
	public int getNumberOfStudents() {
		return studentDao.getNumberOfStudets();
	}

	@Override
	public List<Student> getAllStudents() {
		return studentDao.detAllStudents();
	}

}
