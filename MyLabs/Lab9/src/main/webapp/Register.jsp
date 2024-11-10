<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Welcome to java Learning Center</h2>
<h3> Registration  Form</h3> 
 
<form action="register.jsp" method="post"> 
 
<table> 
<tr> 
<td> Full Name </td> 
<td> <input type="text" name="Name"/> </td> 
</tr> 
<tr> 
<td> Email</td> 
<td> <input type="text" name="Email"/> </td> 
</tr> 
<tr> 
<td> Phone</td> 
<td> <input type="text" name="Phone"/> </td> 
</tr> 
<tr> 
<td> Gender</td> 
<td>  
<input type="radio" name="Gender" value="Male"/> Male <br/>  
 <input type="radio" name="Gender"  value="Female"/> Female  
</td> 
</tr>
<tr> 
<td> Courses</td> 
<td>  
<input type="checkbox" name="Courses" value="Java Developer"/> Java Developer 
Course <br/>  
<input type="checkbox" name="Courses"  value="Angular"/> Angular Course <br/> 
<input type="checkbox" name="Courses"  value="React"/> React Course  <br/> 
<input type="checkbox" name="Courses"  value="Spring Boot and MS"/> Spring Boot and 
MS Course <br/>  
<input type="checkbox" name="Courses"  value="DevOps"/> DevOps Course <br/>   
</td> 
</tr> 
<tr> 
<td> Timings </td> 
<td>  
<select name="Timings"> 
<option value=""> --- Select --- </option> 
<option value=" 4.00P.M to 6.00P.M"> 4.00P.M to 6.00P.M </option> 
<option value="6.00P.M to 8.00P.M"> 6.00P.M to 8.00P.M </option> 
<option value="8.00P.M to 10.00P.M"> 8.00P.M to 10.00P.M</option> 
</select>  
</td> 
</tr> 
<tr> 
<td> Remarks</td> 
<td>  
<textarea name="Remarks" rows="5" cols="25"> </textarea> 
</td> 
</tr> 
<tr> 
<td colspan="2" align="center">  
<input type="submit" value="Register Now"/> </td> 
</tr> 
 
</table> 
</form>

</body>
</body>
</html>