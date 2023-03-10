package com.example.textquest;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "VictoryServlet", value = "/victory")
public class VictoryServlet  extends HttpServlet {

    String title ="victory";
    String header="you outwitted everyone and ate a fish and rode a bicycle";



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

	response.setContentType("text/html;charset=UTF-8");
	PrintWriter out =  response.getWriter();
	try {
	    out.println("<html>");
	    out.println("<head> <title>"+title+"</title> </head>");
	    out.println("<body>");
	    out.println("<h1 >"+title+" </h1>");
	    out.println("<h1 >"+header+" </h1>");
	    out.println("</body>");
	    out.println("</html>");
	} finally {
	    out.close();
	}
    }


}
