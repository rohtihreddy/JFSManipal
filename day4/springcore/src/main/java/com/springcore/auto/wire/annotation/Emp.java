package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
 
	@Autowired
	@Qualifier("address1")
	private Address address;

	public Address getAddress() {
		return address;
	}

	//@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp() {
		super();
	}

	//@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("using constructor");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
}
