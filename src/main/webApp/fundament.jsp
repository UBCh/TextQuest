

<%@ page import="com.example.textquest.Content" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%Content.setLevel(Content.getLevel()+1);%>
<!DOCTYPE html>
<html>
<head>
    <title>fundament</title>
    <link href="/static/main.css" type="text/css" rel="stylesheet" />
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="<c:url value="static/jquery-3.6.0.min.js"/>"></script>
</head>
<body>
<header>
    <h2>Cities</h2>
</header>

<section>
    <nav>
        <ul>
            <li><button type="button" onclick="window.location=<%="\'/logic?choice=1&level=" + Content.getLevel() + "\'"%>" >blue button</button></li>
            <li><button type="button" onclick="window.location=<%="\'/logic?choice=2&level=" + Content.getLevel() + "\'"%>">blue button</button></li>
        </ul>
    </nav>

    <article>
        <h1>terrible question</h1>
        <p><%=Content.getQuestions().get(Content.getLevel())%></p>
        <p> blablabla</p>
        <p><%=Content.getLevel()%></p>
    </article>
</section>

<footer>
     <%@ include file="/basement.jsp" %>
</footer>



</body>
</html>
