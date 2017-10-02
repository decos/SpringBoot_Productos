
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
    <head>
        <title>Welcome to Spring Boot Products</title>
    </head>
    <body>
        <h1 th:inline="text">Hello!</h1>
        <a href="/addNewProduct.html">Create Product</a>
    </body>
</html>