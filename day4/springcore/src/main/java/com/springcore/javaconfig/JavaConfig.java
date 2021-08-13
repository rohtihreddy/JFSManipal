package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.springcore.javaconfig")
public class JavaConfig {

	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	@Bean(name= {"Student", "Member","Temp"})
	public Student getStudent() {
		// creating a new student object
		Student std= new Student(getSamosa());
		System.out.println("creating student samosa");
		return std;
		
	}
	
}
