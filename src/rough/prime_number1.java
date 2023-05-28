package rough;

public class prime_number1 
{
public static void main(String[] args) 
{
	M1(25);
}

public static void M1(int n)
{
	int flg =0;
	if(n==0||n==1)
	{
		System.out.println(n+"  is not prime");
	}
	else 
	{
		for(int i=2;i<=n/2;i++)
		
		{
			if(n%i==0)
			{
				System.out.println(n+"  not prime");
			flg=1;
			break;
			}
		}
		if(flg==0)
		{
			System.out.println(n+"  is prime");
		}
	}
	
	
	
	
	
	
	
	
}
}
