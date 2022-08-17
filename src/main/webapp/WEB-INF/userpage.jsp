<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 18.06.2022
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>HomePage</title>

    <link rel="stylesheet" href="../assert/css/userpage.css">
<%--    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">--%>
<%--    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js">--%>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<br><br>

<br><br>

<header class="header">
    <div class="container">
        <div class="header_inner">
            <div class="header_logo">DanyaGram</div>

            <nav class="nav">
                <a class="nav_link" href="tem.jsp">Main</a>
                <a class="nav_link" href="app_page.jsp">App</a>
                <a class="nav_link" href="frontController?command=logout">Sing Out</a>
                <p class="nav_link">${user.name}</p>
            </nav>
        </div>
    </div>
</header>
<h1>Welcome to your page!</h1>
<br><br>
<div class="mainInfo">
    <h1>${user.name}</h1>
    <h1>${user.lastname}</h1>
    <h2>${user.age}</h2>
    <h2>${user.gender}</h2>
    <h2>${user.phoneNumber}</h2>
    <h2>${user.country}</h2>
</div>

<a href="${pageContext.request.contextPath}/delete/${user.id}">DELETE ACC</a>
<a href="EditProf.jsp">Edit prof</a>
</body>
</html>
