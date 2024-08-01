package test.org.app;
import java.util.*;
public class ClientApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int[] arr1=new int[n];
		System.out.println("enter array value"+n);
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("enter second array size");
		n=sc.nextInt();
		int[] arr2=new int[n];
		
		System.out.println("enter array value"+n);
		for(int i=0;i<n;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		Arrayoperation operation=null;
		
		System.out.println("1.mearge array");
		System.out.println("2.union array");
		
		System.out.println("enter your choice");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			operation=new MeargeArray();
			break;
			
		case 2:
			operation=new UnionOfArray();
			break;
		default:
			System.out.println("invalid input");
			break;
			
		}
		
		operation.acceptArray(arr1, arr2);
        int[] result = operation.getResult();

        System.out.println("Result:");
        for (int value : result) {
            System.out.print(value + " ");
        }
		

	}

	
}
