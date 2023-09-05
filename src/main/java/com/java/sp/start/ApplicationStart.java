package com.java.sp.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationStart {

	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(com.java.sp.config.SpringHibernateConfiguration.class);
		System.out.println(context);
	}
}
