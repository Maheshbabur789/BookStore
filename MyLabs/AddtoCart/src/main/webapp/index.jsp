<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="AddToCartServlet" method="post">
    <input type="hidden" name="productId" value="101">
    <input type="hidden" name="productName" value="Example Product">
    <input type="hidden" name="quantity" value="1">
    <input type="hidden" name="price" value="499.99">
    <button type="submit">Add to Cart</button>
</form>

</body>
</html>