	
<!DOCTYPE html>
<%@page import="java.util.*" %>
<html>
<head>
<style>
table{
width:100%;
border:2px solid red;
border-collapse:collapse;
}
tr{
heighgt:50px;
border:2px solid red;
}
td{
border:1px solid red;
border-collapse:collapse;
padding:10px;
}
.orders{
padding:20px;
text-align:right;
}

</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> Welcome to Books Store</h2>
<h3>Your Cart is Here</h3>
<table>
<%
Object obj=session.getAttribute("mycart");
if(obj!=null){
List<String> cartlist=(List<String>)obj;
if(cartlist.isEmpty()){
	%>
	<font color="red" size="5">No Books  in your Cart,Shop Now</font>
	<%
}
int count=1;
for(String bname:cartlist){
	%>
	<tr>
	<td><%= count++ %></td>
	<td><%= bname %></td>
	<td>Rs.350</td>
	<td>10% off</td>
	<td>
	<form action="removecart.mahi">
	<input type="hidden" name="bname" value="<%= bname %>"/>
	<input type="submit" value="Remove From Cart"/>
	</form>
	</td>
	</tr>
	<%
}
}

%>

</table>
<div class="orders">
	
	<h3><a href="showBooks.jsp">Continue Shopping</a></h3>
	<h3><a href="PlaceOrder.mahi">Place Order</a></h3>
	<h3><a href="index.jsp">Search More Books</a></h3>
	</div>
</body>
</html>