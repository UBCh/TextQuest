


<%@ page import="com.example.textquest.Content" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<% int temp=Content.getLevel();
    if (temp>2){Content.setLevel(1);}
    else {Content.setLevel(temp+1);}%>
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
            <li>
                <button type="button"
                        onclick="window.location=<%="\'/logic?choice=1&level=" + Content.getLevel() + "\'"%>"><%=Content.getButtonWong().get(Content.getLevel())%>
                </button>
            </li>
            <li>
                <button type="button"
                        onclick="window.location=<%="\'/logic?choice=2&level=" + Content.getLevel() + "\'"%>"><%=Content.getRightButton().get(Content.getLevel())%>
                </button>
            </li>
        </ul>
    </nav>

    <article>
        <h1>terrible question</h1>
        <p><%=Content.getQuestions().get(Content.getLevel())%>
        </p>
    </article>
</section>

<footer>
    <h1 id="idSession">ID session : ${idSession}</h1>
    <h2 id="player_name">Player name : ${name}</h2>
    <h2 id="current_game">Current game: ${current}</h2>

</footer>



</body>
</html>
