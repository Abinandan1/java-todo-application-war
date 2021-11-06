package ToDo;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/addtodo.do")
public class AddTodoServlet extends HttpServlet {
	private TodoService todos = new TodoService(); 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws IOException,ServletException{
		request.getRequestDispatcher("/WEB-INF/views/add-todo.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String newTodo = request.getParameter("todo");
		String category = request.getParameter("category");
		Todo newtodo = new Todo(newTodo,category,new Date());
		if(!newTodo.equals("")) {
			if(todos.contains(newtodo)) {
				System.out.print("True");
				request.getSession().setAttribute("errorPresent", "Already added!!!");
				
			}
			else {
				todos.addTodo(new Todo(newTodo,category,new Date()));
				request.getSession().removeAttribute("errorPresent");
			}
		}
		else {
			request.getSession().removeAttribute("errorPresent");
		}
		
		response.sendRedirect("/listtodo.do");
	}
	
	
}
