package UDConswitandwithoutparam;

public class UDconswithoutparam 
{
//step 1 Declaration of variable.
	int a;
	int b;
	
	
	//step 2 variable initialization
	//user defined constructor ->provided by user
	//Use1 ----- initialize global variable
	//use2 -----> copy /load all members of class into object.
	
	UDconswithoutparam ()
	{
		a=25;
		b=35;
	}
	
public static void main(String[] args)
{
	UDconswithoutparam O1 =new UDconswithoutparam();
	O1.M1();
	
	
}	
	
	// step 3-----> usage
	public void M1() 
	{
		System.out.println(a-b);
		System.out.println(a+b);
		System.err.println(a*b);         // first its print
	}
	
	
	
	
	
	
	
	
}
