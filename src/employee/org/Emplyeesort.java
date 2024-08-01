package employee.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

import employee.org.employeeinfo;
import employee.org.employeesortbyid;
import employee.org.Employeesortbysal;

public class Emplyeesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=0;
		Scanner sc=new Scanner(System.in);
		ArrayList<employeeinfo> al=new ArrayList<employeeinfo>();
		
		do {
			System.out.println("press 1 for add data");
			System.out.println("press 2 for sort  data by salary");
			System.out.println("press 3 for sort data by id");
			System.out.println("press 4 for reverse data");
			System.out.println("press 5 for exit from application");
			boolean check=al.isEmpty();
			System.out.println("enter your choice");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("enter employee id");
				int id=sc.nextInt();
				System.out.println("enter employee name");
				String name=sc.next();
				System.out.println("enter employee salary");
				int sal=sc.nextInt();
				employeeinfo emp=new employeeinfo(id,name,sal);
				boolean b=al.add(emp);
				if(b)
				{
					System.out.println("Data added successfully");
				}
				else {
					System.out.println("Data not added");
				}
				
				
			
			break;
			case 2:
				Employeesortbysal obj=new Employeesortbysal();
				Collections.sort(al,obj);
			
				System.out.println("ID\tName\tSalary\t");
				for(employeeinfo info:al)
				{
					
					System.out.println(info.getId()+"\t"+info.getName()+"\t"+info.getSal());
					
				}
				break;
			case 3:
				employeesortbyid obj1=new employeesortbyid();
				Collections.sort(al,obj1);
			
				System.out.println("ID\tName\tSalary");
				for(employeeinfo info:al)
				{
					
					System.out.println(info.getId()+"\t"+info.getName()+"\t"+info.getSal());
					
				}
				
				break;

			case 4:
				ArrayList<employeeinfo> reversedList = new ArrayList<>(al.size());
			    ListIterator<employeeinfo> li = al.listIterator(al.size());
			    while (li.hasPrevious()) {
			        employeeinfo data = li.previous();
			        reversedList.add(data);
			    }

			    
			    System.out.println("Reversed Data:");
			    System.out.println("ID\tName\tSalary");
			    for (employeeinfo info : reversedList) {
			        System.out.println(info.getId() + "\t" + info.getName() + "\t" + info.getSal());
			    }
			    break;
				

				

			}
		}while(ch!=5);
	}
}


