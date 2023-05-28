package rough;

public class prime_number2 
{
public static void main(String[] args) 
{
	int n=26;
	int fls=0;
	
	if(n==0||n==1)
	{
		System.out.println(n+" is not prime");
	}
	else 
	{
		for(int i=2;i<=n/2;i++)
		
		{
			if(n%i==0)
			{
				System.out.println(n+"  is not prime");
				fls=1;
				break;
			}
		}
		if(fls==0)
		{
			System.out.println(n+"  is prime");
		}
	}
}

}
