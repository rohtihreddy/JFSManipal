package com.springcore.annotation.javaconfig;

public class Location {

	private String box;
	private int number;
	public String getBox() {
		return box;
	}
	public void setBox(String box) {
		this.box = box;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Location [box=" + box + ", number=" + number + "]";
	}
	
	
	
	
}
