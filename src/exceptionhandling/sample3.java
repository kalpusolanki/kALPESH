package exceptionhandling;

public class sample3 
{public static void main(String[] args) {
	

int [] ar = {10,20,30,40};

try 
	{
	System.out.println(ar[9]);
	}
catch (ArrayIndexOutOfBoundsException s1)

{
	
	System.out.println(s1 +  "\n rest of the code executed");
	}
System.out.println("good night");
System.out.println(ar[6]);
}

// "\n for rnext line execution.
}