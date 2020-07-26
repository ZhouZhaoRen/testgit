package com.zzr.spring01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// Student student = (Student) applicationContext.getBean("student");
		// System.out.println(student.toString());

	}

}
