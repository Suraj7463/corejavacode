package test.org.app;
import java.util.*;
public class CoparatorArraylist {

	public static void main(String[] args) {
		List<Emp> al=new ArrayList<Emp>();
		
		al.add(new Emp(1,"suraj",300));
		al.add(new Emp(4,"rohit",6000));
		al.add(new Emp(3,"suraj",5000));
		al.add(new Emp(2,"sunil",1000));
		Collections.sort(al);
		
		for(Emp d:al)
		{
			System.out.println("id="+d.getId()+"\tname="+d.getName()+"\tsalary="+d.getSal());
		}
		

	}

}
