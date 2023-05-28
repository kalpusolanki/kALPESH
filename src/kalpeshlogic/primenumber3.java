package kalpeshlogic;

public class primenumber3 
{
	public static void main(String[] args) 
	{
		
	
int n=200;

for(int i=2;i<=n;i++)
{
	boolean c=true;
	for(int j=2;j<=i/2;j++)
	if(i%j==0)
	{
	System.out.println( i+"  is not prime");
	c=false;
	break;
	}
	if(c)
	{
		System.out.println(i + " is prime");
		}
}

	}
	
}

