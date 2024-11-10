package com.nani;



import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

@MultipartConfig(maxFileSize = 16177215) // 16MB file size limit
public class ProductUploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String category = request.getParameter("category");
        String name = request.getParameter("name");
        double amazonPrice = Double.parseDouble(request.getParameter("amazon_price"));
        double flipkartPrice = Double.parseDouble(request.getParameter("flipkart_price"));
        String description = request.getParameter("description");

        InputStream imageInputStream = null;
        Part filePart = request.getPart("image");
        if (filePart != null) {
            imageInputStream = filePart.getInputStream();
        }

        try {
            Connection con = DatabaseConnection.initializeDatabase();
            String sql = "INSERT INTO products (category, name, image, amazon_price, flipkart_price, description) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, category);
            statement.setString(2, name);
            if (imageInputStream != null) {
                statement.setBlob(3, imageInputStream);
            }
            statement.setDouble(4, amazonPrice);
            statement.setDouble(5, flipkartPrice);
            statement.setString(6, description);

            int row = statement.executeUpdate();
            if (row > 0) {
                response.getWriter().println("Product uploaded successfully.");
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
