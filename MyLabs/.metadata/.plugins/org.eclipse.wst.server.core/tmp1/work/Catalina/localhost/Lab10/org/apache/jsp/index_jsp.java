/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.94
 * Generated at: 2024-11-09 10:01:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;


 if(session.getAttribute("name")==null){
	 response.sendRedirect("Amazon.jsp");
 }
 
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<title>Easy Market - Online Shopping</title>\n");
      out.write(" <link rel=\"stylesheet\" href=\"styles.css\">\n");
      out.write("<style>\n");
      out.write("header {\n");
      out.write("    background-color: #ff6600; /* Change this color to your desired header background color */\n");
      out.write("    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("nav {\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: space-between;\n");
      out.write("    align-items: center;\n");
      out.write("    padding: 20px 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav ul {\n");
      out.write("	\n");
      out.write("    list-style: none;\n");
      out.write("    display: flex;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav li {\n");
      out.write("    margin-right: 40px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav a {\n");
      out.write("    text-decoration: none;\n");
      out.write("    color: #333;\n");
      out.write("    font-weight: bold;\n");
      out.write("}\n");
      out.write("/* Product Container */\n");
      out.write(".product-container {\n");
      out.write("    display: flex;\n");
      out.write("    flex-wrap: wrap;\n");
      out.write("    justify-content: space-between; /* This makes space between cards */\n");
      out.write("    gap: 20px; /* This adds a consistent gap between product cards */\n");
      out.write("    padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Product Card */\n");
      out.write(".product-card {\n");
      out.write("    background-color: #fff;\n");
      out.write("    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\n");
      out.write("    padding: 15px;\n");
      out.write("    width: calc(33.33% - 20px); /* Makes each card take 1/3 of the row width */\n");
      out.write("    text-align: center;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    transition: transform 0.3s ease;\n");
      out.write("    outline: none;\n");
      out.write("    margin-bottom: 20px; /* Adds space between rows */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product-card:hover {\n");
      out.write("    transform: translateY(-10px);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product-card img {\n");
      out.write("    max-width: 100%;\n");
      out.write("    height: 200px; /* Keep image height consistent */\n");
      out.write("    object-fit: cover;\n");
      out.write("    margin-bottom: 10px; /* Space below the image */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product-card h3 {\n");
      out.write("    font-size: 18px;\n");
      out.write("    margin-top: 10px;\n");
      out.write("    color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product-card p {\n");
      out.write("    font-size: 14px;\n");
      out.write("    color: #777;\n");
      out.write("    margin-top: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product-card .price {\n");
      out.write("    font-size: 16px;\n");
      out.write("    color: #ff6600;\n");
      out.write("    font-weight: bold;\n");
      out.write("    margin-top: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product-card .add-to-cart {\n");
      out.write("    display: inline-block;\n");
      out.write("    padding: 8px 15px;\n");
      out.write("    background-color: #ff6600;\n");
      out.write("    color: #fff;\n");
      out.write("    font-weight: bold;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    margin-top: 10px;\n");
      out.write("    transition: background-color 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product-card .add-to-cart:hover {\n");
      out.write("    background-color: #e55a00;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Responsiveness */\n");
      out.write("@media (max-width: 768px) {\n");
      out.write("    .product-card {\n");
      out.write("        width: 100%; /* Makes cards take full width on small screens */\n");
      out.write("        margin-bottom: 20px; /* Adds space between rows on mobile */\n");
      out.write("    }\n");
      out.write("  .hero {\n");
      out.write("    background-color: #fff;\n");
      out.write("    padding: 40px;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".hero h1 {\n");
      out.write("    font-size: 36px;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".hero p {\n");
      out.write("    font-size: 18px;\n");
      out.write("    color: #777;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("}\n");
      out.write("    \n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write(" <header>\n");
      out.write("        <nav>\n");
      out.write("        <div class=\"logo\">\n");
      out.write("                <img src=\"uploads/logo_project_cse.jpg\" style=\"width:100px\" alt=\"Easy Market Logo\">\n");
      out.write("            </div>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"#products\">Clothes and Fashion</a></li>\n");
      out.write("                <li><a href=\"#categories\">Groceries</a></li>\n");
      out.write("                <li><a href=\"#deals\">Gold</a></li>\n");
      out.write("                <li><a href=\"#cart\">Electronics Shopping Cart</a></li>\n");
      out.write("                <li><a href=\"#cart\">Sports</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("   <section class=\"hero\" style=\"display: flex; flex-direction: column; justify-content: center; align-items: center; height: 100vh; text-align: center; background: #f4f4f4;\">\n");
      out.write("    <h1 style=\"margin: 0;\">Welcome to Easy Market</h1>\n");
      out.write("    <p style=\"margin: 20px 0;\">Your One-Stop Online Shopping Destination</p>\n");
      out.write("    <a href=\"#products\" class=\"cta-button\" style=\"padding: 10px 20px; background-color: #007bff; color: white; text-decoration: none; border-radius: 15px; font-size: 20px;\">Shop Now</a>\n");
      out.write("    <img src=\"uploads/WhatsApp Image 2023-10-12 at 13.02.22_dc6c5a8c.jpg\" alt=\"Online Shopping Illustration\" style=\"margin-top: 20px; width: 80%; max-width: 600px;\">\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <hr>\n");
      out.write("    <h2 style=\"text-align: center;\">Clothes and Fashion</h2>\n");
      out.write("    <div class=\"product-container\">\n");
      out.write("    <section id=\"products\" class=\"products\" style=\"display: flex;\">\n");
      out.write("    \n");
      out.write("    <div class=\"product-card highlights\">\n");
      out.write("			    <img src=\"uploads/Cami-Top.jpg\" alt=\"Sample Image\" width=\"200\" height=\"\">\n");
      out.write("			    <h3>Cami Top Dress</h3>\n");
      out.write("			    <p>Product Description 1</p>\n");
      out.write("			    <span class=\"price\">$3,949.99</span>\n");
      out.write("			    <a href=\"http://localhost/php-practice/praveen/site/flipkart_form.php\" class=\"add-to-cart\">Buy Now</a>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"product-card highlights\">\n");
      out.write("			    <img src=\"uploads/Cotton-Shirts.jpg\" alt=\"Sample Image\" width=\"200\" height=\"\">\n");
      out.write("			    <h3>Cotton Gents Shirts</h3>\n");
      out.write("			    <p>Product Description 1</p>\n");
      out.write("			    <span class=\"price\">$4,099.99</span>\n");
      out.write("			    <a href=\"http://localhost/php-practice/praveen/site/flipkart_form.php\" class=\"add-to-cart\">Buy Now</a>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"product-card highlights\">\n");
      out.write("			    <img src=\"uploads/women dress.jpg\" alt=\"Sample Image\" width=\"200\" height=\"\">\n");
      out.write("			    <h3>Asymmetrical Top</h3>\n");
      out.write("			    <p>Product Description 1</p>\n");
      out.write("			    <span class=\"price\">$2,349.99</span>\n");
      out.write("			    <a href=\"http://localhost/php-practice/praveen/site/amazon_form.php\" class=\"add-to-cart\">Buy Now</a>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"product-card highlights\">\n");
      out.write("			    <img src=\"uploads/Shirt.jpg\" alt=\"Product 1\" width=\"200\" height=\"\">\n");
      out.write("			    <h3>Casual Gents Shirts</h3>\n");
      out.write("			    <p>Product Description 1</p>\n");
      out.write("			    <span class=\"price\">$2,449.99</span>\n");
      out.write("			    <a href=\"http://localhost/php-practice/praveen/site/amazon_form.php\" class=\"add-to-cart\">Buy Now</a>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"product-card highlights\">\n");
      out.write("			    <img src=\"uploads/WhatsApp Image 2023-10-12 at 12.32.29_75f8371e.jpg\" alt=\"Product 1\" width=\"200\" height=\"\">\n");
      out.write("			    <h3>Emprire Top</h3>\n");
      out.write("			    <p>Product Description 1</p>\n");
      out.write("			    <span class=\"price\">$2,999.99</span>\n");
      out.write("			    <a href=\"http://localhost/php-practice/praveen/site/amazon_form.php\" class=\"add-to-cart\">Buy Now</a>\n");
      out.write("			</div>\n");
      out.write("			</section>\n");
      out.write("    </div>\n");
      out.write("    <hr>\n");
      out.write("    <h2 style=\"text-align: center;\">Groceries</h2>\n");
      out.write("    <div class=\"product-container\">\n");
      out.write("    <section id=\"categories\" class=\"categories\" style=\"display: flex;\">\n");
      out.write("    <div class=\"product-card highlights\">\n");
      out.write("			    <img src=\"uploads/WhatsApp Image 2023-10-12 at 12.20.49_4b5a0d76.jpg\" alt=\"Product 1\" width=\"200\" height=\"\">\n");
      out.write("			    <h3>Devaaya Basmati Rice</h3>\n");
      out.write("			    <p>Product Description 1</p>\n");
      out.write("			    <span class=\"price\">$1549.99</span>\n");
      out.write("			    <a href=\"http://localhost/php-practice/praveen/site/flipkart_form.php\" class=\"add-to-cart\">Buy Now</a>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"product-card highlights\">\n");
      out.write("			    <img src=\"uploads/WhatsApp Image 2023-10-12 at 12.20.49_08043506.jpg\" alt=\"Product 1\" width=\"200\" height=\"\">\n");
      out.write("			    <h3>Daawat Devaaya Basmati Rice</h3>\n");
      out.write("			    <p>Product Description 1</p>\n");
      out.write("			    <span class=\"price\">$1449.99</span>\n");
      out.write("			    <a href=\"http://localhost/php-practice/praveen/site/amazon_form.php\" class=\"add-to-cart\">Buy Now</a>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"product-card highlights\">\n");
      out.write("			    <img src=\"uploads/WhatsApp Image 2023-10-12 at 12.20.50_84bd821d.jpg\" alt=\"Product 1\" width=\"200\" height=\"\">\n");
      out.write("			    <h3>Sun Flower Oil</h3>\n");
      out.write("			    <p>Product Description 1</p>\n");
      out.write("			    <span class=\"price\">$149.99</span>\n");
      out.write("			    <a href=\"http://localhost/php-practice/praveen/site/amazon_form.php\" class=\"add-to-cart\">Buy Now</a>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"product-card highlights\">\n");
      out.write("			    <img src=\"uploads/WhatsApp Image 2023-10-12 at 12.20.50_c18f54da.jpg\" alt=\"Product 1\" width=\"200\" height=\"\">\n");
      out.write("			    <h3>Ghee</h3>\n");
      out.write("			    <p>Product Description 1</p>\n");
      out.write("			    <span class=\"price\">$83.99</span>\n");
      out.write("			    <a href=\"http://localhost/php-practice/praveen/site/amazon_form.php\" class=\"add-to-cart\">Buy Now</a>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"product-card highlights\">\n");
      out.write("			    <img src=\"uploads/WhatsApp Image 2023-10-12 at 12.20.51_60fa72fc.jpg\" alt=\"Product 1\" width=\"200\" height=\"\" >\n");
      out.write("			    <h3>Chick pea</h3>\n");
      out.write("			    <p>Product Description 1</p>\n");
      out.write("			    <span class=\"price\">$499.99</span>\n");
      out.write("			    <a href=\"http://localhost/php-practice/praveen/site/flipkart_form.php\" class=\"add-to-cart\">Buy Now</a>\n");
      out.write("			</div>\n");
      out.write("			</section>\n");
      out.write("			</div>\n");
      out.write("			<h2 style=\"text-align: center;\">Gold</h2>\n");
      out.write("    <div class=\"product-container\">\n");
      out.write("    <section id=\"deals\" class=\"categories\" style=\"display: flex;\">  \n");
      out.write("        <!-- Within the products or categories section, add product cards -->\n");
      out.write("			<div class=\"product-card highlights\">\n");
      out.write("			    <img src=\"uploads/71y+f6r75tL._AC_SS260_.jpg\" alt=\"Product 1\" width=\"200\" height=\"\">\n");
      out.write("			    <h3>Watches Sonata</h3>\n");
      out.write("			    <p>Product Description 1</p>\n");
      out.write("			    <span class=\"price\">$1,33,49.9</span>\n");
      out.write("			    <a href=\"http://localhost/php-practice/praveen/site/amazon_form.php\" class=\"add-to-cart\">Buy Now</a>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"product-card highlights\">\n");
      out.write("			    <img src=\"uploads/71OKNZr3SmL._AC_SS260_.jpg\" alt=\"Product 1\" width=\"200\" height=\"\">\n");
      out.write("			    <h3>Watches Gold</h3>\n");
      out.write("			    <p>Product Description 1</p>\n");
      out.write("			    <span class=\"price\">$1,49,343.9</span>\n");
      out.write("			    <a href=\"http://localhost/php-practice/praveen/site/flipkart_form.php\" class=\"add-to-cart\">Buy Now</a>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"product-card highlights\">\n");
      out.write("			    <img src=\"uploads/71TI3XtIIPL._AC_SS260_.jpg\" alt=\"Product 1\" width=\"200\" height=\"\">\n");
      out.write("			    <h3>Gold Chain Necklace</h3>\n");
      out.write("			    <p>Product Description 1</p>\n");
      out.write("			    <span class=\"price\">$3,34,449.9</span>\n");
      out.write("			    <a href=\"http://localhost/php-practice/praveen/site/flipkart_form.php\" class=\"add-to-cart\">Buy Now</a>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"product-card highlights\">\n");
      out.write("			    <img src=\"uploads/71A1uqwKSdL._AC_SS260_.jpg\" alt=\"Product 1\" width=\"200\" height=\"\">\n");
      out.write("			    <h3>Gold Stone Necklace</h3>\n");
      out.write("			    <p>Product Description 1</p>\n");
      out.write("			    <span class=\"price\">$5,73,649.9</span>\n");
      out.write("			    <a href=\"http://localhost/php-practice/praveen/site/amazon_form.php\" class=\"add-to-cart\">Buy Now</a>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"product-card highlights\">\n");
      out.write("			    <img src=\"uploads/Bangle.jpg\" alt=\"Product 1\" width=\"200\" height=\"\">\n");
      out.write("			    <h3>Gold Vaddanam</h3>\n");
      out.write("			    <p>Product Description 1</p>\n");
      out.write("			    <span class=\"price\">$9,49,673.9</span>\n");
      out.write("			    <a href=\"http://localhost/php-practice/praveen/site/flipkart_form.php\" class=\"add-to-cart\">Buy Now</a>\n");
      out.write("			</div>\n");
      out.write("    </section>\n");
      out.write("    </div>\n");
      out.write("    <hr>\n");
      out.write("    <h2 style=\"text-align: center;\">Electronics Shopping Cart</h2>\n");
      out.write("    <div class=\"product-container\">\n");
      out.write("    <section id=\"cart\" class=\"cart\" style=\"display: flex;\">\n");
      out.write("        <div class=\"product-card highlights\">\n");
      out.write("			    <img src=\"uploads/41tSQSq1xJL._AC_UF334,334_FMjpg_.jpg\" alt=\"Product 1\" width=\"200\" height=\"\">\n");
      out.write("			    <h3>Realme Zarzo</h3>\n");
      out.write("			    <p>Product Description 1</p>\n");
      out.write("			    <span class=\"price\">$23,249.99</span>\n");
      out.write("			    <a href=\"http://localhost/php-practice/praveen/site/amazon_form.php\" class=\"add-to-cart\">Buy Now</a>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"product-card highlights\">\n");
      out.write("			    <img src=\"uploads/WhatsApp Image 2023-10-12 at 12.10.07_33d977fc.jpg\" alt=\"Product 1\" width=\"200\" height=\"\">\n");
      out.write("			    <h3>One Pluse</h3>\n");
      out.write("			    <p>Product Description 1</p>\n");
      out.write("			    <span class=\"price\">$49,333.99</span>\n");
      out.write("			    <a href=\"http://localhost/php-practice/praveen/site/amazon_form.php\" class=\"add-to-cart\">Buy Now</a>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"product-card highlights\">\n");
      out.write("			    <img src=\"uploads/WhatsApp Image 2023-10-12 at 12.10.07_32b59303.jpg\" alt=\"Product 1\" width=\"200\" height=\"\">\n");
      out.write("			    <h3>M34 5G</h3>\n");
      out.write("			    <p>Product Description 1</p>\n");
      out.write("			    <span class=\"price\">$32,349.99</span>\n");
      out.write("			    <a href=\"http://localhost/php-practice/praveen/site/amazon_form.php\" class=\"add-to-cart\">Buy Now</a>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"product-card highlights\">\n");
      out.write("			    <img src=\"uploads/WhatsApp Image 2023-10-12 at 12.10.08_5e0f1e7e.jpg\" alt=\"Product 1\" width=\"200\" height=\"\">\n");
      out.write("			    <h3>HP VICTUS</h3>\n");
      out.write("			    <p>Product Description 1</p>\n");
      out.write("			    <span class=\"price\">$49,433.99</span>\n");
      out.write("			    <a href=\"http://localhost/php-practice/praveen/site/flipkart_form.php\" class=\"add-to-cart\">Buy Now</a>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"product-card highlights\">\n");
      out.write("			    <img src=\"uploads/WhatsApp Image 2023-10-12 at 12.10.08_a468dd33.jpg\" alt=\"Product 1\" width=\"200\" height=\"\">\n");
      out.write("			    <h3>LG TV</h3>\n");
      out.write("			    <p>Product Description 1</p>\n");
      out.write("			    <span class=\"price\">$32,449.99</span>\n");
      out.write("			    <a href=\"http://localhost/php-practice/praveen/site/flipkart_form.php\" class=\"add-to-cart\">Buy Now</a>\n");
      out.write("			</div>\n");
      out.write("  \n");
      out.write("    </section>\n");
      out.write("	</div>\n");
      out.write("	<hr>\n");
      out.write("    <h2 style=\"text-align: center;\">Sports</h2>\n");
      out.write("    <div class=\"product-container\">\n");
      out.write("    <section id=\"products\" class=\"products\" style=\"display: flex;\">\n");
      out.write("            \n");
      out.write("       <!-- Within the products or categories section, add product cards -->\n");
      out.write("       		<div class=\"product-card highlights\">\n");
      out.write("			    <img src=\"uploads/Cricket.jpg\" alt=\"Product 1\" width=\"200\" height=\"\">\n");
      out.write("			    <h3>Cricket Bat</h3>\n");
      out.write("			    <p>Product Description 1</p>\n");
      out.write("			    <span class=\"price\">$4,549.99</span>\n");
      out.write("			    <a href=\"http://localhost/php-practice/praveen/site/amazon_form.php\" class=\"add-to-cart\">Buy Now</a>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"product-card highlights\">\n");
      out.write("			    <img src=\"uploads/Vollyball.jpg\" alt=\"Product 1\" width=\"200\" height=\"\">\n");
      out.write("			    <h3>Volleyball</h3>\n");
      out.write("			    <p>Product Description 1</p>\n");
      out.write("			    <span class=\"price\">$1,449.99</span>\n");
      out.write("			    <a href=\"http://localhost/php-practice/praveen/site/flipkart_form.php\" class=\"add-to-cart\">Buy Now</a>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"product-card highlights\">\n");
      out.write("			    <img src=\"uploads/6-9-high-quality-skating-in-line-shoe-have-different-size-and-original-imag9y7u6zgcehxz.jpeg.jpg\" alt=\"Product 1\" width=\"200\" height=\"\">\n");
      out.write("			    <h3>Roller Skates Shoes</h3>\n");
      out.write("			    <p>Product Description 1</p>\n");
      out.write("			    <span class=\"price\">$2,349.99</span>\n");
      out.write("			    <a href=\"http://localhost/php-practice/praveen/site/flipkart_form.php\" class=\"add-to-cart\">Buy Now</a>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"product-card highlights\">\n");
      out.write("			    <img src=\"uploads/180-accessories-kit-wish-hunt-original-imagkwfvhptcy7w5.jpeg.jpg\" alt=\"Product 1\" width=\"200\" height=\"\">\n");
      out.write("			    <h3>Fishing Hooks</h3>\n");
      out.write("			    <p>Product Description 1</p>\n");
      out.write("			    <span class=\"price\">$753.99</span>\n");
      out.write("			    <a href=\"http://localhost/php-practice/praveen/site/amazon_form.php\" class=\"add-to-cart\">Buy Now</a>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"product-card highlights\">\n");
      out.write("			    <img src=\"uploads/2-double-shaft-badminton-racquet-with-10-pc-nylon-shuttle-0100-original-imafx94uzjahcpqz.jpeg.jpg\" alt=\"Product 1\" width=\"200\" height=\"\">\n");
      out.write("			    <h3>Shuttle bat</h3>\n");
      out.write("			    <p>Product Description 1</p>\n");
      out.write("			    <span class=\"price\">$449.99</span>\n");
      out.write("			    <a href=\"https://www.amazon.in/Hipkoo-Grab-Badminton-Set-Shuttlecocks/dp/B07D7Y7BHP/ref=sr_1_1_sspa?crid=2H9UM89SAATX5&keywords=shuttle+bats&qid=1697118911&sprefix=shuttle+batt%2Caps%2C284&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1\" class=\"add-to-cart\">Buy Now</a>\n");
      out.write("			</div>\n");
      out.write("			\n");
      out.write("    </section>\n");
      out.write("    </div>\n");
      out.write("    <hr>\n");
      out.write("    <footer style=\"text-align: center; background-color: #ff6600; color: #fff; padding: 10px;\">\n");
      out.write("    <p>&copy; 2023 Easy Market. All rights reserved.</p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
