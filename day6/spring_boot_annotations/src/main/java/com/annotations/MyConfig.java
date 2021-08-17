package com.annotations;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = {"mypack"})
public class MyConfig {

	@Bean("student1")
	public Student getStudent() {
		System.out.println("creatin frst student");
		return new Student("student1");
	
	}
	
	@Bean("student2")
	@Lazy
	public Student createStudent() {
		System.out.println("creating second student");
		return new Student("student2");
	
	}
	@Bean
	public Date getDate() {
		System.out.println("create new date");
		return new Date();
	}
}
