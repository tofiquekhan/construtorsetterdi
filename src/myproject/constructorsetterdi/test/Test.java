package myproject.constructorsetterdi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import myproject.constructorsetterdi.beans.Student;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/myproject/constructorsetterdi/resources/applicationContext.xml");
		Student student = (Student) context.getBean("studentBean");
		student.getStudentDetails();
	}
}
