package com.mahesh;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@WebServlet("/ProductUploadServlet")
@MultipartConfig
public class FileUploadServlet extends HttpServlet {

    private static final String UPLOAD_DIRECTORY = "C:\\Users\\HELLO\\OneDrive\\Documents\\website\\site\\uploads";
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        try {
            String category = testInput(request.getParameter("category"));
            String name = testInput(request.getParameter("name"));
            String amazonPrice = testInput(request.getParameter("cgpa"));
            String flipPrice = testInput(request.getParameter("backlogs"));
            String about = testInput(request.getParameter("skills"));
            
            // Validations
            if (category == null || category.isEmpty()) {
                throw new Exception("Please select a category");
            }
            if (name == null || name.isEmpty()) {
                throw new Exception("Please add the name");
            }
            if (amazonPrice == null || amazonPrice.isEmpty()) {
                throw new Exception("Please select Amazon price");
            }
            if (flipPrice == null || flipPrice.isEmpty()) {
                throw new Exception("Please select Flipkart price");
            }
            if (about == null || about.isEmpty()) {
                throw new Exception("Please describe the product");
            }
            
            // File upload handling
            Part filePart = request.getPart("resume");
            if (filePart == null || filePart.getSubmittedFileName().isEmpty()) {
                throw new Exception("Please upload a file");
            }

            String fileName = filePart.getSubmittedFileName();
            String filePath = UPLOAD_DIRECTORY + fileName;
            File file = new File(filePath);
            filePart.write(filePath);
            
            // Database connection and insertion
            try (Connection conn = getDatabaseConnection()) {
                String sql = "INSERT INTO product_master_upload(vCategory, vProductName, vAmazonePrice, vFlipkardPrice, tDiscription, vPhotoName, tPhotoPath) " +
                             "VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, category);
                stmt.setString(2, name);
                stmt.setString(3, amazonPrice);
                stmt.setString(4, flipPrice);
                stmt.setString(5, about);
                stmt.setString(6, fileName);
                stmt.setString(7, filePath);
                
                int rowsAffected = stmt.executeUpdate();
                
                if (rowsAffected <= 0) {
                    throw new Exception("Unable to insert the data");
                }
                
                // Redirect to success page
                response.sendRedirect("insert_data_form.jsp");
            }
        } catch (Exception e) {
            // Handle errors
            session.setAttribute("message", e.getMessage());
            response.sendRedirect("insert_data_form.jsp?message=" + e.getMessage());
        }
    }
    
    private String testInput(String data) {
        if (data == null) return "";
        return data.trim().replaceAll("<", "&lt;").replaceAll(">", "&gt;");
    }

    private Connection getDatabaseConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/aboutstudent?useSSL=true&requireSSL=true&verifyServerCertificate=true";
        String username = "root";
        String password = "Mahesh456@#";
        return DriverManager.getConnection(url, username, password);
    }
}
