package test.org.app;
import java.util.*;
public class Hashpro {

	public static void main(String[] args) {
		
		HashMap<Integer,String> m=new HashMap<>();
		m.put(1, "suraj");
		m.put(2, "ganesh");
		m.put(3, "sohel");
		
		for(Map.Entry<Integer, String> e:m.entrySet()) 
		{
			System.out.println("id="+e.getKey()+"\tname="+e.getValue());
		}
		
		if(m.containsKey(2))
		{
			System.out.println("id present");
		}
		else
		{
			System.out.println("id not present");
		}
		
	}

}
