package com.kafka;

public class Student {

	private String sName;
	private int sId;
	private String sDept;
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsDept() {
		return sDept;
	}
	public void setsDept(String sDept) {
		this.sDept = sDept;
	}
	@Override
	public String toString() {
		return "Student [sName=" + sName + ", sId=" + sId + ", sDept=" + sDept + "]";
	}
	
	
	
	
}
