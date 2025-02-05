package test.org.app;

import java.util.*;
public class Student implements Comparable {
	int id;
	String name;
	int rollno;
	
	public Student(int id,String name,int rollno)
	{
		this.id=id;
		this.name=name;
		this.rollno=rollno;
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
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public int compareTo(Object o) {
		
		Student d=(Student)o;
		if(this.id>d.id)
		{
			return 1;
		}
		else if(this.id<d.id)
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}

}
