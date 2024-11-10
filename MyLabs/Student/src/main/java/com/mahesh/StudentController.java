package com.mahesh;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int sid=Integer.parseInt(request.getParameter("sid"));
		String sname=request.getParameter("sname");
		int phone=Integer.parseInt(request.getParameter("phone"));
		String mail=request.getParameter("mail");
		String city=request.getParameter("city");
		
		StudentModel sm=new StudentModel();
		
		sm.setSid(sid);
		sm.setSname(sname);
		sm.setPhone(phone);
		sm.setMail(mail);
		sm.setCity(city);
		
		
		
		
		 
		
		
		
	}
	


}
