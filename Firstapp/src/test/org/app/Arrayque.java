package test.org.app;

import java.util.Scanner;

public class Arrayque {
	
	public static void main(String[] args) {
		int max=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number how many element you want to add");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter value"+n);
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		
		int min=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					max=arr[i];
					
				}
			}
			
		}
		System.out.println("max value is"+max);
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					if(max!=arr[i])
					{
						min=arr[i];
					}
				}
			}
			
		}
		System.out.println("secon highest value is"+min);


	}

}
