package test.org.app;

import java.util.*;
public class Arraylistsort {

	public static void main(String[] args) {
		ArrayList<Books> b=new ArrayList<Books>();
		
		Books b1=new Books(1,"cpp",48);
		Books b2=new Books(4,"java",84);
		Books b3=new Books(3,"python",90);
		
		b.add(b1);
		b.add(b2);
		b.add(b3);
		
		for(Books d:b)
		{
			System.out.println("id="+d.getId()+"name="+d.getName()+"price="+d.getPrice());
		}
		
		int n=b.size();
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				if((b.get(j).getId())>(b.get(j+1).getId()))
				{
					Books temp=b.get(j);
					b.set(j, b.get(j+1));
					b.set(j+1, temp);
					
					
				}
			}
		}
		
		for(Books d:b)
		{
			System.out.println("id="+d.getId()+"name="+d.getName()+"price="+d.getPrice());
		}
	}


}
