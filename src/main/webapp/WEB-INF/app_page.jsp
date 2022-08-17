<%@ page import="com.example.service.MyAppMethods" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 24.06.2022
  Time: 1:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>App Page</title>
    <link rel="stylesheet" href="assert/css/userpage.css">

</head>
<body>
<header class="header">
    <div class="container">
        <div class="header_inner">
            <div class="header_logo">DanyaGram</div>

            <nav class="nav">
                <a class="nav_link" href="tem.jsp">Main</a>
                <a class="nav_link" href="#">Lol</a>
                <a class="nav_link" href="userpage.jsp">${name}</a>
                <a class="nav_link" href="logout">Log Out</a>

            </nav>
        </div>
    </div>
</header>
</body>
</html>
