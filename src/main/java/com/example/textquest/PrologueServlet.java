package com.example.textquest;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "prologueServlet", value = "/")
public class PrologueServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// Создание новой сессии
	HttpSession currentSession = req.getSession(true);

		// Получение имени игрока
	String name = getName(req);
	// счетчик игр

        int current= getCurrent();
	// Добавление в сессию параметров поля (нужно будет для хранения состояния между запросами)
	currentSession.setAttribute("name", name);
	// и значений поля, отсортированных по индексу (нужно для отрисовки крестиков и ноликов)
	currentSession.setAttribute("current", current);

	// Перенаправление запроса на страницу index.jsp через сервер
	getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    private int getCurrent() {
	return 0;
    }


    private String getName(HttpServletRequest request) {
	String click = request.getParameter("click");
	boolean isNumeric = click.chars().allMatch(Character::isDigit);
	return click;
    }

}
