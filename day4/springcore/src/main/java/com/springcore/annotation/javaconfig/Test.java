package com.springcore.annotation.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.javaconfig.JavaConfig;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext  context= new AnnotationConfigApplicationContext(JavaConfig2.class);
		//ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation2/autoconfig.xml");
		Product p= context.getBean("Product", Product.class);
		System.out.println(p);

	}

}
