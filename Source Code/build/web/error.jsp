<%-- 
    Document   : error
    Created on : Nov 4, 2020, 10:38:11 PM
    Author     : HiGien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
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
        </style>
    </head>
    <body>
        <jsp:include page="header.jsp" />
        <div id="main">
            <div class="fof">
                <h1>Something went wrong</h1>
            </div>
        </div>
    </body>
</html>
