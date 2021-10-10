package ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 패러미터 전달법은 무조건 String타입
		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int total = num1 + num2;
		
		// 출력
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body><h1>두 수의 합</h1>");
		out.print(str1 + "+" + str2 + " = " + total);
		out.print("</body></html>");
		
		// 자원 헤제
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
