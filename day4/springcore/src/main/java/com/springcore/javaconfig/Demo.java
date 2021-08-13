package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	public static void main(String[] args) {
		
		
		ApplicationContext  context= new AnnotationConfigApplicationContext(JavaConfig.class);
		// java config is used instead of xml file
		
		
		//ApplicationContext  context= new ClassPathXmlApplicationContext("com/springcore/javaconfig/config.xml");
		Student s= context.getBean("Member", Student.class);
		System.out.println(s);
		s.study();
		
		// context.close(); this can be used only when we use classpathxml instead of app context
	}

}
