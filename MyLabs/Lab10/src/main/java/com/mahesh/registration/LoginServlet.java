package com.mahesh.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Connection con=null;
	PreparedStatement pt=null;
	RequestDispatcher dispatcher=null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uemail=request.getParameter("username");
		String upwd=request.getParameter("password");
		
		HttpSession session=request.getSession();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myjdbc?useSSL=false","root","Mahesh456@#");
			 pt=con.prepareStatement("select * from users where uemail=? and upwd=?");
		
			pt.setString(1,uemail);
			pt.setString(2, upwd);
			ResultSet rs=pt.executeQuery();	
			if(rs.next()) {
				session.setAttribute("name", rs.getString("uname"));
				dispatcher=request.getRequestDispatcher("Amazon.jsp"); 
			}else {
				request.setAttribute("status","failed");
				dispatcher=request.getRequestDispatcher("login.jsp");
				
			}
			dispatcher.forward(request, response);
	}catch(Exception e) {
		e.printStackTrace();
	}

	}
}
