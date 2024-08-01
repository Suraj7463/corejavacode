package test.org.app;

public interface Arrayoperation {
	default void acceptArray(int a[],int b[])
	{
		System.out.println("array accepted");
	}
	
	int[] getResult();

}
