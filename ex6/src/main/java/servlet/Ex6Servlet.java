package servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex62")
public class Ex6Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = (int)(Math.random() * 10);
		int num2 = new Random().nextInt(10);
		if (num % 2 == 0) {
			// 偶数
			String url = "/forwarded.jsp";
			request.getRequestDispatcher(url).forward(request, response);
		} else {
			// 奇数
			String url = "/ex6/redirected.jsp";
			response.sendRedirect(url);
		}
	}

}
