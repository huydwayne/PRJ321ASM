<%-- 
    Document   : register
    Created on : Nov 4, 2020, 4:55:29 PM
    Author     : HiGien
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
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
                        <h3>Register</h3>
                    </div>
                    <div class="card-body">
                        <form action = "registerSubmit" method="POST">
                           
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
                                    value="${param.username}"
                                    />
                            </div>
                            <c:if test="${not empty requestScope.errorMsg.errorUsername}">
                                <p style="color: red">${requestScope.errorMsg.errorUsername}</p>
                            </c:if>
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
                                    value="${param.password}"
                                    />
                            </div>
                             <c:if test="${not empty requestScope.errorMsg.errorPassword}">
                                <p style="color: red">${requestScope.errorMsg.errorPassword}</p>
                            </c:if>
                             <div class="input-group form-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"
                                          ><i class="fas fa-unlock-alt"></i
                                        ></span>
                                </div>
                                <input
                                    name="passwordConfirm"
                                    type="password"
                                    class="form-control"
                                    placeholder="confirm password"
                                    value="${param.passwordConfirm}"
                                    />
                            </div>
                             <c:if test="${not empty requestScope.errorMsg.errorConfirm}">
                                <p style="color: red">${requestScope.errorMsg.errorConfirm}</p>
                            </c:if>
                              <div class="input-group form-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"
                                          ><i class="fas fa-user-edit"></i
                                        ></span>
                                </div>
                                <input
                                    name="name"
                                    type="text"
                                    class="form-control"
                                    placeholder="your name"
                                    value="${param.name}"
                                    />
                            </div>
                             <c:if test="${not empty requestScope.errorMsg.errorName}">
                                <p style="color: red">${requestScope.errorMsg.errorName}</p>
                            </c:if>
                             <c:if test="${not empty requestScope.errorMsg.errorDuplicate}">
                                <p style="color: red">${requestScope.errorMsg.errorDuplicate}</p>
                            </c:if>
                            <div class="form-group">
                                <input
                                    type="submit"
                                    value="Register"
                                    class="btn float-right login_btn"
                                    />
                            </div>
                        </form>
                    </div>
                    <div class="card-footer">
                        <div class="d-flex justify-content-center links">
                            Already an user?<a href="login.jsp">Login</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
