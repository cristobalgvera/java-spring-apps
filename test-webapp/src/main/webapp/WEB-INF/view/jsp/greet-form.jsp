<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: crist
  Date: 16-07-2020
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Greetings</title>
</head>
<body>
<h1>Hi, tell us your name</h1>
<%--
    The action request for a mapping named in controller's zone, specifically in
    GreetController.java file here. This call can be to any @Controller declared,
    so there it's the importance of annotations.
    The method used (GET) can be changed to POST because the @RequestMapping
    annotation doesn't specified a method, anyway, this is a special case because
    you can define the request method in the annotation or even use a @GetMapping
    or @PostMapping annotations to reduce the code.
--%>
<form action="<c:url value="/process-form-concatenated"/>" method="get"> <%-- For this use we change action value to worked mapping reference --%>
    <input type="text" name="name" placeholder="Name">
    <input type="submit">
</form>
</body>
</html>
