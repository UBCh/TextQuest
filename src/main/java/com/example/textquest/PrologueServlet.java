package com.example.textquest;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "prologueServlet", value = "/init")
public class PrologueServlet extends HttpServlet {
    int current = 0;
    String name = "";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	name = req.getParameter("lname");
	current = current + 1;
	Content.setCurrent(current);
	Content.setName(name);
	resp.sendRedirect("/fundament.jsp");
    }

}
