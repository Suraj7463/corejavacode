package test.org.app;
import java.util.*;
public class StringDuplicate {
	LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	Scanner xyz = new Scanner(System.in);
	System.out.println("enter string");
	
	String s = xyz.nextLine();
	for (int i = 0; i < s.length(); i++) {
		  Integer count= map.get(s.charAt(i));
		  if(count==null) {
			  count=new Integer(0);
		  }
		  ++count;
		  map.put(s.charAt(i), count);
	}
	System.out.println("Display occurence ");
	Set<Map.Entry<Character, Integer>> mfo=map.entrySet();
	for(Map.Entry<Character,Integer> m:mfo) {
		System.out.println(m.getKey()+"\t"+m.getValue());
	}


}
}

