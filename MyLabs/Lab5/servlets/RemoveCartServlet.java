package com.mahesh.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name="removeCart",urlPatterns="/removecart.mahi")
public class RemoveCartServlet extends HttpServlet {
	

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String bname=request.getParameter("bname");
		System.out.println(bname);
		//Do Procissing
		String page="showBooks.jsp";
		
		HttpSession session=request.getSession();
		List<String> mycart=(List<String>)session.getAttribute("mycart");
		mycart.remove(bname);
		session.setAttribute("mycart", mycart);
		System.out.println(mycart);
		
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
		
		
		
		
		
	}

	

}
