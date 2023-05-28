package Rakhiexample;

public class reversenumber3
{public static void main(String[] args) 
{
	
int n=5249;
int a= 0;
int rem = 0;

while (n!=0)
  {
	rem= n%10;
	n=n/10;
	a=a*10+rem;
	
	}
System.out.println(a);
}
}