package com.app.bean;

import java.sql.Timestamp;

public class User {
	public User() {}
	
	private int id;
	private char is_admin;
	private String name;
	private String email;
	private String contact_no;
	private String dob;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getIs_admin() {
		return is_admin;
	}
	public void setIs_admin(char is_admin) {
		this.is_admin = is_admin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public char getAge() {
		return age;
	}
	public void setAge(char age) {
		this.age = age;
	}
	private char age;
	private Timestamp created_at;
	private Timestamp updated_at;
}
