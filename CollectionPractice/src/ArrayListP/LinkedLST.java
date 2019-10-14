package ArrayListP;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLST {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		LinkedList<String> ll= new LinkedList();
		
		ll.add("Test");
		ll.add("Selenium");
		ll.add("Webdrvier");
		ll.add("QTP");
		System.out.println("Contecnt of Linkedlist" +ll);
		
		ll.addFirst("Manual Testing");
		ll.addLast("Delliver Applicaiton");
		System.out.println("Merged content =" +ll);
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		//ll.remove(3);
		
		//System.out.println("Removed content "+ll);
		
		Iterator<String> it=ll.iterator();
		
		System.out.println("****Itrator ");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		System.out.println("****Itrator For loop");
		
		for(int i=0; i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("**** While loop");
		
		int num=0;
		while(num<ll.size())
		{
			System.out.println(ll.get(num));
			num++;	
		}
	}

}
