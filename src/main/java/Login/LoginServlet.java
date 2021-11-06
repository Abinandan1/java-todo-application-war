package Login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.*;
@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet{
	private UserValidation user = new UserValidation();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws IOException,ServletException{
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws IOException,ServletException{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		boolean isUserValid = user.isUserValid(username, password);
		if(isUserValid) {
			request.getSession().setAttribute("name", request.getParameter("name"));
			response.sendRedirect("/listtodo.do");
		}
		else {
			request.setAttribute("errorMsg", "Invalid Credentials!!!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
			
		}
		
	}
}
