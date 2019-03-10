package com.app.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.bean.Camp;
import com.app.dao.CampDAO;
import com.app.dao.DBConnection;

/**
 * Servlet implementation class Home
 */
@WebServlet("/")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public Connection connection=null;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void init() throws ServletException {
		
		//initialization activity - set up DB connection object
		System.out.println("in init method");
		connection = DBConnection.getConnectionToDatabase();
	}
	
	@Override
	public void destroy() {
		System.out.println("in destroy method");
		
		//clean up activity - close DB connection object
		try {
			connection.close();
		} catch (SQLException e) {
			System.out.println("unable to close connection");
			e.printStackTrace();
		}
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Root points to WebContent
		Connection con = (Connection) getServletContext().getAttribute("dbconnection");
		CampDAO c = new CampDAO(con);
		List<Camp> camps = c.getCamps();
		request.setAttribute("camps", camps);
		request.getRequestDispatcher("/templates/index.jsp").forward(request, response);
	}

}
