package com.example.textquest.controller;

import com.example.textquest.entities.Content;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Console;
import java.io.IOException;

import static java.io.Console.*;
import static java.lang.System.out;

@WebServlet(name = "logicsServlet", value = "/logic")
public class LogicsServlet extends HttpServlet{

    String path="/";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String value = req.getParameter("choice");
        int choice=0;
        if (Content.rightButton.containsValue(value)) { choice=2;}
       else if (Content.buttonWong.containsValue(value)){choice=1;}

//        int choice= Integer.parseInt(req.getParameter("choice"));
        path="/fail";
           switch (choice){
           case 2: path=choiceOfPath(Content.getLevel());
       }
        resp.sendRedirect(path);

    }




     private String choiceOfPath( int  level) {
         switch (level) {
             case 1,2: {
                 Content.plusLevel();
                 return "/fundament.jsp";
             }
                        case 3:
                 return "/victory.jsp";
         }
         return null;
     }


}
