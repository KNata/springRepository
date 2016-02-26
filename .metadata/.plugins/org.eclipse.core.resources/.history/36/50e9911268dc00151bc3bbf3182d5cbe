package com.home3;

import com.home3.entities.Student;
import com.home3.entities.Teacher;
import com.home3.service.IStudentService;
import com.home3.service.ITeacherService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;


public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        IStudentService studService = (IStudentService) context.getBean("studService");
        Student theStudent = new Student("Vlad Valt", 5);
        studService.saveStudentToDB(theStudent);
        ITeacherService teacherService = (ITeacherService)context.getBean("teachersWorker");
        Teacher theTeacher = new Teacher();
        theTeacher.setFirstname("Ali");
        theTeacher.setLastname("Baba");
        theTeacher.setCellphone("+380939375");
        theTeacher = teacherService.addTeacher(theTeacher);
        theTeacher.setBirthDate(new Date());
        teacherService.saveTeacher(theTeacher);
    }
}
