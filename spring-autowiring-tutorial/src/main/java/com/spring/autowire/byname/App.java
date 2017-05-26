package com.spring.autowire.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/autowire/byname/beans/beans.xml");
		
		Logger logger = (Logger)context.getBean("logger");
		/*Logger logger=new Logger();
		logger.setConsoleWriter(new ConsoleWriter());
		logger.setFileWriter(new FileWriter());*/
		logger.writeConsole("Hello there");
		logger.writeFile("Hi again");
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
