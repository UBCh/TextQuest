

<%@ page import="com.example.textquest.Content" %>
<%@ page import="com.example.textquest.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%User.getInstance().setLevel(User.getInstance().getLevel()+1);%>
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
            <li><button type="button" onclick="window.location=<%="\'/logic?choice=1&level=" + User.getInstance().getLevel() + "\'"%>" >blue button</button></li>
            <li><button type="button" onclick="window.location=<%="\'/logic?choice=2&level=" + User.getInstance().getLevel() + "\'"%>">blue button</button></li>
        </ul>
    </nav>

    <article>
        <h1>terrible question</h1>
        <p><%=Content.getQuestions().get(User.getInstance().getLevel())%></p>
        <p> blablabla</p>
        <p><%=User.getInstance().getLevel()%></p>
    </article>
</section>

<footer>
     <%@ include file="/basement.jsp" %>
</footer>



</body>
</html>
