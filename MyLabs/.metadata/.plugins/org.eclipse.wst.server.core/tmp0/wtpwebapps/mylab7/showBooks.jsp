	
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

</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> Welcome to Books Store</h2>
<h3>Books Avialable for ${CAT}</h3>
<table>
<div>
	<form action="showmycart.mahi">
	<input type="submit" value="showmycart"/>
	</form>
	</div>
<%
Object obj=session.getAttribute("BooksList");
if(obj!=null){
List<String> booklist=(List<String>)obj;
int count=1;
for(String bname:booklist){
	%>
	<tr>
	<td><%= count++ %></td>
	<td><%= bname %></td>
	<td>Rs.350</td>
	<td>10% off</td>
	<td>
	<form action="addToCart.mahi">
	<input type="hidden" name="bname" value="<%= bname %>"/>
	<input type="submit" value="Add To Cart"/>
	</form>
	</td>
	</tr>
	<%
}
}

%>

</table>
</body>
</html>