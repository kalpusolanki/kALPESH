package array;

import java.util.Arrays;

public class sample7 
{
 public static void main(String[] args) 
 {
	String ar[] = {"ganpat","chal","Daru","La","thoda","soada","pani","mila"};
	 
	 System.out.println(ar[5]);
	 
	 System.out.println(ar.length);
	 
	 
	 System.out.println("-------------------------------");
	 for(int i=0 ;i<=ar.length-1;i++)
	 {
		 System.out.println(ar[i]);
	 }
	 
	 
	 System.out.println("-------------------------------");
	 Arrays.sort(ar);
	 
	 
	 for(int i=0 ;i<=ar.length-1;i++)
	 {
		 System.out.println(ar[i]);
	 }
	 // ifrstlly it arrange capital letter then small letter.
 }
}
