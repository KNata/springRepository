package com.natalia;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main (String[] args) {
		
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
        IStudentService studentService = (IStudentService) context.getBean("studentService");
        ITeacherService teacherService = (ITeacherService) context.getBean("teacherService");
		
        Student firstStudent = new Student();
        firstStudent.setName("Natalia Kiselyk");
        firstStudent.setCourse(3);
        firstStudent.setPib("jkdlsh");
        studentService.addStudent(firstStudent);
        
        
        Teacher theTeacher = new Teacher();
        theTeacher.setTeacherName("Ala Ali");
        theTeacher.setCellphone("7489365333");
        teacherService.addTeacher(theTeacher);
        
        List<Student> studentList = studentService.getAllStudents();
        for (Student stud : studentList) {
        	System.out.println(stud);
        }
        
	}

}
