<%@ page contentType="text/html;charset=UTF-8"  %>
<html>
<head>
    <title>fail</title>
    <link href="static/main.css" rel="stylesheet">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="<c:url value="static/jquery-3.6.0.min.js"/>"></script>
</head>
<body>
<div class="container">
    <img src='${pageContext.request.contextPath}/img/stock.jpg'>
    <section style="position:absolute;top: 30%;text-align: center; width: 60%; height: auto;">
        <p>У самурая нет цели, только путь.</p>
        <p>Уходишь. Спокойно уходишь. Победа.</p>
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
