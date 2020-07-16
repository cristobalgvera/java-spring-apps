<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: crist
  Date: 16-07-2020
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Greetings</title>
</head>
<body>
<%--
    Note: 'param.anyVariableName' use a form input (or any other tag) name to
    request for his value. This case, we go to this page from greet-form.jsp.
    In that view a form has an input named 'name', so if an user write there,
    that value will be the value of 'param.name'. This is an useful way to
    transfer data between pages.
--%>

<%--
    We don't need to change param.name because it's a way to transfer origin data between pages.
    They are different objects with same names.
--%>
<h1><c:out value="Hi, ${param.name}!"></c:out></h1>
<%-- Attribute 'name' it's transferred from GreetController's processFormConcatenated method --%>
<h2><c:out value="Hey, this is the processed message: ${name}"></c:out></h2>
</body>
</html>
