package exceptionhandling;

public class sample2 
{
public static void main(String[] args) 
{
	String s1="abcd";
	
	System.out.println("hii");
// exception handled java.lang.StringIndexOutOfBoundsException: Index 6 out of bounds for length 4
	try 
	{
	System.out.println(s1.charAt(6));//risky code
	}
	catch(StringIndexOutOfBoundsException a1) // a1 is the object name to store exception
	{
		System.out.println(a1);
		System.out.println("print rest of the code");
	}

	System.out.println("hiii");
	System.out.println(s1.charAt(6));
}
}
