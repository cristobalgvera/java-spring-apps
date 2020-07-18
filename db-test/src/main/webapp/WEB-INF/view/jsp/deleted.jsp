<%--
  Created by IntelliJ IDEA.
  User: crist
  Date: 17-07-2020
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Deleted</title>
</head>
<body>
<h1>Successful deleted customer <c:out value="${customer.name} ${customer.lastName}"/></h1>
<a href="<c:url value="/"/>">Home page</a>
</body>
</html>
