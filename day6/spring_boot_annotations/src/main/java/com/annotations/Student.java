package com.annotations;

public class Student {

	String name;
	public Student(String name) {
		super();
		this.name=name;
	}
	public void study() {
		System.out.println(this.name+ " In study mode");
	}
}
