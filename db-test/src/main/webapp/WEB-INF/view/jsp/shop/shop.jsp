<%--
  Created by IntelliJ IDEA.
  User: crist
  Date: 18-07-2020
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Shop</title>
</head>
<body>
<h1>Good shopping, <c:out value="${sessionScope.customer.name}"/></h1>
<form:form action="${pageContext.request.contextPath}/shop/purchase" modelAttribute="order">
    Quantity: <form:input path="quantity" maxlength="10"/>
    Payment method: <form:radiobuttons path="paymentMethod" items="${paymentMethods}"/>
    <br/>
    <button type="submit">Buy</button>
</form:form>
<a href="<c:url value="/${sessionScope.customer.name}"/>">Back</a>
<hr/>
<h2>Your previous purchases</h2>
<c:choose>
    <c:when test="${previousOrders == null || previousOrders.isEmpty()}">
        <p>You don't have previous purchases.</p>
    </c:when>
    <c:otherwise>
        <c:set var="i" value="${0}"/>
        <c:forEach items="${previousOrders}" var="order">
            <c:set var="i" value="${i+1}"/>
            <p>
                <c:out value="${i}"/>
                <c:out value="${order}"/>
            </p>
        </c:forEach>
    </c:otherwise>
</c:choose>
</body>
</html>
