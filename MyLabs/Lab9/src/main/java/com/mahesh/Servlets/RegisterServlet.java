package com.mahesh.Servlets;

import java.io.IOException;
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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register.jsp")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Connection con=null;
	PreparedStatement pt=null;
	RequestDispatcher dispatcher=null;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String Name = request.getParameter("Name"); 
		String Email = request.getParameter("Email"); 
		int Phone =Integer.parseInt(request.getParameter("Phone")); 
		String Gender = request.getParameter("Gender"); 
		String courses1 = request.getParameter("Courses"); 
		
		String Timings = request.getParameter("Timings"); 
		String Remarks = request.getParameter("Remarks"); 
		
		
		
		
		 
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myjdbc?useSSL=false","root","Mahesh456@#");
			pt=con.prepareStatement("insert into registration_data(Name,Email,Phone,Gender,Courses,Timings,Remarks) values(?,?,?,?,?,?,?)");
			 
			    pt.setString(1,Name);
				pt.setString(2,Email);
				pt.setInt(3,Phone);
				pt.setString(4,Gender);
				pt.setString(5, courses1);
				pt.setString(6,Timings);
				pt.setString(71,Remarks);
				
		
				int result=pt.executeUpdate();
				if(result>0) {
					System.out.println("Record Successfully inserted");
				}else {
					System.out.println("Sorry Record Not inserted");
				}
				dispatcher=request.getRequestDispatcher("Register.jsp");
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
