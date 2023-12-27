package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Player;

@WebServlet("/game")
public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "WEB-INF/jsp/game.jsp";
		RequestDispatcher d = request.getRequestDispatcher(url);
		d.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Integer com = (Integer) session.getAttribute("com");
		// System.out.println("com:" + com);
		if (com == null) {
			com = (int) (Math.random() * 99) + 1;
			// int com = new Random().nextInt(9) + 1;
			session.setAttribute("com", com);
		}

		String _user = request.getParameter("user");
		int user = Integer.parseInt(_user);
		String msg = null;
		String gazo = null;
		if (user == com) {
			msg = "正解です";
			com = (int) (Math.random() * 99) + 1;
			// int com = new Random().nextInt(9) + 1;
			session.setAttribute("com", com);
			gazo = request.getContextPath() + "/img/atari.png";
		} else if (user > com) {
			msg = "大きすぎます";
			gazo = request.getContextPath() + "/img/toobig.png";
		} else {
			msg = "小さすぎます";
			gazo = request.getContextPath() + "/img/toosmall.png";
		}
		request.setAttribute("gazo", gazo);
		Player player = new Player(user, msg);
		request.setAttribute("player", player);
		String url = "WEB-INF/jsp/game.jsp";
		request.getRequestDispatcher(url)
		       .forward(request, response);
		
	}

}
