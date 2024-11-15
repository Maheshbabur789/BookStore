<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Easy Market - Online Shopping</title>
 <link rel="stylesheet" href="styles.css">
<style>
body, h1, h2, p {
    margin: 0;
    padding: 0;
}
body {
    background-color: #f2f2f2;
    font-family: Arial, sans-serif;
}
    header {
    background-color: #ff6600; /* Change this color to your desired header background color */
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    
    nav {
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding: 10px 20px;
}
nav ul {
	
    list-style: none;
    display: flex;
}
nav li {
    margin-right: 20px;
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
footer {
    text-align: center;
    background-color: #ff6600;
    color: #fff;
    padding: 10px;
}

</style>
</head>
<body>
 <header>
        <nav>
            <ul>
                <li><a href="#products">Clothes and Fashion</a></li>
                <li><a href="#categories">Groceries</a></li>
                <li><a href="#deals">Gold</a></li>
                <li><a href="#cart">Electronics Shopping Cart</a></li>
                <li><a href="#cart">Sports</a></li>
            </ul>
        </nav>
    </header>
      <section class="hero">
        <div class="hero-content">
            <h1>Welcome to Easy Market</h1>
            <p>Your One-Stop Online Shopping Destination</p>
            <a href="#products" class="cta-button">Shop Now</a>
        </div>
        
    </section>
    <hr>
    <h2 style="text-align: center;">Clothes and Fashion</h2>
    <div class="product-container">
    <section id="products" class="products" style="display: flex;">
    
    <div class="product-card highlights">
			    <img src="Cami-Top.jpg" alt="Sample Image" width="300" height="200">
			    <h3>Cami Top Dress</h3>
			    <p>Product Description 1</p>
			    <span class="price">$3,949.99</span>
			    <a href="class="add-to-cart">Buy Now</a>
			</div>
			<div class="product-card highlights">
			    <img src="Cotton-Shirts.jpg" alt="Sample Image" width="300" height="200">
			    <h3>Cotton Gents Shirts</h3>
			    <p>Product Description 1</p>
			    <span class="price">$4,099.99</span>
			    <a href="http://localhost/php-practice/praveen/site/flipkart_form.php" class="add-to-cart">Buy Now</a>
			</div>
			<div class="product-card highlights">
			    <img src="women dress.jpg" alt="Sample Image" width="300" height="200">
			    <h3>Asymmetrical Top</h3>
			    <p>Product Description 1</p>
			    <span class="price">$2,349.99</span>
			    <a href="http://localhost/php-practice/praveen/site/amazon_form.php" class="add-to-cart">Buy Now</a>
			</div>
			<div class="product-card highlights">
			    <img src="Shirt.jpg" alt="Product 1" width="300" height="200">
			    <h3>Casual Gents Shirts</h3>
			    <p>Product Description 1</p>
			    <span class="price">$2,449.99</span>
			    <a href="http://localhost/php-practice/praveen/site/amazon_form.php" class="add-to-cart">Buy Now</a>
			</div>
			<div class="product-card highlights">
			    <img src="WhatsApp Image 2023-10-12 at 12.32.29_75f8371e.jpg" alt="Product 1" width="300" height="200">
			    <h3>Emprire Top</h3>
			    <p>Product Description 1</p>
			    <span class="price">$2,999.99</span>
			    <a href="http://localhost/php-practice/praveen/site/amazon_form.php" class="add-to-cart">Buy Now</a>
			</div>
			</section>
    </div>
    <hr>
    <h2 style="text-align: center;">Groceries</h2>
    <div class="product-container">
    <section id="categories" class="categories" style="display: flex;">
    <div class="product-card highlights">
			    <img src="WhatsApp Image 2023-10-12 at 12.20.49_4b5a0d76.jpg" alt="Product 1" width="300" height="200">
			    <h3>Devaaya Basmati Rice</h3>
			    <p>Product Description 1</p>
			    <span class="price">$1549.99</span>
			    <a href="http://localhost/php-practice/praveen/site/flipkart_form.php" class="add-to-cart">Buy Now</a>
			</div>
			<div class="product-card highlights">
			    <img src="WhatsApp Image 2023-10-12 at 12.20.49_08043506.jpg" alt="Product 1" width="300" height="200">
			    <h3>Daawat Devaaya Basmati Rice</h3>
			    <p>Product Description 1</p>
			    <span class="price">$1449.99</span>
			    <a href="http://localhost/php-practice/praveen/site/amazon_form.php" class="add-to-cart">Buy Now</a>
			</div>
			<div class="product-card highlights">
			    <img src="WhatsApp Image 2023-10-12 at 12.20.50_84bd821d.jpg" alt="Product 1" width="300" height="200">
			    <h3>Sun Flower Oil</h3>
			    <p>Product Description 1</p>
			    <span class="price">$149.99</span>
			    <a href="http://localhost/php-practice/praveen/site/amazon_form.php" class="add-to-cart">Buy Now</a>
			</div>
			<div class="product-card highlights">
			    <img src="WhatsApp Image 2023-10-12 at 12.20.50_c18f54da.jpg" alt="Product 1" width="300" height="200">
			    <h3>Ghee</h3>
			    <p>Product Description 1</p>
			    <span class="price">$83.99</span>
			    <a href="http://localhost/php-practice/praveen/site/amazon_form.php" class="add-to-cart">Buy Now</a>
			</div>
			<div class="product-card highlights">
			    <img src="WhatsApp Image 2023-10-12 at 12.20.51_60fa72fc.jpg" alt="Product 1" width="300" height="200" >
			    <h3>Chick pea</h3>
			    <p>Product Description 1</p>
			    <span class="price">$499.99</span>
			    <a href="http://localhost/php-practice/praveen/site/flipkart_form.php" class="add-to-cart">Buy Now</a>
			</div>
			</section>
			</div>
			<h2 style="text-align: center;">Gold</h2>
    <div class="product-container">
    <section id="deals" class="categories" style="display: flex;">  
        <!-- Within the products or categories section, add product cards -->
			<div class="product-card highlights">
			    <img src="71y+f6r75tL._AC_SS260_.jpg" alt="Product 1" width="300" height="200">
			    <h3>Watches Sonata</h3>
			    <p>Product Description 1</p>
			    <span class="price">$1,33,49.9</span>
			    <a href="http://localhost/php-practice/praveen/site/amazon_form.php" class="add-to-cart">Buy Now</a>
			</div>
			<div class="product-card highlights">
			    <img src="71OKNZr3SmL._AC_SS260_.jpg" alt="Product 1" width="300" height="200">
			    <h3>Watches Gold</h3>
			    <p>Product Description 1</p>
			    <span class="price">$1,49,343.9</span>
			    <a href="http://localhost/php-practice/praveen/site/flipkart_form.php" class="add-to-cart">Buy Now</a>
			</div>
			<div class="product-card highlights">
			    <img src="71TI3XtIIPL._AC_SS260_.jpg" alt="Product 1" width="300" height="200">
			    <h3>Gold Chain Necklace</h3>
			    <p>Product Description 1</p>
			    <span class="price">$3,34,449.9</span>
			    <a href="http://localhost/php-practice/praveen/site/flipkart_form.php" class="add-to-cart">Buy Now</a>
			</div>
			<div class="product-card highlights">
			    <img src="71A1uqwKSdL._AC_SS260_.jpg" alt="Product 1" width="300" height="200">
			    <h3>Gold Stone Necklace</h3>
			    <p>Product Description 1</p>
			    <span class="price">$5,73,649.9</span>
			    <a href="http://localhost/php-practice/praveen/site/amazon_form.php" class="add-to-cart">Buy Now</a>
			</div>
			<div class="product-card highlights">
			    <img src="Bangle.jpg" alt="Product 1" width="300" height="200">
			    <h3>Gold Vaddanam</h3>
			    <p>Product Description 1</p>
			    <span class="price">$9,49,673.9</span>
			    <a href="http://localhost/php-practice/praveen/site/flipkart_form.php" class="add-to-cart">Buy Now</a>
			</div>
    </section>
    </div>
    <hr>
    <h2 style="text-align: center;">Electronics Shopping Cart</h2>
    <div class="product-container">
    <section id="cart" class="cart" style="display: flex;">
        <div class="product-card highlights">
			    <img src="41tSQSq1xJL._AC_UF334,334_FMjpg_.jpg" alt="Product 1" width="300" height="200">
			    <h3>Realme Zarzo</h3>
			    <p>Product Description 1</p>
			    <span class="price">$23,249.99</span>
			    <a href="http://localhost/php-practice/praveen/site/amazon_form.php" class="add-to-cart">Buy Now</a>
			</div>
			<div class="product-card highlights">
			    <img src="WhatsApp Image 2023-10-12 at 12.10.07_33d977fc.jpg" alt="Product 1" width="300" height="200">
			    <h3>One Pluse</h3>
			    <p>Product Description 1</p>
			    <span class="price">$49,333.99</span>
			    <a href="http://localhost/php-practice/praveen/site/amazon_form.php" class="add-to-cart">Buy Now</a>
			</div>
			<div class="product-card highlights">
			    <img src="WhatsApp Image 2023-10-12 at 12.10.07_32b59303.jpg" alt="Product 1" width="300" height="200">
			    <h3>M34 5G</h3>
			    <p>Product Description 1</p>
			    <span class="price">$32,349.99</span>
			    <a href="http://localhost/php-practice/praveen/site/amazon_form.php" class="add-to-cart">Buy Now</a>
			</div>
			<div class="product-card highlights">
			    <img src="WhatsApp Image 2023-10-12 at 12.10.08_5e0f1e7e.jpg" alt="Product 1" width="300" height="200">
			    <h3>HP VICTUS</h3>
			    <p>Product Description 1</p>
			    <span class="price">$49,433.99</span>
			    <a href="http://localhost/php-practice/praveen/site/flipkart_form.php" class="add-to-cart">Buy Now</a>
			</div>
			<div class="product-card highlights">
			    <img src="WhatsApp Image 2023-10-12 at 12.10.08_a468dd33.jpg" alt="Product 1" width="300" height="200">
			    <h3>LG TV</h3>
			    <p>Product Description 1</p>
			    <span class="price">$32,449.99</span>
			    <a href="http://localhost/php-practice/praveen/site/flipkart_form.php" class="add-to-cart">Buy Now</a>
			</div>
  
    </section>
	</div>
	<hr>
    <h2 style="text-align: center;">Sports</h2>
    <div class="product-container">
    <section id="products" class="products" style="display: flex;">
            
       <!-- Within the products or categories section, add product cards -->
       		<div class="product-card highlights">
			    <img src="Cricket.jpg" alt="Product 1" width="300" height="200">
			    <h3>Cricket Bat</h3>
			    <p>Product Description 1</p>
			    <span class="price">$4,549.99</span>
			    <a href="http://localhost/php-practice/praveen/site/amazon_form.php" class="add-to-cart">Buy Now</a>
			</div>
			<div class="product-card highlights">
			    <img src="Vollyball.jpg" alt="Product 1" width="300" height="200">
			    <h3>Volleyball</h3>
			    <p>Product Description 1</p>
			    <span class="price">$1,449.99</span>
			    <a href="http://localhost/php-practice/praveen/site/flipkart_form.php" class="add-to-cart">Buy Now</a>
			</div>
			<div class="product-card highlights">
			    <img src="6-9-high-quality-skating-in-line-shoe-have-different-size-and-original-imag9y7u6zgcehxz.jpeg.jpg" alt="Product 1" width="300" height="200">
			    <h3>Roller Skates Shoes</h3>
			    <p>Product Description 1</p>
			    <span class="price">$2,349.99</span>
			    <a href="http://localhost/php-practice/praveen/site/flipkart_form.php" class="add-to-cart">Buy Now</a>
			</div>
			<div class="product-card highlights">
			    <img src="180-accessories-kit-wish-hunt-original-imagkwfvhptcy7w5.jpeg.jpg" alt="Product 1" width="300" height="200">
			    <h3>Fishing Hooks</h3>
			    <p>Product Description 1</p>
			    <span class="price">$753.99</span>
			    <a href="http://localhost/php-practice/praveen/site/amazon_form.php" class="add-to-cart">Buy Now</a>
			</div>
			<div class="product-card highlights">
			    <img src="2-double-shaft-badminton-racquet-with-10-pc-nylon-shuttle-0100-original-imafx94uzjahcpqz.jpeg.jpg" alt="Product 1" width="300" height="200">
			    <h3>Shuttle bat</h3>
			    <p>Product Description 1</p>
			    <span class="price">$449.99</span>
			    <a href="https://www.amazon.in/Hipkoo-Grab-Badminton-Set-Shuttlecocks/dp/B07D7Y7BHP/ref=sr_1_1_sspa?crid=2H9UM89SAATX5&keywords=shuttle+bats&qid=1697118911&sprefix=shuttle+batt%2Caps%2C284&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1" class="add-to-cart">Buy Now</a>
			</div>
			
    </section>
    </div>
    <footer>
        <p>&copy; 2023 Easy Market. All rights reserved.</p>
    </footer>
</body>
</html>