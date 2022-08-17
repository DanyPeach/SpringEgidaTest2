<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 27.06.2022
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Prof</title>
    <link rel="stylesheet" href="assert/css/registrationstyle.css">
</head>
<body>
<h1 style="text-align: center; padding-bottom: 50px">Welcome to the TMS</h1>
<div class="form_div">
    <form action="frontController" method="POST">
        <input type="hidden" name="command" value="edit">
        <input class="signup-text-input" name="username" placeholder="Your Name" value="${name}" required/>
        <br><br>
        <input class="signup-text-input" name="userlastname" placeholder="Your Last Name"value="${lastName}"  required/>
        <br><br>
        <input class="signup-text-input" name="userage" placeholder="Your Age" value="${age}" required/>
        <br><br>
        <input class="signup-text-input" name="usercountry" placeholder="Your Country" value="${country}" required/>
        <br><br>
        <input class="signup-text-input" name="userphone" placeholder="Your Phone" value="${phone}" required/>
        <br><br>
        <input class="signup-text-input" name="login" placeholder="Your Login" value="${login}"/>
        <br><br>

        <a href="/draft/tem.jsp" style="text-align: left; color: #FFA07A; text-decoration-color: coral" >Exit</a>
        <br><br>
        <input class="signup-button" type="submit" value="Submit" />
    </form>
</div>
</body>
</html>
