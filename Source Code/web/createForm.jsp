<%-- 
    Document   : createForm
    Created on : Nov 6, 2020, 12:10:37 AM
    Author     : HiGien
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Product Page</title>
        <jsp:include page="include.jsp" />
        <style>
            body {
                font-family: 'Lato', sans-serif
            }

            label {
                color: #333
            }

            .btn-send {
                font-weight: 300;
                text-transform: uppercase;
                letter-spacing: 0.2em;
                width: 80%;
                margin-left: 3px
            }

            .help-block.with-errors {
                color: #ff5050;
                margin-top: 5px
            }

            .card {
                margin-left: 10px;
                margin-right: 10px
            }
        </style>
    </head>
    <body>
        <jsp:include page="header.jsp" />
        <div class="row" style="margin-top: 100px">
            <div class="col-lg-7 mx-auto">
                <div class="card mt-2 mx-auto p-4 bg-light">
                    <div class="card-body bg-light">
                        <div class="container">
                            <form action="CreateProductServlet" method = "POST" enctype="multipart/form-data">
                                <div class="controls">
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group"> <label for="form_name">Product ID *</label> <input type="text" name="id" class="form-control"  value="${param.id}" placeholder="Please enter your product ID *"> </div>
                                                <c:if test="${not empty requestScope.msg.errorId}">
                                                <p style="color: red">${requestScope.msg.errorId}</p>
                                            </c:if>
                                            <c:if test="${not empty requestScope.msg.errorDuplicate}">
                                                <p style="color: red">${requestScope.msg.errorDuplicate}</p>
                                            </c:if>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group"> <label for="form_lastname">Product Name *</label> <input type="text" value="${param.name}" name="name" class="form-control" placeholder="Please enter your product name *"> </div>
                                                <c:if test="${not empty requestScope.msg.errorName}">
                                                <p style="color: red">${requestScope.msg.errorName}</p>
                                            </c:if>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group"> <label for="form_email">Product Price *</label> <input type="number" value="${param.price}" name="price" class="form-control" placeholder="Please enter your product price *"> </div>
                                                <c:if test="${not empty requestScope.msg.errorPrice}">
                                                <p style="color: red">${requestScope.msg.errorPrice}</p>
                                            </c:if>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group"> <label for="form_need">Upload Product Image *</label>
                                                <div class="input-group mb-3">
                                                    <div class="custom-file">
                                                        <input type="file" class="custom-file-input" name="image" id="inputGroupFile01">
                                                        <label class="custom-file-label" for="inputGroupFile01">Choose file</label>

                                                    </div>

                                                </div>
                                                <c:if test="${not empty requestScope.msg.errorImage}">
                                                    <p style="color: red">${requestScope.msg.errorImage}</p>
                                                </c:if>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="form-group"> <label for="form_message">Product Description *</label> <input value="${param.description}" name="description" class="form-control" placeholder="Write your product description here."></div>
                                                <c:if test="${not empty requestScope.msg.errorDescription}">
                                                <p style="color: red">${requestScope.msg.errorDescription}</p>
                                            </c:if>
                                        </div>
                                        <div class="col-md-12"> <input type="submit" class="btn btn-success btn-send pt-2 btn-block " value="Create"> </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div> 
            <script>
                $('#inputGroupFile01').on('change', function () {
                    //get the file name
                    var fileName = $(this).val();
                    fileName = fileName.replace('C:\\fakepath\\', "");
                    //replace the "Choose a file" label
                    $(this).next('.custom-file-label').html(fileName);
                })
            </script>
    </body>
</html>
