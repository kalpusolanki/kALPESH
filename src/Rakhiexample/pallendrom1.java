package Rakhiexample;

public class pallendrom1 
{
	public static void main(String[] args)
{   
   	int n=1212;
   	int teamp = n;
     int rem =0;
     int a =0;
     while(n!=0)
     {
     rem=n%10;
   	 n=n/10;
   	 a=a*10+rem;
}
     
if (teamp==a)
   {
	System.out.println("number is pallendrome");
   }
else 
  {
	System.out.println("number is NOT pallendrome");
	}

}

}
