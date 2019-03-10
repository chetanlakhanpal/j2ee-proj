package com.app.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.app.bean.Camp;

public class CampDAO {
	private Connection connection;
	
	public CampDAO(Connection connection) {
		this.connection = connection;
	}
	
	public List<Camp> getCamps() {
		Camp camp = null;
		List<Camp> camps = new ArrayList<>();
		String sql = "SELECT * FROM `camps` WHERE date >= CURRENT_DATE()";
		
		try(Statement stmt = this.connection.createStatement();
			ResultSet r = stmt.executeQuery(sql)){	
			while(r.next()) {
				camp = new Camp();
				camp.setId(r.getInt("id"));
				camp.setVenue(r.getString("venue"));
				camp.setEmail(r.getString("email"));
				camp.setEstimatedDonations(r.getShort("estimated_donations"));
				camp.setDate(r.getDate("date"));
				camp.setCreated_at(r.getTimestamp("created_at"));
				camp.setCity(r.getString("city"));
				camp.setMobile_no(r.getString("mobile_no"));
				camps.add(camp);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return camps;

	}
}
