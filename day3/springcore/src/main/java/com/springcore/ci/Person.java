package com.springcore.ci;

public class Person {

	private String name;
	private int personId;
	private Cert certificate;
	public Person(String name, int personId,Cert certificate) {
		this.name = name;
		this.personId = personId;
		this.certificate=certificate;
	}

	@Override
	public String toString() {
		return "Person name is " + name + ", Person Id is " + personId +", "+ certificate.name ;
	}
	
}
