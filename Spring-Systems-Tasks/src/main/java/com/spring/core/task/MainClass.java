package com.spring.core.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application-context.xml");
		System.out.println(applicationContext.getBean("employee",Employee.class));
	}

}
