package ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodayMenu
 */
@WebServlet("/TodayMenu")
public class TodayMenu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html><body><center><h3>오늘 점심은</h3></center>");
		// 동일한 이름으로 여러개의 값 파라미터가 전달될 때 배열형태로 전달받음
		String[] values = request.getParameterValues("lunch");
		for(int i = 0; i < values.length; i++)
		{
			out.print("<br>");
			out.print(values[i]);
		}
		
		out.print("이나 먹어야겠다");
		out.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
