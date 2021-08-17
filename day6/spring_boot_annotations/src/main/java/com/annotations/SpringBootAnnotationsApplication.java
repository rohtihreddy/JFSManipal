package com.annotations;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.annotations.mypack.Manager;

@SpringBootApplication
public class SpringBootAnnotationsApplication implements CommandLineRunner{

	@Autowired
	@Qualifier("student2")
	private Student student;
	
	@Autowired
	private Date date;
	
	@Autowired
	private Employee emp;
	
	@Autowired
	private Manager manager;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAnnotationsApplication.class, args);
	}
	
	@Override
	public void run(String...args)throws Exception {
		this.student.study();
		this.emp.yourName();
		this.manager.speak();
	}
	
	

}
