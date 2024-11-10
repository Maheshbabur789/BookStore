package com.mahesh.servlets;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="login",urlPatterns= {"/mylogin.vtalent"})
public class loginServlet extends HttpServlet {
	 
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		
		String un=request.getParameter("myusername");
		String pw=request.getParameter("mypassword");
	
		String page=""; 
		if(un.equals(pw)) { 
		request.setAttribute("UN", un); 
		page="home.jsp"; 
		}else { 
		String msg="Invalid Username or Password"; 
		request.setAttribute("MSG", msg); 
		page="login.jsp"; 
		} 
		 
		RequestDispatcher rd=request.getRequestDispatcher(page); 
		rd.forward(request, response);  
		
		} 
		
	}
	
	


