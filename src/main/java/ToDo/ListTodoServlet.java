package ToDo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/listtodo.do")
public class ListTodoServlet extends HttpServlet {
	private TodoService todos = new TodoService(); 
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		request.setAttribute("todos", todos.getTodos());
		request.getRequestDispatcher("/WEB-INF/views/listtodos.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.sendRedirect("/addtodo.do");
	}
	
	
	
	
}
