package kalpeshlogic;

public class prime_not 
{
public static void main(String[] args)
{
	M1(26);
}
public static void M1(int n) 
{
	int a=2;
	int m=n/a;
	int flag=0;

	if(n==0||n==1)
	{
		System.out.println("not prime");
	}
	else
	{
		for(a=2;a<=m;a++)
		{
			if(n%a==0)
			
		
			{System.out.println("not prime");
			flag=1;
			break;}
		}
		if(flag==0)
		{
			System.out.println("prime");
			}
	}
	
}
}
