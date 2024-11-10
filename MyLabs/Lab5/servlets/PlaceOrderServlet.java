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

@WebServlet(name="place order",urlPatterns="/PlaceOrder.mahi")
public class PlaceOrderServlet extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Do Procissing
		String page="PlaceOrder.jsp";
		HttpSession session=request.getSession();
		 session.removeAttribute("mycart");
		 
		 List<String> mycart=new ArrayList<>();
		 session.setAttribute("mycart", mycart);
		
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
		
	}

}
