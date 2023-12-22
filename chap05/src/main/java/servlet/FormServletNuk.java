package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormServletNuk")
public class FormServletNuk extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		System.out.println("name:" + name + " gender:" + gender);
		
		List<String> errorMsg = new ArrayList<>();

		if (name == null || name.length() == 0) {
			errorMsg.add("名前が入力されていません");
		}
		if (gender == null || gender.length() == 0) {
			errorMsg.add("性別が入力されていません");
		}
		String msg = null;
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!doctype html>");
		out.println("<html><head><meta charset='UTF-8'>");
		out.println("<title>ユーザー登録結果</title>");
		out.println("</head><body>");
		if (errorMsg.size() > 0) {
			for (String msg2 : errorMsg) {
				out.println(msg2);
			}
		} else {
			msg = name + ":" + gender;
			out.println("<p>" + msg + "</p>");
		}
		out.println("</body></html>");
	
	}

}
