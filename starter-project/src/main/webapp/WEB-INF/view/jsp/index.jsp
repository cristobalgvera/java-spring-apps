<%--
  Created by IntelliJ IDEA.
  User: crist
  Date: 21-07-2020
  Time: 21:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/index/test" method="post" modelAttribute="persona">
    First name: <form:input path="name"/></br>
    Last name:  <form:input path="lastName"/></br>
    Age:        <form:input path="age"/></br>
    Sex: </br>  <form:radiobutton path="sex" value="${true}" label="Woman"/>
                <form:radiobutton path="sex" value="${false}" label="Man"/>
    </br><button type="submit">Register</button>
</form:form>
</body>
</html>
