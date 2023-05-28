package exceptionhandling;

public class sample5 
{public static void main(String[] args) 
{
String s1 ="abcd";
	
	
	try
	{
		System.out.println(s1.charAt(5));
	}
	catch(Exception e) 
	{ e.printStackTrace();                             // to find which type of error
		System.out.println("gemeric exception handled");
	}
	
	System.out.println("hiii");
	System.out.println("hello");
}
	
}
