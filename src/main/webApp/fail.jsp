
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
    <h1 style="text-align:center;">YOU ARE A LOSSER HAHAHA</h1>
    <p><%=Content.getAnswersFail().get(Content.getLevel())%>
    </p>
</section>
</body>
<img style="text-align:right;" src='/img/mario.jpg' alt="mario">
<%@ include file="/reStart.jsp" %>
</html>
