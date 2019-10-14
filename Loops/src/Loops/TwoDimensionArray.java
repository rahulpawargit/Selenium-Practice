package Loops;

public class TwoDimensionArray {

	public static void main(String[] args) {
		
		int x[][]=new int[3][4];
		  x[0][0]=1;
		  x[0][1]=2;
          x[0][2]=3;
          
          x[1][0]=11;
          x[1][1]=12;
          x[1][2]=13;
        		  
        		  //System.out.println(x[1][1]);
        		  
        		  for(int row=0;row<=x.length;row++)
        		  {
        			  for (int col=0; col<=x.length;col++)
        			  {
        				  System.out.println(x[row][col]);
        			  }
        		  }
	}

}
