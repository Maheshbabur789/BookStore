package com.mahesh.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginServlet extends HttpServlet {
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		
		String un=request.getParameter("myusername");
		String pw=request.getParameter("mypassword");
		
		System.out.println(un);
		System.out.println(pw);
		String msg="";
		if(un.equals(pw))
		{
			msg="Hello"+ un +"!!!";
			msg=msg+"Login Success-Welcome to Vtalent";
			
		}else {
			msg=msg+"Login Failed";
		}
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();	
		out.print(msg);
		
	}
	
	

}
