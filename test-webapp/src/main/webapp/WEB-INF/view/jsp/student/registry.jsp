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
    <%-- Below tag shows, if is necesary, the error message setted on POJO class --%>
    <form:errors path="name" cssStyle="color: red"/>
    <br/>
    Last name: <form:input path="lastName"></form:input>
    <form:errors path="lastName" cssStyle="color: red"/>
    <br/>
    Resident city:
    <br/>
    <form:radiobuttons path="city" items="${cities}"/>
    <form:errors path="city" cssStyle="color: red"/>
    <br/>
    Subject:
    <br/>
    <form:select path="subject">
        <form:options items="${subjects}"></form:options>
    </form:select>
    <form:errors path="subject" cssStyle="color: red"/>
    <br/>
    Lives with:
    <br/>
    <form:checkboxes path="livesWith" items="${livesWith}"/>
    <br/>
    Age: <form:input path="age"/>
    <form:errors path="age" cssStyle="color: red"/>
    <br/>
    Email: <form:input path="email"/>
    <form:errors path="email" cssStyle="color: red"/>
    <br/>
    <input type="submit" value="Register">
</form:form>
</body>
</html>
