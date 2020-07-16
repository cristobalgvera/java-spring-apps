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
    Welcome, <c:out value="${student.name} ${student.lastName}"/>, your registry is complete now!
</p>
<%--
    Note:   Model object is transferred to this view via controller. The name was defined previously. To see
            the flow, open StudentController class.
--%>
</body>
</html>
