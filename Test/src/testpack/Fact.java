package testpack;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact=1;
		int no=5;
		while (no>0)
		{
			fact=fact*no;
			no--;
		}

		System.out.println( fact);
	}

}
