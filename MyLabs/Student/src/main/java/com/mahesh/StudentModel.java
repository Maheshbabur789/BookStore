package com.mahesh;

public class StudentModel {
	private int sid;
	private String sname;
	private int phone;
	private String mail;
	private String city;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

	@Override
	public String toString() {
		return "StudentModel [sid=" + sid + ", sname=" + sname + ", phone=" + phone + ", mail=" + mail + ", city="
				+ city + "]";
	}
}
