package practicelogic;

public class reversenumber
{
public static void main(String[] args)
  {
	
	int n =21568;
	int a=0;
	int rem = 0;
	while(n!= 0)
	{
		rem=n%10;
		n=n/10;
		a=a*10+rem;
		
	}
	
	System.out.println(a);
  }
}
