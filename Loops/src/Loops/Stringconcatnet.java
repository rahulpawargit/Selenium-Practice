package Loops;

public class Stringconcatnet {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		String x= "Hello";
		String y = "world";
		double c=1.3;
		double d= 2.3;
				
		
		System.out.println(a+b);
		System.out.println(a+b+x);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		
		
		System.out.println(a+x+b+y);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x);
		System.out.println(a+b+x+y+c+d);
		System.out.println(a+b+x+y+(c+d));
		System.out.println(c+d+a+b+x+y);
		System.out.println(a+b+c+d+x+y);
		System.out.println((a+b)+(x+y)+(c+d));
		System.out.println((a+b)+(c+d)+(x+y));
		
	}

}
