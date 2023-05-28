package Rakhiexample;

public class Amstrongnumber 
{
public static void main(String[] args) 
   {int S= 153;
	int n = 153;
	int rem=0;	
	int a=0;
	int b=0;
	while(n!=0)
	{
		rem=n%10;
		n=n/10;
		a=( rem*rem*rem);
		b=a+b;
		
		
	}
	System.out.println(b);
	if(b ==S )
	{
		System.out.println("Amstom");
	}
	else
	{
		System.out.println("not amstormg");
	}
			
   }
}
