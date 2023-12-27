package servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Player;
import model.SetResultLogic;

@WebServlet("/game")
public class JankenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "WEB-INF/jsp/janken.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int userHand = Integer.parseInt(request.getParameter("hand"));
		int comHand = new Random().nextInt(3);
		Player player = new Player(userHand, comHand);
		SetResultLogic logic = new SetResultLogic();
		logic.execute(player);
		request.setAttribute("player", player);
		String url = "WEB-INF/jsp/janken.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

}
