package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;

@WebServlet("/game")
public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "WEB-INF/jsp/game.jsp";
		RequestDispatcher d = request.getRequestDispatcher(url);
		d.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String _user = request.getParameter("user");
		int userNum = Integer.parseInt(_user);
		int com = (int) (Math.random() * 9) + 1;
		// int com = new Random().nextInt(9) + 1;
		String msg = null;
		if (userNum == com) {
			msg = "正解です";
		} else if (userNum > com) {
			msg = "大きすぎます";
		} else {
			msg = "小さすぎます";
		}
		User user = new User(userNum, msg);
		request.setAttribute("user", user);
		String url = "WEB-INF/jsp/game.jsp";
		request.getRequestDispatcher(url)
		       .forward(request, response);
	}
}
