<%--
  Created by IntelliJ IDEA.
  User: crist
  Date: 17-07-2020
  Time: 18:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Added</title>
</head>
<body>
<c:forEach items="${customers}" var="customer">
    <c:out value="${customer.toString()}"/><br/>
</c:forEach>
<a href="<c:url value="/"/>">Back</a>
</body>
</html>
