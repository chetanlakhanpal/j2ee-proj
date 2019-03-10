package com.app.listener;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.app.dao.DBConnection;

/**
 * Application Lifecycle Listener implementation class ApplicationListener
 *
 */
@WebListener
public class ApplicationListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("in contextDestroyed method");
		Connection connection = (Connection)arg0.getServletContext().getAttribute("dbconnection");
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		String[] protectedRoutes = {"dashboard", "profile", "requests"};
		Connection connection = DBConnection.getConnectionToDatabase();
		arg0.getServletContext().setAttribute("dbconnection", connection);
		arg0.getServletContext().setAttribute("APP_NAME", "/blood-donation");
		arg0.getServletContext().setAttribute("PROTECTED_ROUTES", protectedRoutes);

	}

}
