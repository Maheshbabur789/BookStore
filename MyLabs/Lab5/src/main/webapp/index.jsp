<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<h2>Welcome to Book Store</h2>
<font color="red" size="5">${MSG}</font>
<form action="searchBooks.mahi">
<table>
<tr>
<td>Select Category</td>
</tr>
<tr>
<td>
<select class="cat" name="category">
<option value="">------Select Category--------</option>
<option value="Java">Java Programming</option>
<option value="Python">Python Programming</option>
<option value="web">Web Development</option>
<option value=".Net">.Net Programming</option>
</select>
</td>
</tr>
<tr>
<td><input type="Submit" value= "Search Books"/></td> 
</tr>
</table>
</form>
</body>
</html>