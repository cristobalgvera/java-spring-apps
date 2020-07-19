<%--
  Created by IntelliJ IDEA.
  User: crist
  Date: 18-07-2020
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>User Page</title>
</head>
<body>
<h1>Hi, <c:out value="${customer.name}"/>!</h1>
<c:choose>
    <c:when test="${customerDetail == null}">
        <p>You don't have any details configured yet, <a
                href="<c:url value="/${customer.name.toLowerCase()}/set-detail"/>">wanna set your details?</a></p>
    </c:when>
    <c:otherwise>
        <form:form action="${pageContext.request.contextPath}/${customer.name.toLowerCase()}/update-detail"
                   modelAttribute="customerDetail">
            <form:input path="id" cssStyle="display: none"/>
            Phone number: + <form:input path="phoneNumber" maxlength="15"/> <br/>
            Email:          <form:input path="email" maxlength="25"/> <br/>
            Sex:            <form:input path="sex" maxlength="1"/> <br/>
            <button type="submit">Update</button>
        </form:form>
    </c:otherwise>
</c:choose>
<form:form action="${pageContext.request.contextPath}/${customer.name.toLowerCase()}/logout" method="post">
    <button type="submit">Logout</button>
</form:form>
<form:form action="${pageContext.request.contextPath}/shop" method="post">
    <button type="submit">Shop</button>
</form:form>
</body>
</html>
