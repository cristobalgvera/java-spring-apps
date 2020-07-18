<%--
  Created by IntelliJ IDEA.
  User: crist
  Date: 17-07-2020
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<h1>Add yourself to our database</h1>
<form:form action="${pageContext.request.contextPath}/added" modelAttribute="customer">
    Name:       <form:input path="name"/>       <br/>
    Last name:  <form:input path="lastName"/>   <br/>
    Address:    <form:input path="address"/>    <br/>
    <button type="submit">Add me!</button>
</form:form>
<hr/>
<h1>Find someone on our database</h1>
<form action="<c:url value="/find"/>" method="get">
    Name:       <input name="name">
    <button type="submit">Search</button>
</form>
<form action="<c:url value="/find-all"/>">
    <button type="submit">Search all</button>
</form>
<hr/>
</body>
</html>
