package kalpeshlogic;

public class primenumber1 
{
	public static void prime(int n) 
	{
		int a = 2;
		int m = n/a;
	int c =0 ;

		if(n == 0 || n == 1)
			
		{
			System.out.println("not prime");
		}
		else
		{
			for (a = 2;a <= m;a++)
				
			{
				if (n%a == 0) 
				{
					System.out.println("not prime");
				    c =  1;
					break;
				}
				
			}
			if (c == 0) 
			{
				System.out.println(" prime");
			}
		}
	}

	public static void main(String[] args) 
	{
		prime(26);          
	}
}
