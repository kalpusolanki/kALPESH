package exceptionhandling;

public class sample1
{
public static void main(String[] args) 
{
	int num1 = 10;
	int num2 = 0;
	int div= 0;
	
//	int div=num1/num2;
	System.out.println("hii");
	
	
//	int div=num1/num2;
    try 
    {
    	 div = num1/num2;
    }
//	
//	
	catch(ArithmeticException s2)
	{
		System.out.println(s2+"\r proceed");
	}
//    div = num1/num2;
	System.out.println("hi");
   System.out.println(num1/num2);
	
}
}
