package rough;

public class primenumber2
{
public static void main(String[] args) 
{   int n= 71;

	for(int i=2;i<=n;i++)
	{
		
		boolean s=true;
		for(int j=2;j<=i/2;j++)
		{	
	
			if(i%j==0)
			
			{
				System.out.println(i+" not prime");
				s=false;
				break;
			}
		}
		if(s)
		{
			System.out.println(i+"  is prime");
		}
	}
}
}
