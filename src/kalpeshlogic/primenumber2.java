package kalpeshlogic;

public class primenumber2 
{
	public static void main(String[] args)
	{
		int a=100;
		
		for(int i=2;i<=a;i++)
		{
			boolean isprime=true;
//			System.out.println("i"+i);
			for(int j=2;j<=i/2;j++)
			{
//				System.out.println("j"+j);
				
				if(i%j==0)
//			{{	System.out.println("not prime");
				{	isprime=false;
				break;
			}
			}
			if(isprime)
				
			{
				System.out.println(i+"    is prime");
			}
			
			
		}
		
		
		
		
		
		
		
	}


}
