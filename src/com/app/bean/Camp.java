package com.app.bean;

import java.sql.Timestamp;
import java.util.Date;

public class Camp {
	public Camp() {
		
	}
	
	private int id;
	private String venue;
	private String email;
	private String mobile_no;
	private String city;
	private short estimatedDonations;
	private Date date;
	private Timestamp created_at;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public short getEstimatedDonations() {
		return estimatedDonations;
	}
	public void setEstimatedDonations(short estimatedDonations) {
		this.estimatedDonations = estimatedDonations;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Timestamp getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}
}
