<%-- 
    Document   : login
    Created on : Nov 4, 2020, 4:55:29 PM
    Author     : HiGien
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <jsp:include page="include.jsp" />
        <style>
            html,
            body {
                background-image: url("http://getwallpapers.com/wallpaper/full/a/5/d/544750.jpg");
                background-size: cover;
                background-repeat: no-repeat;
                height: 100%;
            }

            .wrapper {
                position: fixed;
                top: 50%;
                left: 50%;
                transform: translate(-50%, -50%);
            }
            .card {
                margin-top: auto;
                margin-bottom: auto;
                width: 400px;
                background-color: rgba(0, 0, 0, 0.5) !important;
            }
            .card-header h3 {
                color: white;
            }
            .input-group-prepend span {
                width: 50px;
                background-color: #ffc312;
                color: black;
                border: 0 !important;
            }

            input:focus {
                outline: 0 0 0 0 !important;
                box-shadow: 0 0 0 0 !important;
            }

            .login_btn {
                color: black;
                background-color: #ffc312;
                width: 100px;
            }

            .login_btn:hover {
                color: black;
                background-color: white;
            }

            .links {
                color: white;
            }

            .links a {
                margin-left: 4px;
            }
        </style>
    </head>
    <body>
        <div class="wrapper">
            <div class="d-flex justify-content-center h-100">
                <div class="card">
                    <div class="card-header">
                        <h3>Login</h3>
                    </div>
                    <div class="card-body">
                        <form action="login" method="POST">


                            <div class="input-group form-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"
                                          ><i class="fas fa-user"></i
                                        ></span>
                                </div>
                                <input
                                    name="username"
                                    type="text"
                                    class="form-control"
                                    placeholder="username"
                                    />
                            </div>
                            <div class="input-group form-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"
                                          ><i class="fas fa-key"></i
                                        ></span>
                                </div>
                                <input
                                    name="password"
                                    type="password"
                                    class="form-control"
                                    placeholder="password"
                                    />
                            </div>
                            <c:if test="${not empty requestScope.invalid}">
                                <p style="color: red">${requestScope.invalid}</p>
                            </c:if>
                            <div class="form-group">
                                <input
                                    type="submit"
                                    value="Login"
                                    class="btn float-right login_btn"
                                    />
                            </div>
                        </form>
                    </div>
                    <div class="card-footer">
                        <div class="d-flex justify-content-center links">
                            Don't have an account?<a href="register">Register</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
