package com.springcore;

public class Student {

	private int stdId;
	private String stdName;
	private String stdAddress;

	public Student(int stdId, String stdName, String stdAddress) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdAddress = stdAddress;
	}

	public void setStdId(int stdId) {
		System.out.println("Setting student Id");
		this.stdId = stdId;
	}

	public void setStdName(String stdName) {
		System.out.println("Setting student name");

		this.stdName = stdName;
	}

	public void setStdAddress(String stdAddress) {
		System.out.println("Setting student address");
		this.stdAddress = stdAddress;

	}

	public int getStdId() {
		return stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public String getStdAddress() {
		return stdAddress;
	}

	public Student() {
		super();

	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdAddress=" + stdAddress + "]";
	}

}
