package com.app.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.bean.User;
import com.app.dao.AuthenticationDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		if(session.getAttribute("email") != null) {
			response.sendRedirect("dashboard");
			return;
		}
		request.getRequestDispatcher("/templates/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Connection connection = (Connection)getServletContext().getAttribute("dbconnection");

		AuthenticationDAO auth = new AuthenticationDAO(connection);
		User user = auth.authenticateUser(email, password);
		
		HttpSession session = request.getSession();
		session.removeAttribute("error");
		if(user != null) {
			session.setAttribute("user", user);
			response.sendRedirect("dashboard");
		}else {
			session.setAttribute("error", "Invalid Credentials");
			response.sendRedirect("login");
		}
	}

}
