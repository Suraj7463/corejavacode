package test.org.app;

import java.util.*;
public class IntersectionArray {
	
	public static void intersectionCheck(int arr1[],int n1,int arr2[],int n2)
	{
		HashSet<Integer> al=new HashSet<Integer>();
		
		for(int i=0;i<n1;i++)
		{
			for(int j=i+1;j<n2;j++)
			{
				if(arr1[i]==arr2[j])
				{
					al.add(arr1[i]);
				}
			}
		}
		for(Integer d:al)
		{
			System.out.print(d+"\t");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first Array size");
		
		int n1=sc.nextInt();
		int[] arr1=new int[n1];
		
		System.out.println("enter second array size");
		int n2=sc.nextInt();
		int[] arr2=new int[n2];
		
		System.out.println("enter first array element "+n1);
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("enter first array element "+n1);
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		intersectionCheck(arr1,n1,arr2,n2);

	}

}
