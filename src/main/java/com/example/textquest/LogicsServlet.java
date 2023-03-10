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

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//	здесь  в зависимости от нажатой кномпки устанавливаются значения переменных и форвард на нужную страницу
//        resp.setContentType("text/html;charset=UTF-8");
//        PrintWriter out =  resp.getWriter();
//        try {
//            out.println("<html>");
//            out.println("<body>");
//            out.println("<h1 >"+"LOGIK"+" </h1>");
//           out.println("</body>");
//            out.println("</html>");
//        } finally {
//            out.close();
//        }

        MorpheusServlet.setTitle("BLABLABLA");

        String path = "/level";
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        requestDispatcher.forward(req, resp);

    }
}
