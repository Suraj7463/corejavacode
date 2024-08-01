package test.org.app;

import java.util.HashSet;
import java.util.Set;

public class UnionOfArray implements Arrayoperation {
	private int a[];
	private int b[];
	int i;
	public void acceptArray(int a[],int b[])
	{
		this.a=a;
		this.b=b;
	}
	@Override
	public int[] getResult() {
		Set<Integer> s=new HashSet<Integer>();
		
		for(int value:a)
		{
			s.add(value);
		}
		for(int value:b)
		{
			s.add(value);
		}
		
		int[] union=new int[s.size()];
		i=0;
		for(int value:s)
		{
			union[i++]=value;
		}
		
		
		return union;
	}

}
