package test.org.app;

import java.util.ArrayList;
import java.util.*;
public class ArrayBooks {

	public static void main(String[] args) {
		List<BooksStore> al=new ArrayList<BooksStore>();
		al.add(new BooksStore(1,300,"cpp"));
		al.add(new BooksStore(3,500,"python"));
		al.add(new BooksStore(2,800,"java"));
		System.out.println(al);
		Collections.sort(al,new Idcomparator());
		System.out.println(al);

	}

}
