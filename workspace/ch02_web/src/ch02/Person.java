package ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Person
 */
@WebServlet("/Person")
public class Person extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String gender = request.getParameter("gender");
		
		String inotice = request.getParameter("inotice");
		String cnotice = request.getParameter("cnotice");
		String dnotice = request.getParameter("dnotice");
		
		String job = request.getParameter("job");
		
		if(inotice == null) inotice = "";
		if(cnotice == null) cnotice = "";
		if(dnotice == null) dnotice = "";
		
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.print("이름:" + name + " (아이디: " + id + ")");
		out.print("암호:" + pass);
		out.print("성별:" + gender);
		out.print("메일수신:" + inotice + " " + cnotice + " " + dnotice);
		out.print("직업:" + job);
		out.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
