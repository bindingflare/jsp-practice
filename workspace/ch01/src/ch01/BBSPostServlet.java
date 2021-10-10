package ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ch01.model.Board;

/**
 * Servlet implementation class BBSPostServlet
 */
@WebServlet("/Board")
public class BBSPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 파라미터로 넘어온 값의 문자셋을 현제페이지의 문자셋(UTF-8)으로 설정
		request.setCharacterEncoding("UTF-8");
		// 파라미터는 String 타입
		String title = request.getParameter("title");
		String name = request.getParameter("name");
		String content = request.getParameter("content");
		
		// Board객체 생성
		Board board = new Board(title, name, content);
		
		// 출력
		PrintWriter out = response.getWriter();
		response.setContentType("text/html; charset=UTF-8");
		out.print("<html><body>");
		out.print("<h1>게시판</h1>");
		out.print("제목: " + title + "<p>");
		out.print("이름: " + name + "<p>");
		out.print("내용:<br><pre>" + content + "</pre>"); // <p>단원 (줄 단위), <pre>입력한 형테 대로 출력 (/태그 필요)
		out.print("board: " + board);
		out.print("</html></body>");
		
		out.close();
	}

}
