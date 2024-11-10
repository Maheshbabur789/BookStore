<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.io.File, java.io.FileOutputStream, java.io.InputStream, java.sql.Connection, java.sql.PreparedStatement" %>
<%@ page import="javax.servlet.annotation.MultipartConfig, javax.servlet.annotation.WebServlet, javax.servlet.http.HttpServlet, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, javax.servlet.http.Part" %>

<!DOCTYPE html>
<html>
<head>
    <title>Product Upload Form</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f5f5f5;
        }
        .container {
            background-color: #fff;
            border-radius: 10px;
            padding: 20px;
            box-shadow: 0px 0px 10px 0px #ccc;
            max-width: 500px;
            margin: 0 auto;
        }
        h1 {
            text-align: center;
        }
        .btn-primary {
            background-color: #007BFF;
            border: none;
        }
        .btn-primary:hover {
            background-color: #0056b3;
        }
        .form-control {
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        .form-control:focus {
            border-color: #007BFF;
        }
    </style>
</head>
<body>
    <div class="container mt-5">
        <h1>Product Upload Form</h1>
        <form action="ProductUploadServlet" method="post" enctype="multipart/form-data">
            <div class="form-group">
                <label for="category">Category:</label> <em class="text-danger">*</em>
                <select id="category" name="category" class="form-control" required>
                    <option value="">---Select a category---</option>
                    <option value="Clothes and Fashion">Clothes and Fashion</option>
                    <option value="Groceries">Groceries</option>
                    <option value="Gold">Gold</option>
                    <option value="Electronics">Electronics</option>
                    <option value="Sports">Sports</option>
                </select>
            </div>

            <div class="form-group">
                <label for="name">Product Name:</label> <em class="text-danger">*</em>
                <input type="text" class="form-control" id="name" name="name" required>
            </div>
            <div class="form-group">
                <label for="resume">Product Image:</label><em class="text-danger">*</em>
                <input type="file" class="form-control-file" id="resume" name="resume" required>
            </div>

            <div class="form-group">
                <label for="cgpa">Amazon Price:</label><em class="text-danger">*</em>
                <input type="number" class="form-control" id="cgpa" name="cgpa" step="0.01" required>
            </div>

            <div class="form-group">
                <label for="backlogs">Flipkart Price:</label><em class="text-danger">*</em>
                <input type="number" class="form-control" id="backlogs" name="backlogs" required>
            </div>

            <div class="form-group">
                <label for="skills">About Product:</label><em class="text-danger">*</em>
                <textarea class="form-control" id="skills" name="skills" rows="4" required></textarea>
            </div>

            <button type="submit" class="btn btn-primary btn-block">Submit Application</button>
        </form>
    </div>
</body>
</html>
