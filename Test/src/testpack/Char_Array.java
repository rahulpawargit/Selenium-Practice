package testpack;

public class Char_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str[]={"Rahul", "Pawar","Sandeep","Rahul","Pawar"};
		
		for(int i=0; i<str.length; i++)
		{
			for(int j=i+1; j<str.length;j++)
			{
				if(str[i].equals(str[j]))
					str[i].replace("Rahul", "Satish");
					System.out.println(str[i] + str[j]);
			}
			
		}
		
	}

}
