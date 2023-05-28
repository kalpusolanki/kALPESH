package exceptionhandling;

public class sample4 
{
public static void main(String[] args)

{
	String s1 ="abcd";
	
	
	try
	{
		System.out.println(s1.charAt(5));
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("exception handled A");
	}
	catch(ArithmeticException e) 
	{
		System.out.println("exception handled B");
	}
	catch(StringIndexOutOfBoundsException e) 
	{
		System.out.println("exception handled C");
	}
	
	
	System.out.println("Hiiii");
	System.out.println("hello");
}


}
