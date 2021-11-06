package ToDo;

import java.util.Objects;
import java.util.Date;

public class Todo {
	private String name; //Name of the ToDo
	private String category; //Category of the ToDo
	private Date date; //Date added
	public Todo(String name,String category,Date date) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.category = category;
		this.date = date;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return Objects.equals(name, other.name);
	}
	
}
