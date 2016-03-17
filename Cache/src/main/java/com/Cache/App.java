package com.Cache;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Cache.entities.Student;
import com.Cache.entities.Teacher;
import com.Cache.service.IStudentService;
import com.Cache.service.ITeacherService;

import java.util.Date;
import java.util.List;


public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        IStudentService studService = (IStudentService) context.getBean("studService");
        Student theStudent = new Student("Natalia Kiselyk", 5);
        Student secondStudent = new Student("Vasia Pupkin", 3);
        Student thirldStudent = new Student("Did Panas", 1);
        studService.saveStudentToDB(theStudent);
        studService.saveStudentToDB(secondStudent);
        studService.saveStudentToDB(thirldStudent);
        System.out.println("-----------------");
       
        List<Student> studentList = studService.getStudents();
        for (Student student : studentList) {
        	System.out.println(student);
        }
        System.out.println("-----------------");
        Student studByName = studService.getStudentByName("Natalia Kiselyk");
        System.out.println("-----------------");
        Student studByNameC = studService.getStudentByNameCache("Natalia Kiselyk");
        System.out.println("-----------------");
        Student studById = studService.getStudentById(0);
        System.out.println("-----------------");
        int studCount = studService.getStudentCount();
        System.out.println("count of students " + studCount);

    }
}
