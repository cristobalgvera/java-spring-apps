<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: crist
  Date: 16-07-2020
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <%--
        Note: To import CSS and JS files we need to put them into 'src/main/resources/static'.
        This is default route for Spring to looking for static files like images, css or js.
        In this case, these files are well ordered in his respective folders (img, css and js;
        respectively), so we need to add it in 'href' or 'src' path of <link> and <script> tags.

        Also, we can import Bootstrap and JQuery libraries (or any other) firstly adding them into
        pom.xml file. Then just need to map their CSS and JS route and remove any reference to
        '/META-INF/resources'.

        Example: if mapped route is '/META-INF/resources/webjars/(...)/bootstrap.min.css', we must
        use just '/webjars/(...)/bootstrap.min.css' in our 'href' property.

        If you don't want to use CSS or JS libraries via local storage or using the Maven way,
        you can always use their CDN links to refer to them.
    --%>
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/master.css"/>">
    <script type="text/javascript" src="<c:url value="/js/master.js"/>"></script>
    <title>Greetings</title>
</head>
<body>
<%--
    Note: 'param.anyVariableName' use a form input (or any other tag) name to
    request for his value. This case, we go to this page from greet-form.jsp.
    In that view a form has an input named 'name', so if an user write there,
    that value will be the value of 'param.name'. This is an useful way to
    transfer data between pages.
--%>

<%--
    We don't need to change param.name because it's a way to transfer origin data between pages.
    They are different objects with same names.
--%>
<h1><c:out value="Hi, ${param.name}!"></c:out></h1>
<%-- Attribute 'name' it's transferred from GreetController's processFormConcatenated method --%>
<h2><c:out value="Hey, this is the processed message: ${name}"></c:out></h2>

<%-- Just like it happens in CSS and JS references, images need to be well mapped via 'src' property. --%>
<div class="flex">
    <h3>Test image</h3>
    <button onclick="hello()">Press me!</button>
    <img src="<c:url value="/img/test-img.jpg"/>" alt="test-img">
    <img src="${pageContext.request.contextPath}/img/test-img-2.png" alt="test-img-2">
    <img src="<c:url value="/img/test-img-3.png"/>" alt="test-img-3" width="30%" height="30%">
    <img src="<c:url value="/img/test-img-4.jpeg"/>" alt="test-img-4">
</div>
</body>
</html>
