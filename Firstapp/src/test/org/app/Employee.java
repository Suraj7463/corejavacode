package test.org.app;

public class Employee {
	private int id;
	private String name;
	private int run;
	
	public Employee(int id,String name,int run)
	{
		this.id=id;
		this.name=name;
		this.run=run;
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
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	
	public String toString() {
	    return
	            "id=" + id +
	            ", name='" + name + '\'' +
	            ", run=" + run ;
	      
	}

}
