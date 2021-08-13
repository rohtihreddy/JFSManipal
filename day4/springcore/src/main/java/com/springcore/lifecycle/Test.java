package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	AbstractApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/lifecycle/configcycle.xml");
	context.registerShutdownHook();
/*	Samosa s= (Samosa) context.getBean("s1");
	System.out.println(s);
	
	System.out.println("                          ");
	Pizza p1=(Pizza) context.getBean("p1");
	System.out.println(p1);   */
	
	Example e= (Example) context.getBean("e1");
	System.out.println(e);
	}

}
