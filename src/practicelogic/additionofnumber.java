package practicelogic;

public class additionofnumber 
{
public static void main(String[] args)
      {
	      int n =52439;
	      int rem = 0;
	      int a=0;
	
	while (n!=0)
	        {
		rem=n%10;
		n=n/10;
		a=a+rem;
		
		
	        }
	System.out.println(a);
      }
}
