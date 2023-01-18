package com.liang;

import com.liang.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student = (Student) context.getBean("student");
		Student student1 = (Student) context.getBean("student");
		System.out.println(student == student1);
	}
}