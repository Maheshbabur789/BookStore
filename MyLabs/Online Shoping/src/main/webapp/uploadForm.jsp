<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.*, javax.servlet.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Product Upload Form</title>
</head>
<body>
    <h2>Upload Product Details</h2>
    
    <!-- Display error message if any -->
    <%
        String message = (String) session.getAttribute("message");
        if (message != null) {
            out.println("<p style='color: red;'>" + message + "</p>");
            session.removeAttribute("message");
        }
    %>
    
    <form action="fileUploadServlet" method="post" enctype="multipart/form-data">
        <!-- Category Input -->
        <label for="category">Category:</label>
        <input type="text" id="category" name="category" required><br><br>
        
        <!-- Name Input -->
        <label for="name">Product Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        
        <!-- Amazon Price (CGPA) Input -->
        <label for="cgpa">Amazon Price:</label>
        <input type="text" id="cgpa" name="cgpa" required><br><br>
        
        <!-- Flipkart Price (Backlogs) Input -->
        <label for="backlogs">Flipkart Price:</label>
        <input type="text" id="backlogs" name="backlogs" required><br><br>
        
        <!-- Product Description (Skills) Input -->
        <label for="skills">Product Description:</label>
        <textarea id="skills" name="skills" rows="4" cols="50" required></textarea><br><br>
        
        <!-- Resume (File Upload) -->
        <label for="resume">Upload File:</label>
        <input type="file" id="resume" name="resume" required><br><br>
        
        <!-- Submit Button -->
        <input type="submit" value="Submit">
    </form>
</body>
</html>
