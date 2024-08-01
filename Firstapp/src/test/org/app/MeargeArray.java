package test.org.app;

public class MeargeArray implements Arrayoperation {

	private int []a;
	private int []b;
	
	public void acceptArray(int []a,int[]b)
	{
		this.a=a;
		this.b=b;
	}
	@Override
	public int[] getResult() {
		int i;
		int[] c=new int[a.length+b.length];
		
		for( i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int j=0;j<b.length;j++)
		{
			c[i]=b[j];
			i++;
		}
		
		return c;
	}

}
