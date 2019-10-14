package ArrayListP;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		ArrayList ar= new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		System.out.println(ar.size());
		ar.add(60);
		ar.add(60);
		
		System.out.println(ar.size());
		
		for(int i=0; i<ar.size();i++)
		{
			System.out.println(ar.get(i));
			
		}
		
		System.out.println("Indev Value" +ar.get(1));
		
		ArrayList<Integer> ar2= new ArrayList<Integer>();
		
		ar2.add(122);
		ar2.add(124);
		
		System.out.println(ar2.get(1));
		
		ArrayList<String> ar3= new ArrayList<String>();
		
		ar3.add("rahul");
		System.out.println(ar3.get(0));
		
		//ArrayList<E> ar4= new ArrayList<E>();
		
		//ar4.add(3);
		
		Employee e1= new Employee("Rahul", "QA", 1);
		Employee e2 = new Employee("Vivek" ,"Admin" ,2);
		
		System.out.println("*******************");
		
		ArrayList<Employee> ar4= new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		
		Iterator<Employee> it= ar4.iterator();
		
		while(it.hasNext())
		{
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.desg);
			System.out.println(emp.no);
		}
		//Employee e3 = new Employee("Satihs" ,"BI" ,2);
		
		ArrayList<String> ar5= new ArrayList<String>();
		ar5.add("Rohit");
		ar5.add("Santohs");
		
		
		
		ArrayList<String> ar6= new ArrayList<String>();
		ar6.add("Rohitsssssss");
		ar6.add("Santohsssssssss");
		ar6.addAll(ar5);
		
		System.out.println("#########3");
		
		for(int i=0; i<ar6.size();i++)
		{
			System.out.println(ar6.get(i));
		}
		
		System.out.println("#######Remvoe");
		
		ar6.removeAll(ar5);
		for(int i=0; i<ar6.size();i++)
		{
			System.out.println(ar6.get(i));
		}
		
		
	}
	

	}
