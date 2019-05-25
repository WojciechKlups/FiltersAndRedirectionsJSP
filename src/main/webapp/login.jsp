<%--
  Created by IntelliJ IDEA.
  User: Wojtek
  Date: 25.05.2019
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login panel</title>
</head>
<body>
<h1>Witaj w panelu logowania</h1>
<h2>Twój adres IP to: <%= request.getRemoteAddr()%></h2>
<a href="admin.jsp">Admin panel</a>
</body>
</html>
