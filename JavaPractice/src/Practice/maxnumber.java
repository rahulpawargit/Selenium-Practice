package Practice;

import java.util.Arrays;

public class maxnumber {

	public static void main(String[] args) 
	{
	 int a[]={2,4,6,7,9,3};
	 int min = 1;
	 
//	 for(int i=0;i<a.length;i++)
//	 {
//		 min=Math.min(min, a[i]);
//	 }
//	 System.out.println(min);
	 
	 Arrays.sort(a);
	 System.out.println(a[0]);
	 System.out.println(a[a.length-1]);
	 
		// TODO Auto-generated method stub

	}

}
