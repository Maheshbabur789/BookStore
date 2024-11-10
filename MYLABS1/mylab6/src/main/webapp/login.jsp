<!DOCTYPE html> 
<html> 
<body> 
<h2> Welcome to JLC!!!</h2> 
<h3> Login Form</h3> 
<font color="red" size="4">  
<% 
Object obj=request.getAttribute("MSG"); 
if(obj!=null){ 
out.print(obj); 
} 
%> 
</font> 
<form action="mylogin.vtalent" method="post"> 
<table> 
<tr> 
<td> Username </td> 
<td> <input type="text" name="myusername"/> </td> 
</tr> 
<tr> 
<td> Password </td> 
<td> <input type="password" name="mypassword"/> </td> 
</tr> 
<tr> 
<td colspan="2" align="center">  
<input type="submit" value="Login Now"/> </td> 
</tr> 
</table> 
</form> 
</body> 
</html>