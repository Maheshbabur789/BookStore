package com.mahesh;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddToCartServlet extends HttpServlet {

    
    public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
        // Get product details from the request
        String productId = request.getParameter("productId");
        String productName = request.getParameter("productName");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        double price = Double.parseDouble(request.getParameter("price"));

        // Create a CartItem object
        CartItem newItem = new CartItem(productId, productName, quantity, price);

        // Retrieve the current session
        HttpSession session = request.getSession();

        // Retrieve the cart from the session, or create a new one if it doesn't exist
        List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");
        if (cart == null) {
            cart = new ArrayList<>();
        }

        // Add the new item to the cart
        cart.add(newItem);

        // Update the session attribute
        session.setAttribute("cart", cart);

        // Redirect to cart.jsp to view the cart
        response.sendRedirect("cart.jsp");
    }
}
