<%--
  Created by IntelliJ IDEA.
  User: crist
  Date: 17-07-2020
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Find</title>
    <style>
        .form-div {
            box-sizing: border-box;
            display: flex;
            align-items: center;
            margin: auto;
            width: 60%;
        }

        .form-div-customer {
            width: 50%;
            padding: 5%;
        }

        .form-div-action {
            width: 13%;
            padding: 5%;
        }
    </style>
</head>
<body>
<h1>
    All customers <c:out value="${param.name != null ? String.format('named: %s', param.name) : ''}"/>
</h1>
<c:choose>
    <c:when test="${customers.isEmpty() || customers == null}">
        <p>There are no customers with that name</p>
    </c:when>
    <c:otherwise>
        <c:forEach items="${customers}" var="customer">
            <form:form action="${pageContext.request.contextPath}/action" method="post">
                <input type="hidden" name="id" value="${customer.id}">
                <hr width="50%"/>
                <div class="form-div">
                    <div class="form-div-customer">
                        <c:out value="${customer.toString()}"/>
                    </div>
                    <div class="form-div-action">
                        <button type="submit" name="action" value="update">UPDATE</button>
                    </div>
                    <div class="form-div-action">
                        <button type="submit" name="action" value="delete">DELETE</button>
                    </div>
                </div>
                <hr width="50%"/>
            </form:form>
        </c:forEach>
    </c:otherwise>
</c:choose>
<br/>
<a href="<c:url value="/"/>">Back</a>
</body>
</html>
