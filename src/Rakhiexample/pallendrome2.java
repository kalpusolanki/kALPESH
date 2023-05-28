package Rakhiexample;

public class pallendrome2 
{
	public static void main(String[] args)
	{
	int n= 51515;
	int temp = n;
	int rem = 0;
	int a =0 ;
	for(;n!=0;)
	{
		rem=n%10;
		n=n/10;
		a= a*10+rem;
	}
		if ( temp == a)
		{
			System.out.println("paleendrom");
		}
		else
		{
			System.out.println("NOT pallendrome");
		}	
	
}

}
