package ch01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TimePrint
 */
@WebServlet("/TimePrint")
public class TimePrint extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 응답객체로 생성되는 문서의 문자타입과 문자셋
		response.setContentType("text/html; charset=UTF-8");
		
		// 브라우저 출력
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>현제시간</title></head>");
		out.println("<body>");
		out.println("현제 시간은");
		out.println(new Date());
		out.println("입니다");
		out.println("</body></html>");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
