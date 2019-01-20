package com.app.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.dao.DBConnection;
import java.sql.Connection;

public class AuthenticationDAO {
	
	public boolean authenticateUser(String email, String password) {
		boolean isValid = false;
		
		Connection connection = DBConnection.getConnectionToDatabase();
		String sql = "SELECT COUNT(*) FROM users where email = ? and password  = ?";
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, email);
			statement.setString(2, password);
			
			ResultSet set = statement.executeQuery();
			while(set.next()) {
				isValid = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return isValid;
	}	
}
