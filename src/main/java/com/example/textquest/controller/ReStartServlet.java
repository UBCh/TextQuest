package com.example.textquest.controller;

import com.example.textquest.entities.Content;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "restartServlet", value = "/reStart")
public class ReStartServlet extends HttpServlet {



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

	response.setContentType("text/html;charset=UTF-8");
	 Content.level=0;
	response.sendRedirect("/index.jsp");
    }


}
