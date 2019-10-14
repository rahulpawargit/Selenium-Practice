package Practice;

public class Reverse {

	public static void main(String[] args) {
		String s = "selenium";
//		int len=s.length();
//		String rev="";
//		
//		for(int i=len-1; i>=0;i--)
//		{
//			rev=rev + s.charAt(i);
//		}
//		
//		System.out.println(rev);
		
		int len=s.length();
		String rev="";
		for(int i=len-1; i>=0;i--)
		{
			rev=rev+ s.charAt(i);
		}
		System.out.println(rev);
	}

}
