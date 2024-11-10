package com.mahesh.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	
	Connection con=null;
	PreparedStatement pt=null;
	RequestDispatcher dispatcher=null;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("name");
		String upwd=request.getParameter("password");
		String uemail=request.getParameter("email");
		String umobileno=request.getParameter("contact");
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myjdbc?useSSL=false","root","Mahesh456@#");
			 pt=con.prepareStatement("insert into users(uname,upwd,uemail,umobileno) values(?,?,?,?)");
			
			pt.setString(1,uname);
			pt.setString(2,upwd);
			pt.setString(3,uemail);
			pt.setString(4,umobileno);
			
			int rowCount=pt.executeUpdate();
			
			dispatcher=request.getRequestDispatcher("registration.jsp");
			if(rowCount>0)
			{
				request.setAttribute("status","success");
			}else {
				request.setAttribute("status","Failed");
			}
			dispatcher.forward(request, response);
			
	}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
			con.close();
			pt.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		}
	}
}

