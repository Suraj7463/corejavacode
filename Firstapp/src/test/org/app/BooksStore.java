package test.org.app;

import java.util.Comparator;
import java.util.Objects;

public class BooksStore {
	private int id;
	private int sal;
	private String name;
	
	public BooksStore(int id,int sal,String name)
	{
		this.id=id;
		this.sal=sal;
		this.name=name;
	}
	@Override
	public String toString() {
		return "BooksStore [id=" + id + ", sal=" + sal + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, sal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BooksStore other = (BooksStore) obj;
		return id == other.id && Objects.equals(name, other.name) && sal == other.sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
