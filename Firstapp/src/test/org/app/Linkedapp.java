package test.org.app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Linkedapp {

	public static void main(String[] args) {
		LinkedHashMap<Integer,Employee> lm=new LinkedHashMap<Integer,Employee>();
		
		Employee e=(new Employee(1,"suraj",5000));
		Employee e1=(new Employee(3,"rushi",6000));
		Employee e2=(new Employee(2,"ganesh",20000));
		
		lm.put(1,e);
		lm.put(3,e1);
		lm.put(2,e2);
		
	
		List<Map.Entry<Integer, Employee>> entries = new ArrayList<>(lm.entrySet());
        entries.sort(Comparator.comparingInt(entry -> entry.getValue().getId()));

        // Insert the sorted entries back into a new LinkedHashMap
        LinkedHashMap<Integer, Employee> sortedLinkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Employee> entry : entries) {
            sortedLinkedHashMap.put(entry.getKey(), entry.getValue());
        }
        
        for (Map.Entry<Integer, Employee> entry : sortedLinkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
		
//		for(Map.Entry<Integer,Employee> d:lm.entrySet())
//		{
//			System.out.println(d.getKey()+"\t"+d.getValue());
//		}
	}

}
