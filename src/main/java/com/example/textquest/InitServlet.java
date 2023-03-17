package com.example.textquest;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "initServlet", value = "/init")
public class InitServlet extends HttpServlet {
    int current = 0;
    String name = "";
    int level=1;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

	resp.setContentType("text/html,charset=UTF-8");
	name = req.getParameter("lname");
	current = current + 1;
	HttpSession session = req.getSession();
	String idSession = session.getId();
	session.setAttribute("idSession", idSession);
	session.setAttribute("name", name);
	session.setAttribute("current", current);
	session.setAttribute("level",level);
	resp.sendRedirect("/fundament.jsp");
	    }


}
