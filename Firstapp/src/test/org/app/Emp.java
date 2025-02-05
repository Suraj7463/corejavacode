package test.org.app;

public class Emp implements Comparable<Emp> {
	private int id;
	private String name;
	private int sal;
	
	public Emp(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public int compareTo(Emp o) {
		
		return this.name.compareTo(o.name);
	
	}
	
	public String toString()
	{
		return "id="+id+"\tname="+name+"\tsal="+sal;
	}

}
