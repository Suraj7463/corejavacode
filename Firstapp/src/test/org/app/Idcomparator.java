package test.org.app;

import java.util.Comparator;

public class Idcomparator implements Comparator<BooksStore> {

	@Override
	public int compare(BooksStore o1, BooksStore o2) {
		
		return o1.getId()-o2.getId();
	}

}
