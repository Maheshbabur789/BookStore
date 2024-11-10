<%@ page import="java.util.List" %>
<%@ page import="com.mahesh.CartItem" %>

<%
    List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");
    if (cart == null) {
        out.println("<h2>Your cart is empty!</h2>");
    } else {
%>
        <h2>Your Shopping Cart</h2>
        <table border="1">
            <tr>
                <th>Product ID</th>
                <th>Product Name</th>
                <th>Quantity</th>
                <th>Price</th>
            </tr>
            <%
                for (CartItem item : cart) {
            %>
                <tr>
                    <td><%= item.getProductId() %></td>
                    <td><%= item.getProductName() %></td>
                    <td><%= item.getQuantity() %></td>
                    <td><%= item.getPrice() %></td>
                </tr>
            <%
                }
            %>
        </table>
<%
    }
%>
