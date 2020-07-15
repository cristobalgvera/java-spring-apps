<%--
  Created by IntelliJ IDEA.
  User: crist
  Date: 15-07-2020
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<h1>Reporte ${employee}</h1>
<p>${employee.report.readReport()}</p>
</body>
</html>
