package com.app.bean;

public class Match {
	public Match() {
		
	}
	private int donar_id;
	private int recipient_id;
	private String date_time;
	private String place;
	private int compensation;
	private int created_by;
	
	public int getDonar_id() {
		return donar_id;
	}
	public void setDonar_id(int donar_id) {
		this.donar_id = donar_id;
	}
	public int getRecipient_id() {
		return recipient_id;
	}
	public void setRecipient_id(int recipient_id) {
		this.recipient_id = recipient_id;
	}
	public String getDate_time() {
		return date_time;
	}
	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getCompensation() {
		return compensation;
	}
	public void setCompensation(int compensation) {
		this.compensation = compensation;
	}
	public int getCreated_by() {
		return created_by;
	}
	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}
	
	
}
