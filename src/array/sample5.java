package array;

import java.util.Arrays;

public class sample5 {
	public static void main(String[] args) {
		
	
	//step 1 array declaration
   	String ar[] =new String [5];
   			
   //step 2 array initialization
   			
   			ar[0] ="ganesh";
   			ar[1] ="bajrang";
   			ar[2] ="ritesh";
   			ar[3] ="ganpat";
   			ar[4] ="ramesh";
   			
   			
   			Arrays.sort(ar);
   			for(int i=0;i<=ar.length-1;i++)
   			{
   				System.out.println(ar[i]);
   			}
}
}