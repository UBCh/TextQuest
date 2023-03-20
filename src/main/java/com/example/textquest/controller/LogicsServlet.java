package com.example.textquest.controller;

import com.example.textquest.entities.Content;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "logicsServlet", value = "/logic")
public class LogicsServlet extends HttpServlet{

String path="/";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
              resp.setContentType("text/html");
               int  choice= Integer.parseInt(req.getParameter("choice"));
        int  level=Integer.parseInt(req.getParameter("level"));
        path="/fail";
         switch (choice){
             case 2: path=choiceOfPath(level);
        }
            resp.sendRedirect(path);

    }

     private String choiceOfPath( int  level) {
         switch (level) {
             case 1: {
                 Content.setLevel(level + 1);
                 return "/fundament.jsp";
             }
             case 2: {
                 Content.setLevel(level + 1);
                 return "/fundament.jsp";
             }
             case 3:
                 return "/victory.jsp";
         }
         return null;
     }


}
