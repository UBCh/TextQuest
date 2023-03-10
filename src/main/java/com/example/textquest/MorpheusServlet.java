package com.example.textquest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "VictoryServlet", value = "/level")
public class MorpheusServlet extends HttpServlet {

    static String title ="terrible question";
   Integer level=1;

    public static void setTitle(String blablabla) {
	title=blablabla;
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

	response.setContentType("text/html;charset=UTF-8");

	PrintWriter out =  response.getWriter();
	try {
	    out.println("<html>");
	    out.println("<head> <title>"+"terrible question"+"</title> </head>");
	    out.println("<body>");
	   out.println("<h1 >"+title+" </h1>");
	    out.println( "<form action=\"http://localhost:8080/logic\">" );
	    out.println("<button type=" +"submit"+ ">Click Me!</button>");
	  out.println( "</form>");
	    out.println("</body>");
	    out.println("</html>");
	} finally {
	    out.close();
	}
	request.setAttribute("name", "Tom");
	request.setAttribute("age", 34);

	getServletContext().getRequestDispatcher("/basic.jsp").forward(request, response);
    }



}
