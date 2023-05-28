package array;

import java.util.Arrays;

public class sample4 
{
         public static void main(String[] args) 
         {
			int ar[]=new int[4];
			//type of object  array object name = blank object array size [4] declaration
			
			ar[0]=40;
			ar[1]=25;
			ar[2]=56;
			ar[3]=35;
			
			// print original information
			for (int i = 0;i<= ar.length-1;i++)
			{
				System.out.println(ar[i]);
			}
    System.out.println("------------------------------------------------");    	
    
            Arrays.sort(ar);
            
            
            //print info in ascending order
            
            for (int i = 0;i<= ar.length-1;i++)
			{
				System.out.println(ar[i]);
			}
            System.out.println("------------------------------------------------");    	     
      // For descending order   
            
            for (int i = ar.length-1;i>= 0;i--)
			{
				System.out.println(ar[i]);
			}
		}
}
