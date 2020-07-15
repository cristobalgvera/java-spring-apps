<%--
  Created by IntelliJ IDEA.
  User: crist
  Date: 15-07-2020
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<h1>Employee 1: ${employee}</h1>
<h1>Employee 2: ${employee2}</h1>

<p>Employee 1: ${employee.report}</p>
<p>Employee 2: ${employee2.report}</p>

<p>Employee 1: ${employee.report.readReport()}</p>
<p>Employee 2: ${employee2.report.readReport()}</p>
</body>
</html>
