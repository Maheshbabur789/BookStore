package com.mahesh;

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

@WebServlet(name="searchBooks", urlPatterns="/searchBooks.mahi")
public class SearchBooksServlet extends HttpServlet {
	
       
  
	public void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.Collect  InputData
		String cat=request.getParameter("category");	
		System.out.println(cat);
		
		//2.Do Processing
		HttpSession session=request.getSession();
		session.setAttribute("CAT",cat);
		
		//Make Empty Cart Ready
		List<String> mycart1=(List<String>)session.getAttribute("mycart");
		if(mycart1==null) {
		List<String> Mycart=new ArrayList<>();
		session.setAttribute("mycart", mycart1);
		}
		
		List<String> blist=new ArrayList<>();
		String msg="";
		String page="";
		if(cat==null || cat.length()==0) {
			msg="Please Select Category";
			session.setAttribute("MSG", msg);
			page="index.jsp";
		}
			else if(cat.equals("Java")) {
			blist.add("Master Java8");
			blist.add("Master Spring");
			blist.add("Master Hibarnet");
			blist.add("Master SpringBoot");
			blist.add("Master MicroServices");
			blist.add("Master Java8");
			blist.add("Master Spring");
			blist.add("Master Hibarnet");
			blist.add("Master SpringBoot");
			blist.add("Master MicroServices");
			session.setAttribute("BooksList", blist);
			page="showBooks.jsp";
			}
		
		else if(cat.equals("web")) {
			blist.add("Learn JavaScript");
			blist.add("Learn Angular");
			blist.add("Learn React");
			blist.add("Learn Nodejs");
			blist.add("Learn JavaScript");
			blist.add("Learn Angular");
			blist.add("Learn React");
			blist.add("Learn Nodejs");
			session.setAttribute("BooksList", blist);
			page="showBooks.jsp";
		}
		
		else if(cat.equals(".Net	")) {
			blist.add("Master Java8");
			blist.add("Master Spring");
			blist.add("Master Hibarnet");
			blist.add("Master SpringBoot");
			blist.add("Master MicroServices");
			blist.add("Master Java8");
			blist.add("Master Spring");
			blist.add("Master Hibarnet");
			blist.add("Master SpringBoot");
			blist.add("Master MicroServices");
			session.setAttribute("BooksList", blist);
			page="showBooks.jsp";
			}
		
		else if(cat.equals("Python")) {
			msg="Sorry No Books for"+cat;
			session.setAttribute("MSG", msg);
			page="index.jsp";
		
		}
		
		//3.Forward
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
	}
}

			
