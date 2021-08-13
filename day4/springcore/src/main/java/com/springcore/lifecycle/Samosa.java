package com.springcore.lifecycle;

public class Samosa {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("set price");
		this.price = price;
	}

	public Samosa() {
		super();
		
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	public void hey() {
		System.out.println("inside init method : hey  ");
	}
	
	public void destroy() {
		System.out.println("inside destroy method: byee");
	}
	
}


