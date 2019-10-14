package Practice;

public class missingarraynumber {

	public static void main(String[] args) {
		int a[]={1,2,3,5};
//		int sum=0;
//		 for(int i=0; i<=a.length;i++)
//		 {
//			 sum=sum + a[i];
//		 }
//		 
//		 System.out.println(sum);
		
		//Addtion of array element
		int sum=0;
		for(int i=1;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println(sum);
		//#############
		
		//Reverse order
		
			
		 int sum1=0;
		 for(int j=0 ; j<=5; j++)
		 {
			 sum1= sum1 + j;
		 }
		 
		 System.out.println(sum1);
		// int number= sum1-sum;
		 System.out.println("missing number is =" +( sum1-sum));
				 
				 

	}

}
