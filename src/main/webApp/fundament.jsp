


<%@ page import="com.example.textquest.entities.Content" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>fundament</title>
    <link href="/static/main.css" type="text/css" rel="stylesheet" />
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>

    <script src="<c:url value="static/jquery-3.6.0.min.js"/>"></script>
</head>
<body>
<header>
    <h2>ВЕЛИКАЯ ПИРАМИДА САГИ</h2>
</header>

<section>
    <nav>
        <ul>
            <br>
            <li>
                <form action="${pageContext.request.contextPath}/logic" method="POST">
                    <label for="choice">сделай свой выбор:</label><br>
                    <select id="choice" name="choice">
                        <option >${trueChoise}</option>
                        <option >${falseChoise}</option>
                    </select>
                    <input type="submit" id="submit" value="смело шагай->">
                </form>

            </li>
        </ul>
    </nav>

    <article>
        <p id="id_content"><%=Content.getQuestions().get(Content.getLevel())%>
        </p>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>

    </article>
</section>

<footer>
    <h3 id="idSession">ID session : ${idSession}</h3>
    <h3 id="player_name">Player name : ${name}</h3>
    <h3 id="current_game">Current game: ${current}</h3>

</footer>
</body>
</html>
