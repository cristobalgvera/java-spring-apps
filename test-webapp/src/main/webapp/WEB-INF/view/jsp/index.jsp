<%--
  Created by IntelliJ IDEA.
  User: crist
  Date: 16-07-2020
  Time: 9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<h1>Hello friend!</h1>
<p>Wanna a greet? <a href="<c:url value="/show-form"/>">Pulse here</a></p>
<%--
    The <a> tag shows the mapping route defined previously on controllers, specifically on
    GreetController.java file on @RequestMapping("/show-form")
--%>
</body>
</html>
