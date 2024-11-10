package com.mahesh.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		
		
		
		String sn=request.getParameter("sname");
		System.out.println(sn);
		
		String msg="Hello" +sn+"!!!";
		msg=msg+"Welcome to vtalent";
		
		PrintWriter out=response.getWriter();
		
		out.print(msg);
		
		
	}

}
