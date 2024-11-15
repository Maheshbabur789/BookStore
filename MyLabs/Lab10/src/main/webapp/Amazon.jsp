<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 if(session.getAttribute("name")==null){
	 response.sendRedirect("Amazon.jsp");
 }
 %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Easy Market - Online Shopping</title>
 <link rel="stylesheet" href="styles.css">
<style>
header {
    background-color: #ff6600; /* Change this color to your desired header background color */
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}


nav {
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding: 20px 20px;
}

nav ul {
	
    list-style: none;
    display: flex;
}

nav li {
    margin-right: 40px;
}

nav a {
    text-decoration: none;
    color: #333;
    font-weight: bold;
}
/* Product Container */
.product-container {
    display: flex;
    flex-wrap: wrap;
    justify-content: space-between; /* This makes space between cards */
    gap: 20px; /* This adds a consistent gap between product cards */
    padding: 20px;
}

/* Product Card */
.product-card {
    background-color: #fff;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    padding: 15px;
    width: calc(33.33% - 20px); /* Makes each card take 1/3 of the row width */
    text-align: center;
    border-radius: 8px;
    transition: transform 0.3s ease;
    outline: none;
    margin-bottom: 20px; /* Adds space between rows */
}

.product-card:hover {
    transform: translateY(-10px);
}

.product-card img {
    max-width: 100%;
    height: 200px; /* Keep image height consistent */
    object-fit: cover;
    margin-bottom: 10px; /* Space below the image */
}

.product-card h3 {
    font-size: 18px;
    margin-top: 10px;
    color: #333;
}

.product-card p {
    font-size: 14px;
    color: #777;
    margin-top: 10px;
}

.product-card .price {
    font-size: 16px;
    color: #ff6600;
    font-weight: bold;
    margin-top: 10px;
}

.product-card .add-to-cart {
    display: inline-block;
    padding: 8px 15px;
    background-color: #ff6600;
    color: #fff;
    font-weight: bold;
    border-radius: 4px;
    margin-top: 10px;
    transition: background-color 0.3s;
}

.product-card .add-to-cart:hover {
    background-color: #e55a00;
}

/* Responsiveness */
@media (max-width: 768px) {
    .product-card {
        width: 100%; /* Makes cards take full width on small screens */
        margin-bottom: 20px; /* Adds space between rows on mobile */
    }
  .hero {
    background-color: #fff;
    padding: 40px;
    text-align: center;
}

.hero h1 {
    font-size: 36px;
    margin-bottom: 10px;
}

.hero p {
    font-size: 18px;
    color: #777;
    margin-bottom: 20px;
}
    

</style>
</head>
<body>
 <header>
        <nav>
        <div class="logo">
                <img src="uploads/logo_project_cse.jpg" style="width:100px" alt="Easy Market Logo">
            </div>
            <ul>
                <li><a href="#products">Clothes and Fashion</a></li>
                <li><a href="#categories">Groceries</a></li>
                <li><a href="#deals">Gold</a></li>
                <li><a href="#cart">Electronics Shopping Cart</a></li>
                <li><a href="#cart">Sports</a></li>
            </ul>
        </nav>
    </header>
   <section class="hero" style="display: flex; flex-direction: column; justify-content: center; align-items: center; height: 100vh; text-align: center; background: #f4f4f4;">
    <h1 style="margin: 0;">Welcome to Easy Market</h1>
    <p style="margin: 20px 0;">Your One-Stop Online Shopping Destination</p>
    <a href="#products" class="cta-button" style="padding: 10px 20px; background-color: #007bff; color: white; text-decoration: none; border-radius: 15px; font-size: 20px;">Shop Now</a>
    <img src="uploads/WhatsApp Image 2023-10-12 at 13.02.22_dc6c5a8c.jpg" alt="Online Shopping Illustration" style="margin-top: 20px; width: 80%; max-width: 600px;">
</section>


    <hr>
    <h2 style="text-align: center;">Clothes and Fashion</h2>
    <div class="product-container">
    <section id="products" class="products" style="display: flex;">
    
    <div class="product-card highlights">
			    <img src="uploads/Cami-Top.jpg" alt="Sample Image" width="200" height="">
			    <h3>Cami Top Dress</h3>
			    <p>Product Description 1</p>
			    <span class="price">$3,949.99</span>
			    <a href="AddToCart.jsp" class="add-to-cart">Add to Cart</a>
			</div>
			<div class="product-card highlights">
			    <img src="uploads/Cotton-Shirts.jpg" alt="Sample Image" width="200" height="">
			    <h3>Cotton Gents Shirts</h3>
			    <p>Product Description 1</p>
			    <span class="price">$4,099.99</span>
			    <a href="" class="add-to-cart">Add to Cart</a>
			</div>
			<div class="product-card highlights">
			    <img src="uploads/women dress.jpg" alt="Sample Image" width="200" height="">
			    <h3>Asymmetrical Top</h3>
			    <p>Product Description 1</p>
			    <span class="price">$2,349.99</span>
			    <a href="" class="add-to-cart">Add to Cart</a>
			</div>
			<div class="product-card highlights">
			    <img src="uploads/Shirt.jpg" alt="Product 1" width="200" height="">
			    <h3>Casual Gents Shirts</h3>
			    <p>Product Description 1</p>
			    <span class="price">$2,449.99</span>
			    <a href="" class="add-to-cart">Add to Cart</a>
			</div>
			<div class="product-card highlights">
			    <img src="uploads/WhatsApp Image 2023-10-12 at 12.32.29_75f8371e.jpg" alt="Product 1" width="200" height="">
			    <h3>Emprire Top</h3>
			    <p>Product Description 1</p>
			    <span class="price">$2,999.99</span>
			    <a href="" class="add-to-cart">Add to Cart</a>
			</div>
			</section>
    </div>
    <hr>
    <h2 style="text-align: center;">Groceries</h2>
    <div class="product-container">
    <section id="categories" class="categories" style="display: flex;">
    <div class="product-card highlights">
			    <img src="uploads/WhatsApp Image 2023-10-12 at 12.20.49_4b5a0d76.jpg" alt="Product 1" width="200" height="">
			    <h3>Devaaya Basmati Rice</h3>
			    <p>Product Description 1</p>
			    <span class="price">$1549.99</span>
			    <a href="" class="add-to-cart">Add to Cart</a>
			</div>
			<div class="product-card highlights">
			    <img src="uploads/WhatsApp Image 2023-10-12 at 12.20.49_08043506.jpg" alt="Product 1" width="200" height="">
			    <h3>Daawat Devaaya Basmati Rice</h3>
			    <p>Product Description 1</p>
			    <span class="price">$1449.99</span>
			    <a href="" class="add-to-cart">Add to Cart</a>
			</div>
			<div class="product-card highlights">
			    <img src="uploads/WhatsApp Image 2023-10-12 at 12.20.50_84bd821d.jpg" alt="Product 1" width="200" height="">
			    <h3>Sun Flower Oil</h3>
			    <p>Product Description 1</p>
			    <span class="price">$149.99</span>
			    <a href="" class="add-to-cart">Add to Cart</a>
			</div>
			<div class="product-card highlights">
			    <img src="uploads/WhatsApp Image 2023-10-12 at 12.20.50_c18f54da.jpg" alt="Product 1" width="200" height="">
			    <h3>Ghee</h3>
			    <p>Product Description 1</p>
			    <span class="price">$83.99</span>
			    <a href="" class="add-to-cart">Add to Cart</a>
			</div>
			<div class="product-card highlights">
			    <img src="uploads/WhatsApp Image 2023-10-12 at 12.20.51_60fa72fc.jpg" alt="Product 1" width="200" height="" >
			    <h3>Chick pea</h3>
			    <p>Product Description 1</p>
			    <span class="price">$499.99</span>
			    <a href="" class="add-to-cart">Add to Cart</a>
			</div>
			</section>
			</div>
			<h2 style="text-align: center;">Gold</h2>
    <div class="product-container">
    <section id="deals" class="categories" style="display: flex;">  
        <!-- Within the products or categories section, add product cards -->
			<div class="product-card highlights">
			    <img src="uploads/71y+f6r75tL._AC_SS260_.jpg" alt="Product 1" width="200" height="">
			    <h3>Watches Sonata</h3>
			    <p>Product Description 1</p>
			    <span class="price">$1,33,49.9</span>
			    <a href="" class="add-to-cart">Add to Cart</a>
			</div>
			<div class="product-card highlights">
			    <img src="uploads/71OKNZr3SmL._AC_SS260_.jpg" alt="Product 1" width="200" height="">
			    <h3>Watches Gold</h3>
			    <p>Product Description 1</p>
			    <span class="price">$1,49,343.9</span>
			    <a href="" class="add-to-cart">Add to Cart</a>
			</div>
			<div class="product-card highlights">
			    <img src="uploads/71TI3XtIIPL._AC_SS260_.jpg" alt="Product 1" width="200" height="">
			    <h3>Gold Chain Necklace</h3>
			    <p>Product Description 1</p>
			    <span class="price">$3,34,449.9</span>
			    <a href="" class="add-to-cart">Add to Cart</a>
			</div>
			<div class="product-card highlights">
			    <img src="uploads/71A1uqwKSdL._AC_SS260_.jpg" alt="Product 1" width="200" height="">
			    <h3>Gold Stone Necklace</h3>
			    <p>Product Description 1</p>
			    <span class="price">$5,73,649.9</span>
			    <a href="" class="add-to-cart">Add to Cart</a>
			</div>
			<div class="product-card highlights">
			    <img src="uploads/Bangle.jpg" alt="Product 1" width="200" height="">
			    <h3>Gold Vaddanam</h3>
			    <p>Product Description 1</p>
			    <span class="price">$9,49,673.9</span>
			    <a href="" class="add-to-cart">Add to Cart</a>
			</div>
    </section>
    </div>
    <hr>
    <h2 style="text-align: center;">Electronics Shopping Cart</h2>
    <div class="product-container">
    <section id="cart" class="cart" style="display: flex;">
        <div class="product-card highlights">
			    <img src="uploads/41tSQSq1xJL._AC_UF334,334_FMjpg_.jpg" alt="Product 1" width="200" height="">
			    <h3>Realme Zarzo</h3>
			    <p>Product Description 1</p>
			    <span class="price">$23,249.99</span>
			    <a href="" class="add-to-cart">Add to Cart</a>
			</div>
			<div class="product-card highlights">
			    <img src="uploads/WhatsApp Image 2023-10-12 at 12.10.07_33d977fc.jpg" alt="Product 1" width="200" height="">
			    <h3>One Pluse</h3>
			    <p>Product Description 1</p>
			    <span class="price">$49,333.99</span>
			    <a href="" class="add-to-cart">Add to Cart</a>
			</div>
			<div class="product-card highlights">
			    <img src="uploads/WhatsApp Image 2023-10-12 at 12.10.07_32b59303.jpg" alt="Product 1" width="200" height="">
			    <h3>M34 5G</h3>
			    <p>Product Description 1</p>
			    <span class="price">$32,349.99</span>
			    <a href="" class="add-to-cart">Add to Cart</a>
			</div>
			<div class="product-card highlights">
			    <img src="uploads/WhatsApp Image 2023-10-12 at 12.10.08_5e0f1e7e.jpg" alt="Product 1" width="200" height="">
			    <h3>HP VICTUS</h3>
			    <p>Product Description 1</p>
			    <span class="price">$49,433.99</span>
			    <a href="" class="add-to-cart">Add to Cart</a>
			</div>
			<div class="product-card highlights">
			    <img src="uploads/WhatsApp Image 2023-10-12 at 12.10.08_a468dd33.jpg" alt="Product 1" width="200" height="">
			    <h3>LG TV</h3>
			    <p>Product Description 1</p>
			    <span class="price">$32,449.99</span>
			    <a href="" class="add-to-cart">Add to Cart</a>
			</div>
  
    </section>
	</div>
	<hr>
    <h2 style="text-align: center;">Sports</h2>
    <div class="product-container">
    <section id="products" class="products" style="display: flex;">
            
       <!-- Within the products or categories section, add product cards -->
       		<div class="product-card highlights">
			    <img src="uploads/Cricket.jpg" alt="Product 1" width="200" height="">
			    <h3>Cricket Bat</h3>
			    <p>Product Description 1</p>
			    <span class="price">$4,549.99</span>
			    <a href="" class="add-to-cart">Add to Cart</a>
			</div>
			<div class="product-card highlights">
			    <img src="uploads/Vollyball.jpg" alt="Product 1" width="200" height="">
			    <h3>Volleyball</h3>
			    <p>Product Description 1</p>
			    <span class="price">$1,449.99</span>
			    <a href="" class="add-to-cart">Add to Cart</a>
			</div>
			<div class="product-card highlights">
			    <img src="uploads/6-9-high-quality-skating-in-line-shoe-have-different-size-and-original-imag9y7u6zgcehxz.jpeg.jpg" alt="Product 1" width="200" height="">
			    <h3>Roller Skates Shoes</h3>
			    <p>Product Description 1</p>
			    <span class="price">$2,349.99</span>
			    <a href="" class="add-to-cart">Add to Cart</a>
			</div>
			<div class="product-card highlights">
			    <img src="uploads/180-accessories-kit-wish-hunt-original-imagkwfvhptcy7w5.jpeg.jpg" alt="Product 1" width="200" height="">
			    <h3>Fishing Hooks</h3>
			    <p>Product Description 1</p>
			    <span class="price">$753.99</span>
			    <a href="" class="add-to-cart">Add to Cart</a>
			</div>
			<div class="product-card highlights">
			    <img src="uploads/2-double-shaft-badminton-racquet-with-10-pc-nylon-shuttle-0100-original-imafx94uzjahcpqz.jpeg.jpg" alt="Product 1" width="200" height="">
			    <h3>Shuttle bat</h3>
			    <p>Product Description 1</p>
			    <span class="price">$449.99</span>
			    <a href="" class="add-to-cart">Add to Cart</a>
			</div>
			
    </section>
    </div>
    <hr>
    <footer style="text-align: center; background-color: #ff6600; color: #fff; padding: 10px;">
    <p>&copy; 2023 Easy Market. All rights reserved.</p>
</footer>


</body>
</html>
</body>
</html>
