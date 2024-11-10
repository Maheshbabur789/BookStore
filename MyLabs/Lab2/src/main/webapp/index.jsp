<!DOCTYPE html>
<html>
<head>
    <title>Product Upload Form</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h1>Product Upload Form</h1>
        <form action="upload" method="post" enctype="multipart/form-data">
            <div class="form-group">
                <label for="category">Category:</label>
                <select id="category" name="category" class="form-control" required>
                    <option value="">---Select a category---</option>
                    <option value="Clothes and Fashion">Clothes and Fashion</option>
                    <option value="Groceries">Groceries</option>
                    <option value="Gold">Gold</option>
                    <option value="Electronics Shopping Cart">Electronics Shopping Cart</option>
                    <option value="Sports">Sports</option>
                </select>
            </div>
            <div class="form-group">
                <label for="name">Product Name:</label>
                <input type="text" class="form-control" id="name" name="name" required>
            </div>
            <div class="form-group">
                <label for="image">Product Image:</label>
                <input type="file" class="form-control-file" id="image" name="image" required>
            </div>
            <div class="form-group">
                <label for="amazon_price">Amazon Price:</label>
                <input type="number" class="form-control" id="amazon_price" name="amazon_price" step="0.01" required>
            </div>
            <div class="form-group">
                <label for="flipkart_price">Flipkart Price:</label>
                <input type="number" class="form-control" id="flipkart_price" name="flipkart_price" required>
            </div>
            <div class="form-group">
                <label for="description">About Product:</label>
                <textarea class="form-control" id="description" name="description" rows="4" required></textarea>
            </div>
            <button type="submit" class="btn btn-primary btn-block">Upload Product</button>
        </form>
    </div>
</body>
</html>
