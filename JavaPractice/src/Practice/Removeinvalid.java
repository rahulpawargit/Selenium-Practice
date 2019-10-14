package Practice;

public class Removeinvalid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="4324234DFSDAFSDS";
		s=s.replaceAll("[^a-zA-Z]", "");
		System.out.println(s);

	}

}
