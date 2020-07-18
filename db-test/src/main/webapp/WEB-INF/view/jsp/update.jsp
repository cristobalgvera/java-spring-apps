<%--
  Created by IntelliJ IDEA.
  User: crist
  Date: 17-07-2020
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<h1>Update your registry</h1>
<form:form action="${pageContext.request.contextPath}/update" modelAttribute="customer">
    <input type="hidden" name="id" value="${customer.id}">
    Name:       <form:input path="name"/>       <br/>
    Last name:  <form:input path="lastName"/>   <br/>
    Address:    <form:input path="address"/>    <br/>
    <button type="submit">Update me!</button>
</form:form>
<a href="<c:url value="/"/>">Home page</a>
</body>
</html>
