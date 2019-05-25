<%--
  Created by IntelliJ IDEA.
  User: Wojtek
  Date: 25.05.2019
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cookies</title>
</head>
<body>
<%
    if (request.getCookies() != null) {
        for (Cookie cookie : request.getCookies()) { %>

</body>
</html>
