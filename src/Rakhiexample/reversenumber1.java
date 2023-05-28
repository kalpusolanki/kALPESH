package Rakhiexample;

public class reversenumber1 
{
public static void main(String[] args) 
{  int n = 1526;
   int rem =0;
   int a=0;
	for (;n!=0;)
	{
		rem= n%10;
		n=n/10;
		a=a*10+rem;
		
	}
	System.out.println(a);
}
}
