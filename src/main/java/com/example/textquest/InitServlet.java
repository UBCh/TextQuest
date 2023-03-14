package com.example.textquest;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "initServlet", value = "/init")
public class InitServlet extends HttpServlet {
    int current = 0;
    String name = "";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	name = req.getParameter("lname");
	current = current + 1;
	HttpSession session = req.getSession();
	String idSession = session.getId();
	Content.setCurrent(current);
	Content.setName(name);
	Content.setIdSession(idSession);
	resp.sendRedirect("/fundament.jsp");
    }


}
