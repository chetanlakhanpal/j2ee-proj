package com.app.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.bean.User;

import java.sql.Connection;

public class AuthenticationDAO {
	
	private Connection connection;
	
	public AuthenticationDAO(Connection connection) {
		this.connection = connection;
	}
	
	public User authenticateUser(String email, String password) {
		User user = null;
		
		String sql = "SELECT * FROM users where email = ? and password  = ?";
		try {
			PreparedStatement statement = this.connection.prepareStatement(sql);
			System.out.print(statement);
			statement.setString(1, email);
			statement.setString(2, password);
			
			ResultSet set = statement.executeQuery();
			while(set.next()) {
				user = new User();
				user.setEmail(set.getString("email"));
				user.setId(set.getInt("id"));
				user.setName(set.getString("name"));
				user.setIs_admin(set.getString("is_admin"));
				user.setContact_no(set.getString("contact_no"));
				user.setDob(set.getString("dob"));
				user.setBloodGroup(set.getString("blood_group"));
//				user.setCreated_at(set.getTimestamp("created_at"));
//				user.setUpdated_at(set.getTimestamp("updated_at"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}	
}
