package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pizza implements InitializingBean,DisposableBean{

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pizza [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Eating pizza: init");
		
	}

	public void destroy() throws Exception {
		System.out.println("done eating pizza: destroy");
		
	}
	
}
