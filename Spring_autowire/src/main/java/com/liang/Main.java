package com.liang;

import com.liang.pojo.person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		person person = (com.liang.pojo.person) context.getBean("person");
		System.out.println(person.toString());
		person.getCat().show();
		person.getDog().show();
	}
}