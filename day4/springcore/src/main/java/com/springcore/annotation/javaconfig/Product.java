package com.springcore.annotation.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Product {
 
	//@Autowired
	private Location location;

	
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	
	

	public Product(Location location) {
		super();
		this.location = location;
		System.out.println("in Product constructor");
	}

	
	public Product() {
		super();
	}

	

	@Override
	public String toString() {
		return "product location=" + location;
	}
	
}
