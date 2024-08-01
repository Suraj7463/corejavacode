package test.org.app;

public class Firstapp {

	public static void main(String[] args) {
		int i,j,t,l=0;
		int k=1;	
		int m=20;
		for(i=1;i<=10;i++)
		{ 
			l=k;
			int flag=1;
			for(j=1;j<=20;j++)
			{
			
				if(j<=i)
				{
					System.out.print(j);
				}
				else if(j>=m)
				{
					if(flag==1)
					{
					for(k=l;k>=1;k--)
					{
						
						System.out.print(k);
					}
					flag=0;
					}
					
				}
				else {
					System.out.print(" ");
				}
			}
			k=l;
			k++;
			
			m--;
			
			
			System.out.println();
		}
 
		
}
}
