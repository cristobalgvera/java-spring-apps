<%--
  Created by IntelliJ IDEA.
  User: crist
  Date: 16-07-2020
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
    Spring provide form's tags to execute methods to variables requested
--%>
<html>
<head>
    <title>Registry</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/student/process-form" modelAttribute="student">
    <%--
        Form input tag had a property called 'path' and there the variable is loaded.
        This tag call getter and setter methods of variable when is needed. The
        value of 'path' must be the name of getter and setter methods without get
        or set characters in camel.

        Example: if getter and setter methods are getWhateverYouWant() and
        setWhateverYouWant(...), path value must be 'whateverYouWant'.
    --%>
    Name: <form:input path="name"></form:input>
    <br/>
    Last name: <form:input path="lastName"></form:input>
    <br/>
    Resident city:
    <br/>
    <form:radiobuttons path="city" items="${cities}"/>
    <br/>
    Subject:
    <br/>
    <form:select path="subject">
        <form:options items="${subjects}"></form:options>
    </form:select>
    <br/>
    Lives with:
    <br/>
    <form:checkboxes path="livesWith" items="${livesWith}"/>
    <br/>
    <input type="submit" value="Register">
</form:form>
</body>
</html>
