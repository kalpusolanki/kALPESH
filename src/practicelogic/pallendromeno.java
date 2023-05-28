package practicelogic;

public class pallendromeno 
{
public static void main(String[] args) 
{
	int n= 51515;
	int c = n;
	int rem = 0;
	int a=0;
	
	while(n!=0)
	{
		rem=n%10;
		n=n/10;
		a=a*10+rem;
				
	}
	
	if ( a == c)
	{
		System.out.println("pallandrome");
	}
	else
	{
		System.out.println("not pallendrome");
	}
		
}
}
