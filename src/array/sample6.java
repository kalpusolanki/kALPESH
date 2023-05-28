package array;

import java.util.Arrays;

public class sample6 
{
// array declaration and initialization in one single line
	public static void main(String[] args)
	{
		
		int ar[]= {42,56,48,915,142,100};
		
		Arrays.sort(ar);
		
		for ( int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("----------------------------");
		
		System.out.println(ar.length);
	}
}
