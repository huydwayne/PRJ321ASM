<%-- 
    Document   : cartView
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
        <title>Cart View Page</title>
        <jsp:include page="include.jsp" />
        <style>
            *{
                transition: all 0.6s;
                overflow-y: hidden;
            }

            body{
                font-family: 'Lato', sans-serif;
                color: #888;
                margin: 0;
            }

            #main{
                display: table;
                width: 100%;
                height: 80vh;
                text-align: center;
            }

            .fof{
                display: table-cell;
                vertical-align: middle;
            }

            .fof h1{
                font-size: 50px;
                display: inline-block;
                padding-right: 12px;
                animation: type .5s alternate infinite;
            }

            @keyframes type{
                from{box-shadow: inset -3px 0px 0px #888;}
                to{box-shadow: inset -3px 0px 0px transparent;}
            }
            .shopping-cart {
                width: 1200px;
                margin: 0 auto;
                margin-top: 60px;
            }
        </style>
    </head>
    <body>
        <jsp:include page="header.jsp" />

        <!-- Shopping Cart -->
        <div class="shopping-cart col-sm-12 col-md-10 col-md-offset-1">
            <c:if test="${not empty sessionScope.cart.items}">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>Product</th>
                            <th>Quantity</th>
                            <th class="text-center">Price</th>
                            <th class="text-center">Total</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="item" items="${sessionScope.cart.items}">
                            <tr>
                                <td class="col-sm-8 col-md-6">
                                    <div class="media">
                                        <a class="thumbnail pull-left" href="#">
                                            <img
                                                class="media-object"
                                                src="./images/${item.value.image}"
                                                style="width: 72px; height: 72px"
                                                />
                                        </a>
                                        <div class="media-body">
                                            <h4 class="media-heading"><a href="#">${item.value.name}</a></h4>
                                        </div>
                                    </div>
                                </td>

                                <td class="col-sm-1 col-md-1 text-center">
                                    <strong>${item.value.quantity}</strong>
                                </td>
                                <td class="col-sm-1 col-md-1 text-center">
                                    <strong>${item.value.price}</strong>
                                </td>
                                <td class="col-sm-1 col-md-1 text-center">
                                    <strong>${item.value.quantity*item.value.price}</strong>
                                </td>
                                <td><a class="btn btn-danger" href="removeCart?id=${item.value.id}">
                                        <i class="fa fa-trash text-white" />
                                    </a></td>
                            </tr>
                        </c:forEach>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td><h4>Total</h4></td>
                            <td class="text-right">
                                <h4><strong>${sessionScope.cart.total}</strong></h4>
                            </td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td>
                                <a href="showResult" class="btn btn-info">
                                    <span class="fa fa-shopping-cart"></span> Continue Shopping
                                </a>
                            </td>
                            <td>
                                <a href="checkout" type="button" class="btn btn-success text-white">
                                    Checkout <span class="fa fa-play"></span>
                                </a>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </c:if>
            <c:if test="${empty sessionScope.cart.items}">
                <div id="main">
                    <div class="fof">
                        <h1>There is no product in cart</h1>
                    </div>
                </div>
            </c:if>
        </div>
    </body>
</html>
