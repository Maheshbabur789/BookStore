package com.mahesh.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


 
@WebServlet(name="addToCart",urlPatterns="/addToCart.mahi")
public class AddToCartServlet extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.Collect inputdata
		String bname=request.getParameter("bname");
		System.out.println(bname);
		//2.Procissing
		String page="showBooks.jsp";
		HttpSession session=request.getSession();
		
		List<String>mycart=(List<String>)session.getAttribute("mycart");
		if(mycart==null) {
			mycart=new ArrayList<>();
		}
		mycart.add(bname);
		session.setAttribute("mycart",mycart);
		System.out.println(mycart);
		//3.Forword
		RequestDispatcher rd=request.getRequestDispatcher(page);
	
		rd.forward(request, response);
	}

}
