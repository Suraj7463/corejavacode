package test.org.app;

import java.util.*;
public class StudentClient {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(1,"sura",3));
		al.add(new Student(4,"rohit",2));
		al.add(new Student(2,"mahesh",1));
		
		
		Collections.sort(al);
		for(Student d:al)
		{
			System.out.println(d.getId()+"\t"+d.getName()+"\t"+d.getRollno());
		}

	}

}
