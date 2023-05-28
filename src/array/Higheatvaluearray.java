package array;

import java.util.Arrays;

public class Higheatvaluearray 
{
public static void main(String[] args)
{
	int a[]={21,41,56,17,25};
	int temp;
	
Arrays.sort(a);
	
	System.out.println(a[4]);
	System.out.println("--------------------------------------------------");
	System.out.println(a[a.length-1]); // for highest no
	System.out.println("--------------------------------------------------");
	System.out.println(a[0]);  // for lowest number
}
}
