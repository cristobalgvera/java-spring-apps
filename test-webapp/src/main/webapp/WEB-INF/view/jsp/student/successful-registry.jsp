<%--
  Created by IntelliJ IDEA.
  User: crist
  Date: 16-07-2020
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Successful</title>
</head>
<body>
<h1>Registry completed!</h1>
<p>
    Welcome, <strong><c:out value="${student.name} ${student.lastName}"/></strong>, your registry is complete now!
    <br/>
    Your selected subject was <strong><c:out value="${student.subject.toLowerCase()}"/></strong>.
    <br/>
    Your resident city is <strong><c:out value="${student.city}"/></strong>
    <br/>
    You lives with:
    <c:forEach items="${student.livesWith}" var="liveWith">
        <strong><c:out value="[${liveWith}]"></c:out></strong>
    </c:forEach>
    <br/>
    You had <strong><c:out value="${student.age}"/></strong> years old
    <br/>
    Your email is <strong><c:out value="${student.email}"/></strong>
</p>
<%--
    Note:   Model object is transferred to this view via controller. The name was defined previously. To see
            the flow, open StudentController class.
--%>
</body>
</html>
