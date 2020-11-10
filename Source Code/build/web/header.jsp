<%-- 
    Document   : header
    Created on : Nov 4, 2020, 4:51:26 PM
    Author     : HiGien
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- Header -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="#">One man Sale</a>
    <div class="collapse navbar-collapse" id="navbarText">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="showResult"
                   >Home <span class="sr-only">(current)</span></a
                >
            </li>
            <li class="nav-item">
                <a class="nav-link" href="cartView.jsp">View Cart</a>
            </li>
            <c:if test="${sessionScope.user.role}">
                <li class="nav-item">
                    <a class="nav-link" href="createForm.jsp">Add New Product</a>
                </li>
            </c:if>
        </ul>
        <span class="navbar-text"> Welcome, ${sessionScope.user.name} <a style="font-size: 14px" href="logout">Logout</a> </span>
    </div>
</nav>
