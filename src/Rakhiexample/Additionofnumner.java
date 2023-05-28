package Rakhiexample;

public class Additionofnumner
{
public static void main(String[] args) 
{
	int n = 145285;
	int a = 0;
	int rem = 0;
	
	while (n!=0)
	{
		rem=n%10;
		n=n/10;
		a=a+rem;
		
		
	}
	System.out.println(a);
}
}
