package ToDo;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/delete-todo.do")
public class DeleteTodoServlet extends HttpServlet {
	private TodoService todos = new TodoService(); 
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		todos.deleteTodo(new Todo(request.getParameter("todo"),request.getParameter("category"),new Date()));
		response.sendRedirect("/listtodo.do");
	}
	
	
	
}
