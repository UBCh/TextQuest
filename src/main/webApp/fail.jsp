
<%@ page import="com.example.textquest.Content" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>fail</title>
    <link href="static/main.css" rel="stylesheet">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="<c:url value="static/jquery-3.6.0.min.js"/>"></script>
</head>
<body>
<section>
       <article>
        <h1>YOU ARE A LOSSER HAHAHA</h1>
        <p><%=Content.getAnswersFail().get(Content.getLevel())%></p>
        <p> blablabla</p>
    </article>
</section>

<footer>
    <p>Footer</p>
    <%@ include file="/reStart.jsp" %>
</footer>
</body>
</html>
