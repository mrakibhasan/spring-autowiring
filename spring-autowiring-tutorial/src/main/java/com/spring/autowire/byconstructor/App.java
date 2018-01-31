package com.spring.autowire.byconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/autowire/byconstructor/beans/beans.xml");
		//some changes
		Logger logger = (Logger)context.getBean("logger");
		
		logger.writeConsole("Hello there");
		logger.writeFile("Hi again");
		logger.writeFile("Hi againzz");
		((ClassPathXmlApplicationContext)context).close();
	}

}
