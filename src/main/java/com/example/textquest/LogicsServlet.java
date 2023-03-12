package com.example.textquest;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

@WebServlet(name = "logicsServlet", value = "/logic")
public class LogicsServlet extends HttpServlet{

String path="/";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        int  choice= Integer.parseInt(req.getParameter("choice"));
        int  level=Integer.parseInt(req.getParameter("level"));
        path="/fail";
         switch (choice){
             case 2: path=choiceOfPath(level);
        }

       resp.sendRedirect(path);
    }

     private String choiceOfPath( int  level){
                switch (level){
                 case 1,2:  return "/fundament.jsp";
             case 3: return "/victory.jsp";
         }
         return null;
     }

}
