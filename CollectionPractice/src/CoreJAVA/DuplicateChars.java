package CoreJAVA;

public class DuplicateChars {

	public static void main(String[] args) {
		
		
		String s="rahulpawar";
		int cnt=0;
		 char[] ch= s.toCharArray();
		 for(int i=0; i<s.length();i++)
		 {
			 for (int j=i; j<=s.length();j++)
			 {
				 if(ch[i]==ch[j])
				 {
					 //System.out.println(ch[j]);
				 cnt++;
				 System.out.println(cnt); 
				 break;
				
				 }
				
			 }
		 }

	}

}