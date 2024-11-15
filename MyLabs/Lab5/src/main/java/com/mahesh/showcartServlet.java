package com.mahesh;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class showcartServlet
 */
@WebServlet(name="addtocart",urlPatterns="/showmycart.mahi")
public class showcartServlet extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String page="showCart.jsp";
		
		HttpSession session=request.getSession();
		List<String> mycart=(List<String>)session.getAttribute("mycart");
		System.out.println(mycart);
		
		RequestDispatcher rd=request.getRequestDispatcher(page);
		
		rd.forward(request, response);

	}

	

}
