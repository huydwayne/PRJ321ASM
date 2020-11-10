<%-- 
    Document   : index
    Created on : Nov 4, 2020, 3:29:37 PM
    Author     : HiGien
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Home Page</title>
        <jsp:include page="include.jsp" />
        <style>
            .container {
                margin-top: 50px;
                display: flex;
                flex-wrap: wrap;
            }
            .card {
                width: 30%;
                margin-bottom: 50px;
            }
            .card:nth-child(3n-1){
                margin-left: 50px;
                margin-right: 50px;
            }
        </style>
    </head>
    <body>
        <jsp:include page="header.jsp" />

        <!-- Show List Product -->
        <div class="container">
            <c:forEach var="item" items="${requestScope.data}">
                <div class="card">
                    <img class="card-img-top" style="width: 300px; height: 250px" src="./images/${item.image}" />
                    <div class="card-body">
                        <h5 class="card-title">${item.name}</h5>
                        <h6 class="card-subtitle mb-2 text-muted">
                            Product Price: ${item.price}$
                        </h6>
                        <p class="card-text">
                            ${item.description}
                        </p>
                        <a href="cart?id=${item.id}" class="btn btn-primary">Add to Cart</a>
                        <c:if test="${sessionScope.user.role}">
                            <a href="update?id=${item.id}" class="btn btn-success">Update</a>
                            <button onclick="deleteFunction('${item.id}')" class="btn btn-danger">Delete</button>   
                        </c:if>
                    </div>
                </div>
            </c:forEach>


        </div>
        <script>
            function deleteFunction(id) {
                let isConfirmed = confirm("Are you sure about that?");
                if (isConfirmed) {
                    window.location.href = "delete?id="+id;
                } else {
                    alert("Cancel Delete");
                }
            }
        </script>
    </body>
</html>
