
<%@ page import="com.example.textquest.entities.Content" %>
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
<div class="container">
    <img style="width: 1890px; height: auto;  opacity: 0.3;" src='${pageContext.request.contextPath}/img/end.jpg' >
<section style="position:absolute;top: 30%;  text-align: center; ">
     <p style="font-size: 75px;" id="id_fail"><%=Content.getAnswersFail().get(Content.getLevel())%></p>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
   </section>
    <%@ include file="/reStart.jsp" %>
</div>
</body>
</html>
