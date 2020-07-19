<%--
  Created by IntelliJ IDEA.
  User: crist
  Date: 18-07-2020
  Time: 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Set Detail</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/${customer.name.toLowerCase()}/create-detail"
           modelAttribute="customerDetail">
    <form:input path="id" cssStyle="display: none"/>
    Phone number: + <form:input path="phoneNumber" maxlength="15"/> <br/>
    Email:          <form:input path="email" maxlength="25"/> <br/>
    Sex:            <form:input path="sex" maxlength="1"/> <br/>
    <button type="submit">Set</button>
</form:form>
</body>
</html>
