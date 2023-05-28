package UDConswitandwithoutparam;

public class Sample1 
{
//step 1 declaration of variable
	
	int a;
	int b;
	
	//step 2 variable initialization
	// use 1 --------> initialize global variable
	// use 2 ---------> copy /load all object into a class
	
	Sample1()
	{
		a=110;
		b=55;
	}
	
	public static void main(String[] args) 
	{
		Sample1 O2 = new Sample1();
				O2.M1();
		
		// Sample1 -----> class name ---> datatype
				//O2 -------> object name ------> to identify or refer object
				// new -------> keyword ----------> use to create an empty object
				//Sample1 -----------userdefined constructor call
				
			O2.M2();
			O2.M3();
				
				
	}
	
	// step 3 usage
	public void M1() 
	{
		System.out.println(a+b);
	}
	// step 3 usage
	public void M2() 
	{
		System.out.println(a*b);
	}
	public void M3() 
	{
		System.err.println(a/b);
	}
}
