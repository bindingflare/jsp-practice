package ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTest2
 */
@WebServlet("/test2")
public class ServletTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTest2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Hello: ").append(request.getContextPath());
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		PrintWriter out = response.getWriter();
		
		// 브라우저
		out.println("id: " + id);
		out.println("pwd: " + pwd); 
		// 콘솔
		System.out.println("id: " + id);
	}

}
