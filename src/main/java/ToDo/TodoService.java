package ToDo;

import java.util.ArrayList;
import java.util.List;




public class TodoService {
	private static List<Todo> list = new ArrayList<>();
	
	public List<Todo> getTodos(){
		return list;
	}
	public void addTodo(Todo todo) {
		list.add(todo);
	}
	public void deleteTodo(Todo todo) {
		list.remove(todo);
	}
	public boolean contains(Todo newTodo) {
		// TODO Auto-generated method stub
		if(list.contains(newTodo)) {
			return true;
		}
		return false;
	}
	
}
